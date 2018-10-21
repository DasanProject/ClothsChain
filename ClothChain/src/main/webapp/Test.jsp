<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-10-21
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/vue.js"></script>
<script src="js/vue-resource.js"></script>
<!-- Bootstrap -->
<link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Font Awesome -->
<link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<!-- NProgress -->
<link href="vendors/nprogress/nprogress.css" rel="stylesheet">
<!-- bootstrap-daterangepicker -->
<link href="vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
<!-- bootstrap-datetimepicker -->
<link href="vendors/bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.css" rel="stylesheet">
<!-- Ion.RangeSlider -->
<link href="vendors/normalize-css/normalize.css" rel="stylesheet">
<link href="vendors/ion.rangeSlider/css/ion.rangeSlider.css" rel="stylesheet">
<link href="vendors/ion.rangeSlider/css/ion.rangeSlider.skinFlat.css" rel="stylesheet">
<!-- Bootstrap Colorpicker -->
<link href="vendors/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css" rel="stylesheet">

<link href="vendors/cropper/dist/cropper.min.css" rel="stylesheet">

<!-- Custom Theme Style -->
<link href="build/css/custom.min.css" rel="stylesheet">

<script src="vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="vendors/fastclick/lib/fastclick.js"></script>
<!-- NProgress -->
<script src="vendors/nprogress/nprogress.js"></script>
<!-- bootstrap-daterangepicker -->
<script src="vendors/moment/min/moment.min.js"></script>
<script src="vendors/bootstrap-daterangepicker/daterangepicker.js"></script><
<!-- bootstrap-datetimepicker -->
<script src="vendors/bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"></script>
<!-- Ion.RangeSlider -->
<script src="vendors/ion.rangeSlider/js/ion.rangeSlider.min.js"></script>
<!-- Bootstrap Colorpicker -->
<script src="vendors/mjolnic-bootstrap-colorpicker/dist/js/bootstrap-colorpicker.min.js"></script>
<!-- jquery.inputmask -->
<script src="vendors/jquery.inputmask/dist/min/jquery.inputmask.bundle.min.js"></script>

<!-- Cropper -->
<script src="vendors/cropper/dist/cropper.min.js"></script>

<!-- Custom Theme Scripts -->
<script src="build/js/custom.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<style>
    * {font-family:"楷体"}
    .page {
        font-weight: 900;
        height: 40px;
        text-align: center;
        color: #888;
        margin: 20px auto 0;
        background: #f2f2f2;
    }

    .pagelist {
        font-size: 0;
        background: #fff;
        height: 50px;
        line-height: 50px;
    }

    .pagelist span {
        font-size: 14px;
    }

    .pagelist .jump {
        border: 1px solid #ccc;
        padding: 5px 8px;
        -webkit-border-radius: 4px;
        -moz-border-radius: 4px;
        border-radius: 4px;
        cursor: pointer;
        margin-left: 5px;
    }

    .pagelist .bgprimary {
        cursor: default;
        color: #fff;
        background: #0D3349;
        border-color: #0D3349;
    }

    .jumpinp input {
        width: 55px;
        height: 26px;
        font-size: 13px;
        border: 1px solid #ccc;
        -webkit-border-radius: 4px;
        -moz-border-radius: 4px;
        border-radius: 4px;
        text-align: center;
    }

    .ellipsis {
        padding: 0px 8px;
    }

    .jumppoint {
        margin-left: 30px;
    }

    .pagelist .gobtn {}

    .bgprimary {
        cursor: default;
        color: #fff;
        background: #0D3349;
        border-color: #0D3349;
    }

</style>
<body style="background-color: white">
<ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
    <li role="presentation" class="active"><a href="#tab_content1" id="home-tab" role="tab" data-toggle="tab" aria-expanded="true">Home</a>
    </li>
    <li role="presentation" class=""><a href="#tab_content2" role="tab" id="profile-tab" data-toggle="tab" aria-expanded="false">新增</a>
    </li>
</ul>


