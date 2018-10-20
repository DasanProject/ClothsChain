<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-10-20
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- CSS -->
<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/form-elements.css">
<link rel="stylesheet" href="assets/css/style.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->

<!-- Favicon and touch icons -->
<link rel="shortcut icon" href="assets/ico/favicon.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
<html>
<head>
    <title>Title</title>
</head>
<body>

<!-- Content -->
<div class="top-content">

    <div class="inner-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text">
                    <a class="logo" href="index.html"></a>
                    <h1><strong>供应链</strong> 管理系统</h1>
                    <div class="description">
                        <p>
                            supply chain is a free responsive modal registration form made with login.
                            Register it on <a href="#"><strong>Admin</strong></a>, customize and use it as you like!
                        </p>
                    </div>
                    <div class="top-big-link">
                        <a class="btn btn-link-1 launch-modal" href="#" data-modal-id="modal-register">login</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<!-- MODAL弹出 -->
<div class="modal fade" id="modal-register" tabindex="-1" role="dialog" aria-labelledby="modal-register-label" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">

            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
                </button>
                <h3 class="modal-title" id="modal-register-label">WelCome|欢迎</h3>
                <p>请输入用户名密码:</p>
            </div>

            <div class="modal-body">

                <form role="form" action="" method="post" class="registration-form">
                    <div class="form-group">
                        <label class="sr-only" for="UserName">Name</label>
                        <input type="text" name="UserName" placeholder="Name..." class="UserName form-control" id="UserName">
                    </div>
                    <div class="form-group">
                        <label class="sr-only" for="form-last-name"> Password </label>
                        <input type="text" name="form-last-name" placeholder="PassWord..." class="form-last-name form-control" id="form-last-name">
                    </div>

                    <button type="submit" class="btn">确认登陆!</button>
                </form>

            </div>

        </div>
    </div>
</div>


<!-- Javascript -->
<script src="assets/js/jquery-1.11.1.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/js/jquery.backstretch.min.js"></script>
<script src="assets/js/scripts.js"></script>

<!--[if lt IE 10]>
<script src="assets/js/placeholder.js"></script>
<![endif]-->

</body>
</html>
