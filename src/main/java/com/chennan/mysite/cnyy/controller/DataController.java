package com.chennan.mysite.cnyy.controller;

import com.chennan.mysite.cnyy.mybatis.entity.Comment;
import com.chennan.mysite.cnyy.mybatis.entity.Course;
import com.chennan.mysite.cnyy.mybatis.entity.Skill;
import com.chennan.mysite.cnyy.mybatis.entity.User;
import com.chennan.mysite.cnyy.mybatis.service.CommentService;
import com.chennan.mysite.cnyy.mybatis.service.CourseService;
import com.chennan.mysite.cnyy.mybatis.service.SkillService;
import com.chennan.mysite.cnyy.mybatis.service.UserService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RestController
@RequestMapping("/data")
public class DataController {
    private Logger log = LoggerFactory.getLogger(DataController.class);

    @Autowired
    private SkillService skillService;

    @Autowired
    private UserService userService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private CommentService commentService;
    @GetMapping("/usersPage")
    public PageInfo<User> lists(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        return userService.getAllUsersPage(pageNo, pageSize);
    }

    @GetMapping("/skillsPage")
    public PageInfo<Skill> listsSkills(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        return skillService.getAllSkillPage(pageNo, pageSize);
    }


    @GetMapping("/skills")
    public List<Skill> listSkills() {
        log.info("call /data/skills");
        List<Skill> skillList=skillService.getAllSkill();
        Map<String,Object> stringObjectMap=new HashMap<>();
        stringObjectMap.put("data",skillList);
        stringObjectMap.put("itemsCount",skillList.size());
        return skillList;
    }

    @GetMapping("/deleteSkill")
    public Integer deleteSkills(@RequestParam Integer skillId) {
        log.info("call /data/deleteSkill");
        return skillService.deletePrimaryKey(skillId);
    }

    @PostMapping("/insertSkill")
    public Skill listSkillss(@RequestParam String skillName,@RequestParam Integer skillScore,@RequestParam Boolean skillShow) {
        Skill skill=new Skill();
        skill.setSkillName(skillName);
        skill.setSkillScore(skillScore);
        skill.setSkillShow(skillShow);
        log.info("call /data/insertSkills");
        skillService.insert(skill);
        return skillService.selectByName(skillName);
    }
    @PostMapping("/updateSkill")
    public Skill listSkillsup(@RequestParam Integer skillId,@RequestParam String skillName,@RequestParam Integer skillScore,@RequestParam Boolean skillShow) {
        Skill skill=new Skill();
        skill.setSkillId(skillId);
        skill.setSkillName(skillName);
        skill.setSkillScore(skillScore);
        skill.setSkillShow(skillShow);
        log.info("call /data/updateSkill");
        skillService.update(skill);
        return skill;
    }
    @GetMapping("/courses")
    public List<Course> listCourses() {
        log.info("call /data/courses");
        List<Course> courseList=courseService.getAllCourse();
        Map<String,Object> stringObjectMap=new HashMap<>();
        stringObjectMap.put("data",courseList);
        stringObjectMap.put("itemsCount",courseList.size());
        return courseList;
    }

    @GetMapping("/deleteCourse")
    public Integer deleteCourses(@RequestParam Integer courseId) {
        log.info("call /data/deleteCourse");
        return courseService.deletePrimaryKey(courseId);
    }

    @PostMapping("/insertCourse")
    public Course listCoursess(@RequestParam String courseName,@RequestParam Integer courseScore,@RequestParam String courseType,@RequestParam String courseTerm,@RequestParam Boolean courseShow) {
        Course course=new Course();
        course.setCourseName(courseName);
        course.setCourseScore(courseScore);
        course.setCourseShow(courseShow);
        course.setCourseType(courseType);
        course.setCourseTerm(courseTerm);
        log.info("call /data/insertCourses");
        courseService.insert(course);
        return courseService.selectByName(courseName);
    }
    @PostMapping("/updateCourse")
    public Course listCoursesup(@RequestParam Integer courseId,@RequestParam String courseName,@RequestParam Integer courseScore,@RequestParam String courseType,@RequestParam String courseTerm,@RequestParam Boolean courseShow) {
        Course course=new Course();
        course.setCourseId(courseId);
        course.setCourseName(courseName);
        course.setCourseScore(courseScore);
        course.setCourseShow(courseShow);
        course.setCourseType(courseType);
        course.setCourseTerm(courseTerm);
        log.info("call /data/updateCourse");
        courseService.update(course);
        return course;
    }
    @GetMapping("/comments")
    public List<Comment> comments()
    {
        return commentService.getAllComment();
    }

    @GetMapping("/deleteComment")
    public Integer deleteComment(@RequestParam Integer commentId)
    {
        return commentService.deletePrimaryKey(commentId);
    }


    @GetMapping("/user/{id}")
    public User selectUserById(@PathVariable("id") Integer id) {
        return userService.selectById(id);
    }

}