<!-----------------Home--------------------->
<div id="myTabContent" class="tab-content">
    <div role="tabpanel" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">

        <!----------------信息---------------->
        <div class="col-xs-12" id="app">
            <div class="x_panel">
                <div class="x_title row">
                    <div class="title_left col-xs-6" >
                        <h3>颜色库管理</h3>
                    </div>
                    <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="Search for by colorName ..."   v-model="colo">
                            <span class="input-group-btn">
                      <button class="btn btn-default" type="button"  >Go!</button>
        </span>
                        </div>
                    </div>
                </div>
                <div class=" col-xs-12">
                    <div >
                        <br/>

                        <table class="table table-bordered table-condensed table-hover ">
                            <tr class="bgprimary">
                                <td>颜色库ID</td>
                                <td>颜色名称</td>
                                <td>取色器编号</td>
                                <td>描述</td><%--描述--%>
                            </tr>

                            <tbody><!--分页内容-->

                            <tr  v-for="sam in colorlist">
                                <td>{{sam.colorid}}</td>
                                <td>{{sam.colorname}}</td>
                                <td>{{sam.colorstr}}</td>
                                <td>{{sam.url}}</td><%--描述--%>
                            </tr>

                            <tfoot><!--分页页脚--->
                            <tr>
                                <td colspan="13">

                                    <div class="page"  v-show="show">

                                        <div class="pagelist">
                                                              <span  class="jump"><select  v-model="pageSize" style="border: 0px">
                                                        <option value="5">5</option>
                                                        <option value="10">10</option>
                                                        <option value="15">15</option>
                                                        <option value="100">100</option>
                                                    </select>
                                                    </span>
                                            <span class="jump"v-show="nowPage>1" @click="prePage(nowPage)">上一页</span>
                                            <span v-show="nowPage>5" class="jump" @click="getList(1)">1</span>
                                            <span class="ellipsis"  v-show="efont">...</span>
                                            <span class="jump" v-for="num in indexs" :class="{bgprimary:nowPage==num}" @click="getList(num)">{{num}}</span>
                                            <span class="ellipsis"  v-show="efont&&nowPage<pages-4">...</span>

                                            <span class="jump" v-show="nowPage<pages" @click="nextPage(nowPage)">下一页</span>
                                            <span v-show="nowPage<pages-1" class="jump" class="jump" @click="getList(pages)">{{pages}}</span>

                                            <span class="jumppoint">跳转到：</span>
                                            <span class="jumpinp"><input type="text" v-model="changePage"></span>
                                            <span class="jump gobtn" @click="getList(changePage)">GO</span>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                            </tfoot>
                        </table>
                    </div>

                </div>
            </div>







            <!--------------@信息------------------------------->


            <!---------------Home2-------------------->
            <div role="tabpanel" class="tab-pane fade" id="tab_content2" aria-labelledby="profile-tab">
                <h3>颜色信息录入</h3>
                <!-- form color picker -->

                <div class="col-md-6 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>Color Picker</h2>
                            <ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="#">Settings 1</a>
                                        </li>
                                        <li><a href="#">Settings 2</a>
                                        </li>
                                    </ul>
                                </li>
                                <li><a class="close-link"><i class="fa fa-close"></i></a>
                                </li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div class="x_content">
                            <br />

                            <form class="form-horizontal form-label-left" id="colorform">
                                <div class="form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">颜色名称</label>
                                    <div class="col-md-9 col-sm-9 col-xs-12">
                                        <input type="text"  name="colorname"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">取色器编号</label>
                                    <div class="col-md-9 col-sm-9 col-xs-12">
                                        <div class="input-group demo2">
                                            <input type="text" value="#e01ab5" class="form-control" name="colorstr"/>
                                            <span class="input-group-addon"><i></i></span>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-md-3 col-sm-3 col-xs-12">说明</label>
                                    <div class="col-md-9 col-sm-9 col-xs-12">
                                        <input type="text" name="url">
                                    </div>
                                </div>
                                <button type="button" class="btn btn-primary" id="addbtn">
                                    添加
                                </button>
                            </form>
                        </div>
                    </div>
                </div>
                <!-- /form color picker -->


            </div>
            <div class="col-md-12">
                <div class="modal fade docs-cropped" id="getCroppedCanvasModal" aria-hidden="true" aria-labelledby="getCroppedCanvasTitle" role="dialog" tabindex="-1">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                <h4 class="modal-title" id="getCroppedCanvasTitle">Cropped</h4>
                            </div>
                            <div class="modal-body"></div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                <a class="btn btn-primary" id="download" href="javascript:void(0);" download="cropped.png">Download</a>
                            </div>
                        </div>
                    </div>
                </div><!-- /.modal -->


                <!-- /page content -->
                <%-- <form id="for" action="lxy/addColor.action" method="post" enctype="multipart/form-data">
                 <table>
                       <tr>
                           <td>颜色名称</td>
                           <td>取色器编号</td>
                           <td>颜色描述</td>
                       </tr>
                       <tbody id="tbody">
                       <template v-for="(co,index) in colorlistadd">
                       <tr>
                           <td><input v-model="co.colorname"></td>
                           <td> <div class="input-group demo2">
                               <input type="text" value="#e01ab5" v-model="co.colorstr" class="form-control" />
                               <span class="input-group-addon"><i></i></span>
                           </div><input v-model="co.url"></td>
                           <td></td>
                       </tr>
                       </template>
                       </tbody>
                       <tr>
                           <td><a class="btn btn-primary" v-on:click="addstraaa()">aaaa</a></td>
                           <td><input type="button" value="提交"></td>
                       </tr>
                   </table>
        </form>--%>
            </div>
        </div>
    </div>
