package com.chennan.mysite.cnyy.controller;

import com.chennan.mysite.cnyy.mybatis.service.CourseService;
import com.chennan.mysite.cnyy.mybatis.service.SkillService;
import com.chennan.mysite.cnyy.mybatis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

import static com.chennan.mysite.cnyy.controller.WebSecurityConfig.*;

/**
 *
 */
@Controller
public class MainController {

    private Logger log = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private SkillService skillService;

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String index(HttpServletRequest request) {
        HttpSession session = request.getSession();
        skillService.addSkillsToSession(session);
        courseService.addCoursesToSession(session);
        return "index";
    }

    @GetMapping("/register")
    public String toregister(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute(SESSION_USER_KEY);
        if (username != null) {
            skillService.addSkillsToSession(session);
            courseService.addCoursesToSession(session);
            return "redirect:/index";
        }
        return "register";
    }

    @PostMapping("/register")
    public String register(Model model,
                           @RequestParam String username, @RequestParam String password, @RequestParam String email, @RequestParam(defaultValue = USER_TYPE_NORMAL) String type) {

        Map<String, String> msg = userService.register(username, password, email, type);
        if (msg.get(SESSION_MSG_KEY).equalsIgnoreCase(SUCCESS)) {
            return "login";
        } else {
            model.addAttribute(SESSION_MSG_KEY, msg.get(SESSION_MSG_KEY));
            model.addAttribute(SESSION_MSG_EMAIL_KEY, msg.get(SESSION_MSG_EMAIL_KEY));
            return "register";
        }
    }

    @GetMapping("/login")
    public String tologin(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute(SESSION_USER_KEY);
        if (username != null) {
            skillService.addSkillsToSession(session);
            courseService.addCoursesToSession(session);
            return "redirect:/index";
        }
        return "login";
    }

    @PostMapping("/toindex")
    public ModelAndView login(HttpServletRequest request, HttpSession session, Model model, HttpServletResponse response,
                              @RequestParam String username, @RequestParam String password) {
        Map<String, String> msg = userService.login(username, password);
        log.info(msg.toString());
        model.addAttribute(SESSION_MSG_KEY, msg);
        if (msg.get(SESSION_MSG_KEY).equalsIgnoreCase(SUCCESS)) {
            // 设置 name 和 url cookie
            Cookie name = new Cookie(SESSION_USER_KEY,
                    username);
            Cookie url = new Cookie("url",
                    request.getParameter("url"));
            Cookie type = new Cookie(SESSION_USERTYPE_KEY,
                    msg.get(SESSION_USERTYPE_KEY));

            // 设置cookie过期时间为24小时。
            name.setMaxAge(COOKIE_MAX_AGE);
            url.setMaxAge(COOKIE_MAX_AGE);
            type.setMaxAge(COOKIE_MAX_AGE);
            // 在响应头部添加cookie
            response.addCookie(name);
            response.addCookie(url);
            response.addCookie(type);
            session.setAttribute(SESSION_USER_KEY, username);
            skillService.addSkillsToSession(session);
            courseService.addCoursesToSession(session);
            session.setAttribute(SESSION_USERTYPE_KEY, msg.get(SESSION_USERTYPE_KEY));
            //            view.addObject("username", username);
            return new ModelAndView("index");
        } else {
            ModelAndView view = new ModelAndView("login");
            view.addObject(SESSION_MSG_KEY, msg.get(SESSION_MSG_KEY));
            return view;
        }
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        // 移除cookie
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equalsIgnoreCase(SESSION_USER_KEY)) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            } else if (cookie.getName().equalsIgnoreCase(SESSION_USERTYPE_KEY)) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
        // 移除session
        session.removeAttribute(SESSION_USER_KEY);
        session.removeAttribute(SESSION_USERTYPE_KEY);
        skillService.addSkillsToSession(session);
        courseService.addCoursesToSession(session);
        return "redirect:/index";
    }

}