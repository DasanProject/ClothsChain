<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-10-17
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>样衣明细信息</title>
    <style>
        input{
            width: 100px;
        }
        select{
            width: 130px;
        }
    </style>
</head>
<!-- Bootstrap -->
<link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Font Awesome -->
<link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<!-- NProgress -->
<link href="vendors/nprogress/nprogress.css" rel="stylesheet">
<!-- iCheck -->
<link href="vendors/iCheck/skins/flat/green.css" rel="stylesheet">
<!-- bootstrap-wysiwyg -->
<link href="vendors/google-code-prettify/bin/prettify.min.css" rel="stylesheet">
<!-- Select2 -->
<link href="vendors/select2/dist/css/select2.min.css" rel="stylesheet">
<!-- Switchery -->
<link href="vendors/switchery/dist/switchery.min.css" rel="stylesheet">
<!-- starrr -->
<link href="vendors/starrr/dist/starrr.css" rel="stylesheet">
<!-- bootstrap-daterangepicker -->
<link href="vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

<!-- Custom Theme Style -->
<link href="build/css/custom.min.css" rel="stylesheet">
<!-- jQuery -->
<script src="vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="vendors/fastclick/lib/fastclick.js"></script>
<!-- NProgress -->
<script src="vendors/nprogress/nprogress.js"></script>
<!-- bootstrap-progressbar -->
<script src="vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
<!-- iCheck -->
<script src="vendors/iCheck/icheck.min.js"></script>
<!-- bootstrap-daterangepicker -->
<script src="vendors/moment/min/moment.min.js"></script>
<script src="vendors/bootstrap-daterangepicker/daterangepicker.js"></script>
<!-- bootstrap-wysiwyg -->
<script src="vendors/bootstrap-wysiwyg/js/bootstrap-wysiwyg.min.js"></script>
<script src="vendors/jquery.hotkeys/jquery.hotkeys.js"></script>
<script src="vendors/google-code-prettify/src/prettify.js"></script>
<!-- jQuery Tags Input -->
<script src="vendors/jquery.tagsinput/src/jquery.tagsinput.js"></script>
<!-- Switchery -->
<script src="vendors/switchery/dist/switchery.min.js"></script>
<!-- Select2 -->
<script src="vendors/select2/dist/js/select2.full.min.js"></script>
<!-- Parsley -->
<script src="vendors/parsleyjs/dist/parsley.min.js"></script>
<!-- Autosize -->
<script src="vendors/autosize/dist/autosize.min.js"></script>
<!-- jQuery autocomplete -->
<script src="vendors/devbridge-autocomplete/dist/jquery.autocomplete.min.js"></script>
<!-- starrr -->
<script src="vendors/starrr/dist/starrr.js"></script>
<!-- Custom Theme Scripts -->
<script src="build/js/custom.min.js"></script>
<script src="js/vue.js"></script>
<script src="js/vue-resource.js"></script>


