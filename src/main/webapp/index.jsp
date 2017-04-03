<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>欢迎进入教务管理系统</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/common_css/bootstrap_css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/common_css/sidebar_css/sidebar.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div id="wrapper">

    <!-- Sidebar -->
    <div id="sidebar-wrapper">
        <ul class="sidebar-nav">

            <!-- 标题 -->
            <li class="sidebar-brand">
                <a href="#">
                    教务管理系统
                </a>
            </li>

            <!-- 排课子系统 -->
            <li>
            </li>

            <!-- 毕设管理子系统 -->
            <li>
                <a href="javascript:" data-toggle="collapse" data-target="#arrangement">毕业设计管理</a>
                <ul id = "arrangement" class="collapse">
                    <li>
                        <a href="htmls/graduate/">查看选题</a>
                    </li>
                    <li>
                        <a href="htmls/graduate/">查看毕设成绩</a>
                    </li>
                    <li>
                        <a href="htmls/graduate/">毕业设计选题</a>
                    </li>
                    <li>
                        <a href="htmls/graduate/">查看选题情况</a>
                    </li>
                    <li>
                        <a href="htmls/graduate/">发布毕设题目</a>
                    </li>
                    <li>
                        <a href="htmls/graduate/">查看学生作品</a>
                    </li>
                </ul>
            </li>

            <!-- 后台管理子系统 -->
            <li>
            </li>

            <!-- 成绩查询子系统 -->
            <li>
            </li>

            <!-- 选课子系统 -->
            <li>
            </li>

            <!-- 登录 -->
            <li>
                <a href="htmls/login.html">登录</a>
            </li>

            <li>
                <a href="#">关于本站</a>
            </li>
        </ul>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <h1>我是样例</h1>
                    <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">菜单</a>
                </div>
            </div>
        </div>
    </div>
    <!-- /#page-content-wrapper -->

</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="js/common_js/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/common_js/bootstrap_js/bootstrap.min.js"></script>

<!-- Menu Toggle Script -->
<script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
</script>
</body>

</html>
