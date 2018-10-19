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
<script src="laydate/laydate.js"></script>






<body class="" style="background-color: #F6F6F6;padding-right: 20px;" >
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
                                                <select name="customerid" v-model="customer" class="form-control">
                                                <template v-for="cus in customerlist">
                                                    <option :value="cus.customerid">{{cus.customername}}</option>
                                                </template>
                                            </select></td>
                                            <td style="color:red">品牌</td>
                                            <td><select name="brandid" class="form-control">
                                                <template v-for="brand in brandlist">
                                                    <option :value="brand.brandid">{{brand.brandname}}</option>

                                                </template>

                                            </select></td>
                                            <td>客户单号</td>
                                            <td><input type="text" name="customerno" class="form-control"></td>
                                            <td style="color:red">开发单号</td>
                                            <td><input name="sampleno"  v-model="Sampleno" class="form-control" readonly="readonly"></td>


                                        </tr>
                                        <tr>
                                            <td>季度</td>
                                            <td>
                                                <select name="quarterlyid"  class="form-control">
                                                    <option value="-1">请选择季度</option>
                                                    <template v-for="qua in quarterlylist">
                                                        <option :value="qua.quarterlyid">{{qua.describle}}</option>
                                                    </template>
                                                </select>
                                            </td>
                                            <td style="color:red">款号</td>
                                            <td><input type="text" :value="typeno" class="form-control"></td>
                                            <td>款名</td>
                                            <td><input type="text" class="form-control"></td>
                                            <td style="color:red">款式</td>
                                            <td>  <select name="styleid" class="form-control">
                                                <option value="-1">请选择款式</option>
                                                <template v-for="sty in stylelist">
                                                    <option :value="sty.styleid">{{sty.stylename}}</option>
                                                </template>
                                            </select></td>
                                        </tr>
                                        <tr>
                                            <td style="color:red">接单日期</td>
                                            <td>
                                                <input class="form-control" id="test2">
                                            </td>
                                            <td style="color:red">版型</td>
                                            <td> <select name="sampletypeid" class="form-control">
                                                <option value="-1">请选择版型</option>
                                                <template v-for="samty in sampletypelist">
                                                    <option :value="samty.sampletypeid">{{samty.sampletypename}}</option>
                                                </template>
                                            </select></td>
                                            <td style="color:red">版期</td>
                                            <td><input type="text" class="form-control" id="test1"></td>
                                            <td>样板倍数</td>
                                            <td><input type="text" class="form-control"></td>
                                        </tr>
                                        <tr>
                                            <td>审核人员</td>
                                            <td>
                                                <input class="form-control">
                                            </td>
                                            <td>审核日期</td>
                                            <td><input type="text" class="form-control" id="test3"></td>
                                            <td>跟单</td>
                                            <td><input type="text" class="form-control"></td>
                                            <td>备注</td>
                                            <td><input type="text" class="form-control"></td>
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
                                        <div class="col-md-12 col-sm-12 col-xs-12">
                                            <div style="height: auto;">
                                                <div class="x_title">
                                                    <table>
                                                        <tr>
                                                            <td> <a href="#" class="dropdown-toggle" @click="getSize()"  data-toggle="modal" data-target="#mymodel1" role="button" aria-expanded="false"><i class="fa fa-wrench"></i>尺码选择&nbsp;&nbsp;&nbsp;</a>
                                                            </td>
                                                            <td><a href="#" role="button" aria-expanded="false">  <font style="vertical-align: inherit;"><i class="fa fa-plus-square green"></i>&nbsp;增行&nbsp;&nbsp;&nbsp;</font></a></td>
                                                            <td><a href="#" role="button" aria-expanded="false">  <font style="vertical-align: inherit;"><i class="glyphicon glyphicon-trash"></i>&nbsp;删行&nbsp;&nbsp;&nbsp;</font></a> </td>
                                                            <td><a href="#" role="button" aria-expanded="false">  <font style="vertical-align: inherit;"><i class="glyphicon glyphicon-random"></i>&nbsp;生成用料&nbsp;&nbsp;&nbsp;</font></a> </td>
                                                        </tr>
                                                    </table>
                                                    <!--尺寸模态框-->
                                                    <div id="mymodel1" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-hidden="true">
                                                        <div class="modal-dialog modal-sm">
                                                            <div class="modal-content">
                                                                <div class="modal-header">
                                                                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span>
                                                                    </button>
                                                                    <h4 class="modal-title" id="myModalLabel">尺码选择</h4>
                                                                </div>
                                                                <div class="modal-body">
                                                                        <table class="table table-striped jambo_table bulk_action">

                                                                            <tr class="headings">
                                                                                <th>
                                                                           <input type="checkbox" class="icheckbox_flat-green" @click="getAll()" v-model="sizeboolean">
                                                                                </th>
                                                                                <th class="column-title" style="display: table-cell;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">编号</font></font></th>
                                                                                <th class="column-title" style="display: table-cell;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">尺码 </font></font></th>
                                                                            </tr>



                                                                                <tr v-for="se in sizelist">
                                                                                    <td>
                                                                                        <input type="checkbox" class="icheckbox_flat-green" :value="se.sizename" v-model="sizes">
                                                                                    </td>
                                                                                    <td ><font style="vertical-align: inherit;">{{se.sizeid}}</font></td>
                                                                                    <td><font style="vertical-align: inherit;">{{se.sizename}} </font></font></td>
                                                                                </tr>




                                                                        </table>
                                                                     </div>
                                                                <div class="modal-footer">
                                                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                                                    <button type="button" onclick="aaa()" class="btn btn-primary">Save changes</button>
                                                                </div>

                                                            </div>
                                                        </div>
                                                    </div>
                                         <!--模态框结束-->


                                                    <div class="clearfix"></div>
                                                </div>

                                                <div class="x_content" style="display: block;">
                                                    <div class="table-responsive">
                                                        <table class="table table-striped jambo_table bulk_action">
                                                            <thead>
                                                            <tr class="headings">
                                                                <th>
                                                               <input type="checkbox" class="flat">
                                                                </th>
                                                                <th class="column-title" style="display: table-cell;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">颜色 </font></font></th>
                                                                <th class="column-title" style="display: table-cell;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">色号</font></font></th>
                                                                <th class="column-title" style="display: table-cell;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">po号 </font></font></th>
                                                               <template v-for="si in sizes">
                                                                   <th class="column-title" style="display: table-cell;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">{{si}}</font></font></th>
                                                               </template>
                                                                <th class="column-title no-link last" style="display: table-cell;"><span class="nobr"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">合计</font></font></span>
                                                                </th>
                                                                <th class="bulk-actions" colspan="7" style="display: none;">
                                                                    <a class="antoo" style="color:#fff; font-weight:500;"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">批量操作（</font></font><span class="action-cnt">1 Records Selected</span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">）</font></font><i class="fa fa-chevron-down"></i></a>
                                                                </th>
                                                            </tr>
                                                            </thead>

                                                            <tbody>
                                                            <tr class="even pointer">
                                                                <td class="a-center ">
                                                                     <input type="checkbox" class="flat">
                                                                </td>
                                                                <td class=" "><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">12</font></font></td>
                                                                <td class=" "><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">47:56 </font></font></td>
                                                                <td class=" "><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">12</font></font></td>
                                                                <td class=" "><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">约翰</font></font></td>
                                                                <td class=" "><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">付费</font></font></td>
                                                                <td class="a-right a-right "><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">$ </font></font></td>
                                                                <td class=" last"><a href="#"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">视图</font></font></a>
                                                                </td>
                                                            </tr>
                                                            </tbody>
                                                        </table>
                                                    </div>


                                                </div>
                                            </div>
                                        </div>
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