<body class="" style="background-color: #F6F6F6;padding-right: 20px;">
<div class="" style="background-color: white;">

    <div class="main_container" style="background-color: white;">

        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">
               <%-- <div class="page-title">

                </div>--%>
            <%--    <div class="clearfix"></div>--%>
                <div class="row">

                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">

                            <div class="x_title row">
                                <div class="title_left col-xs-6" >
                                    <h3>样衣信息明细</h3>
                                </div>

                                <div class="title_right">
                                    <div class="col-md-5 col-sm-5 co-xs-6 form-group pull-right top_search">
                                        <div class="input-group">
                                            <input type="text" class="form-control" placeholder="Search for...">
                                            <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
                    </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class=" col-xs-12">
                                <center>
                                    <table class="table-condensed" style="width: 90%" id="app">
                                        <tr>
                                            <td style="color:red">客户:</td>
                                            <td>
                                                <select name="customerid">
                                                <template v-for="cus in customerlist">
                                                    <option value="cus.customerid">{{cus.customername}}</option>
                                                </template>
                                            </select></td>
                                            <td style="color:red">品牌</td>
                                            <td><select name="brandid">
                                                <template v-for="site in customerlist">
                                                    <option value="site.brandid">{{site.brandname}}</option>

                                                </template>

                                            </select></td>
                                            <td>客户单号</td>
                                            <td><input type="text" name="customerno"></td>
                                            <td style="color:red">开发单号</td>
                                            <td><input name="sampleno" v-model="Sampleno" class="input" readonly="readonly"></td>


                                        </tr>
                                        <tr>
                                            <td>季度</td>
                                            <td>
                                                <select name="quarterlyid">
                                                    <template   v-for="site in customerlist" >
                                                    <option value="site.quarterlyid">{{site.describle}}</option>
                                                    </template>
                                                </select>
                                            </td>
                                            <td style="color:red">款号</td>
                                            <td><input type="text"></td>
                                            <td>款名</td>
                                            <td><input type="text"></td>
                                            <td style="color:red">款式</td>
                                            <td><input type="text"></td>
                                        </tr>
                                        <tr>
                                            <td style="color:red">接单日期</td>
                                            <td>
                                                <input>
                                            </td>
                                            <td style="color:red">版型</td>
                                            <td><input type="text"></td>
                                            <td style="color:red">版期</td>
                                            <td><input type="text"></td>
                                            <td>样板倍数</td>
                                            <td><input type="text"></td>
                                        </tr>
                                        <tr>
                                            <td>审核人员</td>
                                            <td>
                                                <input>
                                            </td>
                                            <td>审核日期</td>
                                            <td><input type="text"></td>
                                            <td>跟单</td>
                                            <td><input type="text"></td>
                                            <td>备注</td>
                                            <td><input type="text"></td>
                                        </tr>
                                    </table>
                                </center>
                            </div>
                            <div class="x_content">
                                <br/>
                            <div class="" role="tabpanel" data-example-id="togglable-tabs">
                                <ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
                                    <li role="presentation" class="active"><a href="#tab_content1" id="home-tab" role="tab" data-toggle="tab" aria-expanded="true">细码表</a>
                                    </li>
                                    <li role="presentation" class=""><a href="#tab_content2" role="tab" id="profile-tab" data-toggle="tab" aria-expanded="false">尺寸表</a>
                                    </li>
                                    <li role="presentation" class=""><a href="#tab_content3" role="tab" id="profile-tab2" data-toggle="tab" aria-expanded="false">BOM表</a>
                                    </li>
                                    <li role="presentation" class=""><a href="#tab_content4" role="tab" id="profile-tab3" data-toggle="tab" aria-expanded="false">用料表</a>
                                    </li>
                                    <li role="presentation" class=""><a href="#tab_content5" role="tab" id="profile-tab4" data-toggle="tab" aria-expanded="false">档案表</a>
                                    </li>
                                    <li role="presentation" class=""><a href="#tab_content6" role="tab" id="profile-tab5" data-toggle="tab" aria-expanded="false">成本预算</a>
                                    </li>
                                </ul>
                                <div id="myTabContent" class="tab-content">
                                    <div role="tabpanel" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">
                                       <table class="table-condensed table table-bordered table-bordered">

                                           <thead>
                                               <td>提交</td>
                                               <td>颜色</td>
                                               <td>po</td>

                                           </thead>
                                           <tbody>
                                           <tr>
                                           <td>提交</td>
                                           <td>颜色</td>
                                           <td>po</td>
                                           </tr>
                                           </tbody>

                                       </table>
                                    </div>
                                    <div role="tabpanel" class="tab-pane fade" id="tab_content2" aria-labelledby="profile-tab">
                                        <p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo
                                            booth letterpress, commodo enim craft beer mlkshk aliquip</p>
                                    </div>
                                    <div role="tabpanel" class="tab-pane fade" id="tab_content3" aria-labelledby="profile-tab">
                                        <p>xxFood truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo
                                            booth letterpress, commodo enim craft beer mlkshk </p>
                                    </div>
                                    <div role="tabpanel" class="tab-pane fade" id="tab_content4" aria-labelledby="profile-tab">
                                        <p>xxFood truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo
                                            booth letterpress, commodo enim craft beer mlkshk </p>
                                    </div>
                                    <div role="tabpanel" class="tab-pane fade" id="tab_content5" aria-labelledby="profile-tab">
                                        <p>xxFood truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo
                                            booth letterpress, commodo enim craft beer mlkshk </p>
                                    </div>
                                    <div role="tabpanel" class="tab-pane fade" id="tab_content6" aria-labelledby="profile-tab">
                                        <p>xxFood truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo
                                            booth letterpress, commodo enim craft beer mlkshk </p>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                        </div>

                    </div></div>
            </div>
        </div>


                </div></div></div></div></div>
</body>

</html>
<script>

    var vm=new Vue({
        el:"#app",
        data:{
            customerlist:[],
            Sampleno:""

        },
        methods:{
            getCustomer:function(){
                var sel=this;
                $.ajax({
                    url:"customer/getCustomer_cmy",
                    type:"post",
                    dataType:"json",
                    success:function(data){
                        sel.customerlist=data;
                    }
                });
            },
            getSampleNo:function(){
                var sels=this;
                $.ajax({
                   url:"oldnumber/selectByPrimaryKey",
                    data:{"number":1},
                   type:"get",
                   success:function(data){
                       alert(data);
                       sels.Sampleno=data;
                       alert(111);
                   }
                });
            }
        }
    });
    vm.getCustomer();
    vm.getSampleNo();
</script>
