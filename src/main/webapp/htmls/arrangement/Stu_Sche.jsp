<!-- 学生课表-->
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

    <!-- Bootstrap Core CSS-->
    <link href="../../css/common_css/bootstrap_css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS-->
    <link href="../../css/common_css/sidebar_css/sidebar.css" rel="stylesheet">

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
            <li>
                <a href="javascript:" data-toggle="collapse" data-target="#arrangement">排课系统</a>
                <ul id = "arrangement" class="collapse">
                    <li>
                        <a href="../../htmls/arrangement/Stu_Sche.jsp">学生课表</a>
                    </li>
                    <li>
                        <a href="../../htmls/arrangement/Stu_Maj.jsp">学生专业推荐课表</a>
                    </li>
                    <li>
                        <a href="../../htmls/arrangement/Tea_Sche.jsp">教师授课课表</a>
                    </li>
                    <li>
                        <a href="../../htmls/arrangement/Tea_Maj.jsp">教师专业推荐课表</a>
                    </li>
                    <li>
                        <a href="../../htmls/arrangement/Adm_Arrange.jsp">排课</a>
                    </li>
                    <li>
                        <a href="../../htmls/arrangement/Adm_Room.jsp">教室使用情况</a>
                    </li>
                    <li>
                        <a href="../../htmls/arrangement/Adm_TempArrange.jsp">临时活动教室安排</a>
                    </li>
                    <li>
                        <a href="../../htmls/arrangement/Adm_TeaData.jsp">教师上课数据统计</a>
                    </li>
                    <li>
                        <a href="../../htmls/arrangement/Adm_RoomData.jsp">教室使用情况相关数据统计</a>
                    </li>
                </ul>
            </li>

            <!-- 毕设管理子系统 -->
            <li>
                <a href="javascript:" data-toggle="collapse" data-target="#graduate">毕业设计管理</a>
                <ul id = "graduate" class="collapse">
                    <li>
                        <a href="htmls/graduate/select.jsp">查看选题 </a>
                    </li>
                    <li>
                        <a href="htmls/graduate/grade.jsp">查看成绩</a>
                    </li>
                    <li>
                        <a href="htmls/graduate/submit.jsp">提交毕业设计文档</a>
                    </li>
                    <li>
                        <a href="htmls/graduate/result.jsp">查看选题情况</a>
                    </li>
                    <li>
                        <a href="htmls/graduate/judge.jsp">评定成绩</a>
                    </li>
                    <li>
                        <a href="htmls/graduate/publish.jsp">提交毕设题目</a>
                    </li>
                    <li>
                        <a href="htmls/graduate/check.jsp">查看统计信息</a>
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

            <!-- 退出 -->
            <li>
                <a href="htmls/login.jsp">退出</a>
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
                    <div class="container">
                        <nav class="navbar navbar-default" role="navigation">
                            <div class="container-fluid">
                                <form class="navbar-form navbar-left">
                                    <a  href="#menu-toggle" class="btn btn-default" id="menu-toggle">菜单</a>
                                </form>
                                <form class="navbar-form navbar-right">
                                    <p  class="btn disabled" >学生课表</p>
                                </form>
                            </div>
                        </nav>
                        <table class="table table-hover" >
                            <thead>
                            <tr>
                                <th colspan="2">时间</th>
                                <th>星期一</th>
                                <th>星期二</th>
                                <th>星期三</th>
                                <th>星期四</th>
                                <th>星期五</th>
                            </tr>
                            </thead>
                            <tbody>
                            <th rowspan="4">上午</th>
                            <th>第1节</th>
                            <td>--</td>
                            <td>--</td>
                            <td>--</td>
                            <td>--</td>
                            <td>--</td>
                            </tr>
                            <tr>
                                <th>第2节</th>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                            </tr>
                            <tr>
                                <th>第3节</th>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                            </tr>
                            <tr>
                                <th>第4节</th>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                            </tr>
                            <tr>
                                <th rowspan="4">下午</th>
                                <th>第5节</th>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                            </tr>
                            <tr>
                                <th>第6节</th>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                            </tr>
                            <tr>
                                <th>第7节</th>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                            </tr>
                            <tr>
                                <th>第8节</th>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                            </tr>
                            <tr>
                                <th rowspan="2">晚上</th>
                                <th>第9节</th>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                            </tr>
                            <tr>
                                <th>第10节</th>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                                <td>--</td>
                            </tr>
                            </tbody>
                        </table>

                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- /#page-content-wrapper -->



    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="../../js/common_js/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../../js/common_js/bootstrap_js/bootstrap.min.js"></script>

    <!-- Menu Toggle Script -->
    <script>
        $("#menu-toggle").click(function(e) {
            e.preventDefault();
            $("#wrapper").toggleClass("toggled");
        });
    </script>
    <script>
        function myfunction(){
            alert("提交成功！");
        }
    </script>
</div>
</body>

</html>

