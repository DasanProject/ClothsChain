<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-10-20
  Time: 19:24
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
<div class="col-xs-12"  id="app">
    <ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
        <li role="presentation" class="active"><a href="#tab_content1" id="home-tab" role="tab" data-toggle="tab" aria-expanded="true">Home</a>
        </li>
        <li role="presentation" class=""><a href="#tab_content2" role="tab" id="profile-tab" data-toggle="tab" aria-expanded="false">新增</a>
        </li>
    </ul>
    <!--------->
    <div class="x_panel">
        <div class="x_title row">
            <div class="title_left col-xs-6" >
                <h3>辅料管理</h3>
            </div>
            <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                <div class="input-group">
                    <input type="text" v-model="access" class="form-control" placeholder="请输入分类名称...">
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
        </span>
                </div>
            </div>
        </div>
        <div id="myTabContent" class="tab-content">
            <div role="tabpanel" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">

                <div class=" col-xs-12">
                    <div >

                        <table class="table table-bordered table-condensed table-hover ">
                            <tr class="bgprimary"></tr>
                            <tr>
                                <td>辅料设置ID</td>
                                <td>分类编码</td>
                                <td>分类名称</td>
                                <td>描述说明</td>
                                <td>辅料类型</td>
                                <td colspan="2px">操作</td>
                            </tr>
                            <tbody><!--分页内容-->

                            <tr  v-for="sam in accessories">
                                <td>{{sam.accessoriesid}}</td>
                                <td>{{sam.accessoriesnum}}</td>
                                <td>{{sam.accessoriesname}}</td>
                                <td>{{sam.describle}}</td>
                                <%-- <td>{{sam.type}}</td>--%>
                                <td v-if="sam.type==1">大类</td>
                                <td v-if="sam.type==2">小类</td>
                                <td><a  class='btn btn-white  btn-xs btn-bold glyphicon glyphicon-pencil' data-toggle='modal' data-target='#myModal' @click='getOne(sam.accessoriesid)'>查看</a></td>
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
        </div>


    </div>

<!------------------------------------------------------------->

</div>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:80%">
    <div class="modal-dialog">
        <div class="modal-content" style="width:80%">
            <div class="modal-header" style="background-color:#428BCA;color:#fff">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabe2">
                    修改
                </h4>
            </div>
            <div class="modal-body" style="width:80%">
                <form id="myform">
                    <table>
                        <tr>
                            <td   style="line-height:30px;color:#428BCA;margin-right:2px">编号：</td>
                            <td><input name="accessoriesid" :value="acc.accessoriesid" readonly="readonly"/></td>
                        </tr>
                        <tr>
                            <td style="line-height:30px;color:#428BCA;margin-right:2px">分类编码：</td>
                            <td><input name="accessoriesnu" :value="acc.accessoriesnum"/></td>
                        </tr>
                        <tr>
                            <td style="line-height:30px;color:#428BCA;margin-right:2px">分类名称：</td>
                            <td><input name="accessoriesname" :value="acc.accessoriesname"/></td>
                        </tr>
                        <tr>
                            <td style="line-height:30px;color:#428BCA;margin-right:2px">描述说明：</td>
                            <td><input name="acc.describle" :value="acc.describle"/></td>
                        </tr>
                        <tr>
                            <td style="line-height:30px;color:#428BCA;margin-right:2px">辅料类型：</td>
                            <td><input name="type" :value="acc.type"/></td>
                        </tr>
                    </table>
                </form>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>
                    <button type="button" class="btn btn-primary" onclick="updatebtn(this)">
                        确认修改
                    </button>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div></div></div>
<!-------------------------新增辅料------------------------------------------>
<div role="tabpanel" class="tab-pane fade" id="tab_content2" aria-labelledby="profile-tab">
    <h3>辅料信息录入</h3>
    <form id="for" action="lxy/addAccessories.action" method="post">
        <table>

            <tr>
                <td>辅料编码id</td>
                <td>分类编码</td>
                <td>分类名称</td>
                <td>描述说明</td>
            </tr>
            <tbody id="tbody">

            </tbody>
            <tr>
                <td><input type="button" value="添加一行" id="addrow"></td>
                <td><input type="button" value="提交" id="add"></td>
            </tr>
        </table>
    </form>
</div>
</div>
<!---------------------------------------------------------------------------->
</div>



</body>
</html>
<script>



    var newlist = new Vue({
        el: '#app',
        data: {
            accessories:[],
            nowPage: 1, //当前页
            pageSize:5,//每页显示的条数
            pages: 50, //总页数
            changePage:'',//跳转页
            nowIndex:0,
            access:'',
            acc:"",
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
                var parames={"pageSize":this.pageSize,"pageNum":obj,"accessoriesname":this.access}
                this.$http.post("lxy/getAccessories",parames,{emulateJSON:true}).then(
                    function(res){
                        this.accessories=res.data.list;
                        this.pages=res.data.pages;
                    }
                )},
            //vue根据id查询辅料数据
                getOne:function(obj){
                    var res=this;
                    $.ajax({
                        url:"lxy/getOneAccessories",
                        data:{"id":obj},
                        type:"post",
                        dataType:"json",
                        success:function(data){
                            res.acc=data;
                            alert(data+"ddd");
                        }
                    })},

            nextPage:function(nowPa){//下一页
                this.nowPage=nowPa+1;
                this.getList(this.nowPage);
            },
            prePage:function(nowPa){
                this.nowPage=nowPa-1;
                this.getList(this.nowPage);
            }
        },
        created:function(){
            this.getList(1);
        },
        watch:{ //监听每页显示条数的变化
            "pageSize":function(){
                this.getList(1);
            },
            "access":function(){
                this.getList(1);
            }
        }
    });
</script>