</div>
</div>


</body>
</html>
<script>

    var newlist = new Vue({
        el: '#app',
        data: {
            colorlist:[],
            nowPage: 1, //当前页
            pageSize:5,//每页显示的条数
            pages: 50, //总页数
            changePage:'',//跳转页
            nowIndex:0,
            colo:"",
            colorlistadd:[],//添加颜色的集合
            coloradd:[]//添加颜色的对象
        },
        computed:{
            show:function(){
                return this.pages && this.pages !=1
            },
            efont: function() {
                if (this.pages <= 7) return false;
                return this.nowPage > 5
            },
            indexs: function() {

                var left = 1,
                    right = this.pages,
                    ar = [];
                if (this.pages >= 7) {
                    if (this.nowPage > 5 && this.nowPage < this.pages - 4) {
                        left = Number(this.nowPage) - 3;
                        right = Number(this.nowPage) + 3;
                    } else {
                        if (this.nowPage <= 5) {
                            left = 1;
                            right = 7;
                        } else {
                            right = this.pages;

                            left = this.pages - 6;
                        }
                    }
                }
                while (left <= right) {
                    ar.push(left);
                    left++;
                }
                return ar;
            },
        },
        methods: {
            getList:function(obj){
                this.nowPage=obj;
                var parames={"pageSize":this.pageSize,"pageNum":obj,"colorname":this.colo}
                this.$http.post("lxy/getColor",parames,{emulateJSON:true}).then(
                    function(res){
                        this.colorlist=res.data.list;
                        alert(res.data.list+"kk");
                        this.pages=res.data.pages;

                    }
                )

            },
            nextPage:function(nowPa){//下一页
                this.nowPage=nowPa+1;
                this.getList(this.nowPage);
            },
            prePage:function(nowPa){
                this.nowPage=nowPa-1;
                this.getList(this.nowPage);
            },
            addstraaa:function(){
                this.coloradd=[],
                    Vue.set(this.coloradd,'colorname',"");
                Vue.set(this.coloradd,'colorstr',"");
                Vue.set(this.coloradd,'url',"");
                this.colorlistadd.push(this.coloradd);
            }
        },
        created:function(){
            this.getList(1);
        },
        watch:{ //监听每页显示条数的变化
            "pageSize":function(){
                this.getList(this.nowPage);
            },
            "colo":function(){
                this.getList(1);
            }
        }

    });
    //添加颜色
    $("#addbtn").click(function(){
        $.ajax({
            url:"lxy/addColor",
            type:"post",
            dataType:"json",
            data:$("#colorform").serialize(),
            success:function(data){
                $("#myModal").modal('hide');
            }
        })

    });

</script>



