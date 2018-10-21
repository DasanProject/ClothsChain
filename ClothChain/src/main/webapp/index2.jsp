<!DOCTYPE html>
<html lang="en">
<head>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>供应链管理系统 | </title>

    <!-- Bootstrap -->
    <link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="vendors/nprogress/nprogress.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="build/css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md">
<div class="container body" style="height: 100%">
    <div class="main_container" >
        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">
                <div class="navbar nav_title" style="border: 0;">
                    <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>供应链管理系统</span></a>
                </div>

                <div class="clearfix"></div>

                <!-- menu profile quick info -->
                <div class="profile clearfix">
                    <div class="profile_pic">
                        <img src="images/aaa.jpg" alt="..." class="img-circle profile_img">
                    </div>
                    <div class="profile_info">
                        <span>Welcome,</span>
                        <h2>John Doe</h2>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <!-- /menu profile quick info -->

                <br />

                <!-- sidebar menu -->
                <!-- sidebar menu -->
                <div id="sidebar-menu" class="main_menu_side hidden-print main_menu" >
                    <div class="menu_section">
                        <h3>导航菜单</h3>
                        <ul class="nav side-menu">
                            <li><a><i class="fa fa-clone"></i>样板管理<span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="cmy_addSamplelist.jsp" target="aaa">开发订单</a></li>
                                    <li><a href="cmy_selectSamplelist.jsp" target="aaa">订单明细</a></li>
                                    <li><a href="my_selectSamplelist.html" target="aaa">成本预算</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-edit"></i> 订单管理 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="form.html" target="aaa">订单信息</a></li>
                                    <li><a href="form_advanced.html" target="aaa">订单跟踪</a></li>
                                    <li><a href="form_validation.html" target="aaa">请购单</a></li>
                                    <li><a href="form_wizards.html" target="aaa">请购单审批</a></li>
                                    <li><a href="form_upload.html" target="aaa">警示时间</a></li>
                                    <li><a href="form_buttons.html" target="aaa">生产计划</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-desktop"></i> 采购管理 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="general_elements.html" target="aaa">采购任务</a></li>
                                    <li><a href="media_gallery.html" target="aaa">汇总清单</a></li>
                                    <li><a href="typography.html" target="aaa">采购审批</a></li>
                                    <li><a href="icons.html" target="aaa">入库结算申请</a></li>
                                    <li><a href="glyphicons.html" target="aaa">供应商对账</a></li>
                                    <li><a href="widgets.html" target="aaa">入库结算审核</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-table"></i> 库存管理 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="tables.html" target="aaa">材料入库</a></li>
                                    <li><a href="tables_dynamic.html" target="aaa">库存查询</a></li>
                                    <li><a href="tables_dynamic.html" target="aaa">库存解锁</a></li>
                                    <li><a href="tables_dynamic.html" target="aaa">待入库清单</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-bar-chart-o"></i> 财务管理 <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="chartjs.html" target="aaa">采购单确认</a></li>
                                    <li><a href="chartjs2.html" target="aaa">入库结算</a></li>
                                    <li><a href="morisjs.html" target="aaa">入库结算审批</a></li>
                                    <li><a href="echarts.html" target="aaa">订单收款确认</a></li>
                                    <li><a href="other_charts.html" target="aaa">应收账款</a></li>
                                    <li><a href="other_charts.html" target="aaa">应付账款</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-clone"></i>生产管理<span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="fixed_sidebar.html" target="aaa">领料申请</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">领料审批</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">生产进度</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">裁剪记录</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">裁剪发货</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">已申请未出库</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-clone"></i>流水线管理<span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="fixed_sidebar.html" target="aaa">不良问题录入</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">生产看板</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">检验看板</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">流水线交货</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">检测记录</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">交货记录</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-clone"></i>后道管理<span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="fixed_sidebar.html" target="aaa">收货确认</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">成品入库</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">出货通知</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">成品出货</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">成品库存</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-clone"></i>基础数据<span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="lxy_queryCustomer.jsp" target="aaa">客户管理</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-clone"></i>系统设置<span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="fixed_sidebar.html" target="aaa">用户管理</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">角色管理</a></li>
                                    <li><a href="fixed_footer.html" target="aaa">单据设置</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>


                </div>
                <!-- /sidebar menu -->

                <!-- /menu footer buttons -->
                <div class="sidebar-footer hidden-small">
                    <a data-toggle="tooltip" data-placement="top" title="Settings">
                        <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                        <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="Lock">
                        <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                        <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                    </a>
                </div>
                <!-- /menu footer buttons -->
            </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav" style="padding-top: 0px;margin-top: 0px">
            <div class="nav_menu">
                <nav>
                    <div class="nav toggle">
                        <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                    </div>

                    <ul class="nav navbar-nav navbar-right">
                        <li class="">
                            <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                <img src="images/img.jpg" alt="">John Doe
                                <span class=" fa fa-angle-down"></span>
                            </a>
                            <ul class="dropdown-menu dropdown-usermenu pull-right">
                                <li><a href="javascript:;" target="aaa"> 消息</a></li>
                                <li>
                                    <a href="javascript:;">

                                        <span>设置</span>
                                    </a>
                                </li>
                                <li><a href="javascript:;">帮助</a></li>
                                <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> 退出</a></li>
                            </ul>
                        </li>

                        <li role="presentation" class="dropdown">
                            <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                                <i class="fa fa-envelope-o"></i>
                                <span class="badge bg-green">6</span>
                            </a>
                            <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">


                                <li>
                                    <div class="text-center">
                                        <a>
                                            <strong>See All Alerts</strong>
                                            <i class="fa fa-angle-right"></i>
                                        </a>
                                    </div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
        <!-- /top navigation -->

        <!-- page*****************右中部分content ***********-->
        <div class="right_col" role="main" style="height: 100%;margin-right: 0px;padding-right: 0px;padding-top:0px;margin-top: 0px">

<%--
            <iframe src="index2.jsp" name="aaa"frameborder="0"scrolling="auto" style="padding:0px;margin:0px;width:100%;" ></iframe>
--%>
    <iframe src="index2.jsp" frameborder="0" scrolling="auto" name="aaa" id="myiframe" onload="setIframeHeight(this)"style="padding:0px;margin:0px;width:100%;" ></iframe>
        </div>
        </div>
        <!-- /page content -->
        <!-- footer content -->
        <footer>
            <div class="pull-right">
                Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com">Colorlib</a>
            </div>
            <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
    </div>
</div>

<!-- jQuery -->
<script src="vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="vendors/fastclick/lib/fastclick.js"></script>
<!-- NProgress -->
<script src="vendors/nprogress/nprogress.js"></script>

<!-- Custom Theme Scripts -->
<script src="build/js/custom.min.js"></script>
</body>
</html>

<script>
    // document.domain = "caibaojian.com";
    function setIframeHeight(iframe) {
        if (iframe) {
            var iframeWin = iframe.contentWindow || iframe.contentDocument.parentWindow;
            if (iframeWin.document.body) {
                iframe.height = iframeWin.document.documentElement.scrollHeight || iframeWin.document.body.scrollHeight;
            }
        }
    };

    window.onload = function () {
        setIframeHeight(document.getElementById('external-frame'));
    };
</script>
<%--
<script type="text/javascript">

    $(function(){
        changeWH();
    });

    function changeWH(){

        $("#myiframe").height($(document).height());
        $("#myiframe").width($(document).width());
    }

    window.onresize=function(){
        changeWH();

    }

</script>
--%>