<!--模态框-->

</body>

</html>
<script>
    var mymodelvue1=new Vue({
        el:"#tab_content1",
        data:{
            sizelist:[],
            sizeboolean:false,
            sizes:[],
            name:[]
        },
        methods:{
            getSize:function(){
             this.$http.post("cmy/getSize_cmy",{mulateJSON:true}).then(function (res) {
                    this.sizelist=res.body;
                    for(var i=0;i<sizelist.length;i++){
                       this.name.push(this.sizelist[i].sizename);
                    }
                });
            },
         getAll: function () {
                if(!this.sizeboolean){
                    this.sizes=[];
                    for(var i=0;i<this.sizelist.length;i++){
                        this.sizes.push(this.sizelist[i].sizename);
                    }
                }else{
                    this.sizes=[];
                }
            }
        },
        watch:{
           "sizes":function(){
                if(this.sizes.length==this.sizelist.length){
                    this.sizeboolean=true;
                }else{
                    this.sizeboolean=false;
                }
            }

        }


    })
    var vm=new Vue({
        el:"#app",
        data:{
            customerlist:[],
            Sampleno:"",
            stylelist:[],
            quarterlylist:[],
            sampletypelist:[],
            typeno:"",
            brandlist:[],
            customer:""

        },
        methods:{
            getCustomer:function(){
                var sel=this;
                $.ajax({
                    url:"cmy/getCustomer_cmy",
                    type:"post",
                    dataType:"json",
                    success:function(data){
                        sel.customerlist=data;
                    }
                });
            },
            getStylelibrary:function(){
                this.$http.post("cmy/getStylelibrary_cmy",{emulateJSON:true}).then(function (res) {
                    this.stylelist=res.body;
                })
            },
            getSampletype:function(){
                this.$http.post("cmy/getSampletype_cmy",{emulateJSON:true}).then(function(res){
                    this.sampletypelist=res.body;
                })
            },
            getQuarterly:function(){
                this.$http.post("cmy/getQuarterly_cmy",{mulateJSON:true}).then(function (res) {
                    this.quarterlylist=res.body;
                })
            },
            getBrand:function(){
                var sel=this;
                $.ajax({
                    url:"cmy/getBrand_cmy",
                    type:"post",
                    data:{"customeraaa":sel.customer},
                    dataType:"json",
                    success:function(data){
                        sel.brandlist=data;
                    }
                });



          /*      var parames={"customeraaa":this.customer}
               this.$http.post("cmy/getBrand_cmy",parames,{mulateJSON:true}).then(function(res){
                   this.brandlist=res.body;
               })*/
            },
            getSampleNo:function(){
                var sels=this;
                $.ajax({
                   url:"cmy/selectByPrimaryKey",
                    data:{"number":1},
                   type:"get",
                   success:function(data){
                       sels.Sampleno=data;
                   }
                });
            },
            getTypeno:function(){
                var sels=this;
                $.ajax({
                    url:"cmy/selectByPrimaryKey",
                    data:{"number":6},
                    type:"get",
                    success:function(data){
                        sels.typeno=data;
                    }
                });
            }

        },
        watch:{
            "customer":function(){
                this.getBrand();
            }
        }
    });
    vm.getCustomer();
    vm.getSampleNo();
    vm.getQuarterly();
    vm.getSampletype();
    vm.getStylelibrary();
    vm.getTypeno();
    vm.getBrand();
    laydate.render({
        elem: '#test1' //指定元素
        ,theme: '#293E53'//指定颜色
    });
    laydate.render({
        elem: '#test2' //指定元素
        ,theme: '#293E53'//指定颜色
    });
    laydate.render({
        elem: '#test3' //指定元素
        ,theme: '#293E53'//指定颜色
    });
    function aaa(){
        $('#mymodel1').modal('hide');  //手动关闭
    }

</script>
