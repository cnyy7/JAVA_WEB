<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<head>
    <link href="https://vjs.zencdn.net/7.4.1/video-js.css" rel="stylesheet">
    <link rel="stylesheet" href="/static/css/bootstrap.css">

    <title>Title</title>
    <!-- If you'd like to support IE8 (for Video.js versions prior to v7) -->
    <%--<script src="https://vjs.zencdn.net/ie8/ie8-version/videojs-ie8.min.js"></script>--%>
    <style>
        .col-center-block {
            float: none;
            display: block;
            margin-left: auto;
            margin-right: auto;
        }
    </style>

</head>

<body>
<div class="row col-center-block mb-3" style="text-align: center;">
    <h1>Videos Of Us</h1>
    <a href="/index">goback to index</a>
</div>

<div class="row mb-5">
    <div class="container" style="border: #0c5460">
        <video id="us1" class="video-js  m-auto" controls preload="auto" width="640" height="300"
               poster="/static/images/us11.jpg" data-setup="{}">
            <source src="/static/images/us1.mp4" type='video/mp4'>
            <p class="vjs-no-js">
                To view this video please enable JavaScript, and consider upgrading to a web browser that
                <a href="https://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
            </p>
        </video>
    </div>
</div>
<div class="row mb-5">
    <div class="container" style="border: #0c5460">
        <video id="us2" class="video-js  m-auto" controls preload="auto" width="640" height="300"
               poster="/static/images/us22.jpg" data-setup="{}">
            <source src="/static/images/us2.mp4" type='video/mp4'>
            <p class="vjs-no-js">
                To view this video please enable JavaScript, and consider upgrading to a web browser that
                <a href="https://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
            </p>
        </video>
    </div>
</div>
<div class="row mb-5">
    <div class="container" style="border: #0c5460">
        <video id="us3" class="video-js  m-auto" controls preload="auto" width="640" height="300"
               poster="/static/images/us33.jpg" data-setup="{}">
            <source src="/static/images/us3.mp4" type='video/mp4'>
            <p class="vjs-no-js">
                To view this video please enable JavaScript, and consider upgrading to a web browser that
                <a href="https://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
            </p>
        </video>
    </div>
</div>
<div class="row mb-5">
    <div class="container" style="border: #0c5460">
        <video id="us4" class="video-js  m-auto" controls preload="auto" width="640" height="300"
               poster="/static/images/us44.jpg" data-setup="{}">
            <source src="/static/images/us4.mp4" type='video/mp4'>
            <p class="vjs-no-js">
                To view this video please enable JavaScript, and consider upgrading to a web browser that
                <a href="https://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
            </p>
        </video>
    </div>
</div>
<div class="row mb-5">
    <div class="container" style="border: #0c5460">
        <video id="us5" class="video-js  m-auto" controls preload="auto" width="640" height="300"
               poster="/static/images/us55.jpg" data-setup="{}">
            <source src="/static/images/us5.mp4" type='video/mp4'>
            <p class="vjs-no-js">
                To view this video please enable JavaScript, and consider upgrading to a web browser that
                <a href="https://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
            </p>
        </video>
    </div>
</div>

<script src="https://vjs.zencdn.net/7.4.1/video.js"></script>
<script src="/static/js/vendor/jquery.min.js"></script>
<script src="/static/js/vendor/bootstrap.min.js"></script>

</body>
</html>
