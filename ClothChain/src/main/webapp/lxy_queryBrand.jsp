<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-10-16
  Time: 21:33
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
<script src="My97DatePicker/WdatePicker.js"></script>
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
<body style="background-color: #FFFFFF">
<div class="col-xs-12" id="app">
    <div class="x_panel">

        <div class="x_title row">
            <div class="title_left col-xs-6" >
                <h3>品牌信息管理</h3>
            </div>
            <!------------------------------------>
            <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search for by brandName ..."   v-model="ppm">
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button"  >Go!</button>
        </span>
                </div>
            </div>
        </div>
        <div class="col-xs-12">
            <div >


                <table class="table table-bordered table-condensed table-hover ">
                    <tr> <a data-toggle="modal" data-target="#myModal" style="font-size:20px">添加 </a></tr>
                    <tr class="bgprimary">
                    <td>品牌编号</td>
                    <td>所属客户</td>
                    <td>品牌编码</td>
                    <td>品牌名称</td>
                    <td>品牌全称</td>
                    <td>样板倍数</td>
                    <td>备注</td>
                    <td>操作</td>
                    </tr>

                    <tbody><!--分页内容-->

                    <tr  v-for="sam in brand">
                        <td>{{sam.brandid}}</td>
                        <td>{{sam.brandname}}</td>
                        <td>{{sam.brandnum}}</td>
                        <td>{{sam.brandname}}</td>
                        <td>{{sam.brandfullname}}</td>
                        <td>{{sam.samplemultiple}}</td>
                        <td>{{sam.remark}}</td>
                        <td><a  class='btn btn-white  btn-xs btn-bold glyphicon glyphicon-pencil' data-toggle='modal' data-target='#myModal2' onclick='getOne(this)'>编辑</a></td>
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

<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:80%">
    <div class="modal-dialog">
        <div class="modal-content" style="width:80%">
            <div class="modal-header" style="background-color:#428BCA;color:#fff">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    增加品牌
                </h4>
            </div>
            <div class="modal-body" style="width:80%">
                <form id="myform">
                    <table>
                        <tr>
                            <td  class="glyphicon glyphicon-user"  style="line-height:50px;color:#428BCA;margin-right:2px">品牌名称：</td>
                            <td><input name="brandname" /></td>
                        </tr>
                        <tr>
                            <td  class="glyphicon glyphicon-leaf" style="line-height:50px;color:#428BCA;margin-right:2px">品牌编码：</td>
                            <td><input name="brandnum" /></td>
                        </tr>
                        <tr>
                            <td  class="glyphicon glyphicon-leaf" style="line-height:50px;color:#428BCA;margin-right:2px">所属客户：</td>
                            <td><select id="sskh"></select></td>
                        </tr>
                        <tr>
                            <td class="glyphicon glyphicon-paperclip" style="line-height:50px;color:#428BCA;margin-right:2px">品牌全称：</td>
                            <td><input name="brandfullname"/></td>
                        </tr>
                        <tr>
                            <td class="glyphicon glyphicon-paperclip" style="line-height:50px;color:#428BCA;margin-right:2px">样板倍数：</td>
                            <td><input name="samplemultiple"/></td>
                        </tr>
                        <tr>
                            <td class="glyphicon glyphicon-paperclip" style="line-height:50px;color:#428BCA;margin-right:2px">备注：</td>
                            <td><input name="remark"/></td>
                        </tr>
                    </table>
                </form>

                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>
                    <button type="button" class="btn btn-primary" id="addbtn">
                        添加
                    </button>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div>
</div>



<!-- 模态框（Modal）2 -->
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:80%">
    <div class="modal-dialog">
        <div class="modal-content" style="width:80%">
            <div class="modal-header" style="background-color:#428BCA;color:#fff">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel2">
                    信息变更
                </h4>
            </div>
            <div class="modal-body" style="width:80%">
                <form id="myform2">
                    <table>
                        <tr>
                            <td  class="glyphicon glyphicon-user"  style="line-height:50px;color:#428BCA;margin-right:2px">品牌编号：</td>
                            <td><input name="brandid" id="ppid" readonly="readonly"/></td>
                        </tr>
                        <tr>
                            <td  class="glyphicon glyphicon-user"  style="line-height:50px;color:#428BCA;margin-right:2px">品牌名称：</td>
                            <td><input name="brandname" id="ppmc"/></td>
                        </tr>
                        <tr>
                            <td  class="glyphicon glyphicon-leaf" style="line-height:50px;color:#428BCA;margin-right:2px">品牌编码：</td>
                            <td><input name="brandnum" id="ppbm"/></td>
                        </tr>
                        <tr>
                            <td  class="glyphicon glyphicon-leaf" style="line-height:50px;color:#428BCA;margin-right:2px">所属客户：</td>
                            <td><input  name="customername" id="sskh2"></input></td>
                        </tr>
                        <tr>
                            <td class="glyphicon glyphicon-paperclip" style="line-height:50px;color:#428BCA;margin-right:2px">品牌全称：</td>
                            <td><input name="brandfullname" id="ppqc"/></td>
                        </tr>
                        <tr>
                            <td class="glyphicon glyphicon-paperclip" style="line-height:50px;color:#428BCA;margin-right:2px">样板倍数：</td>
                            <td><input name="samplemultiple" id="ybbs"/></td>
                        </tr>
                        <tr>
                            <td class="glyphicon glyphicon-paperclip" style="line-height:50px;color:#428BCA;margin-right:2px">备注：</td>
                            <td><input name="remark" id="bz"/></td>
                        </tr>
                    </table>
                </form>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>
                    <button type="button" class="btn btn-primary" onclick="updatebrand(this)">
                        修改
                    </button>
                </div>
            </div>
        </div><!-- /.modal-content -->
    </div>

</div>

</body>

</body>
</html>
<script>
    var newlist = new Vue({
        el: '#app',
        data: {
            brand:[],
            nowPage: 1, //当前页
            pageSize:5,//每页显示的条数
            pages: 50, //总页数
            changePage:'',//跳转页
            nowIndex:0,
            ppm:"",
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
                var parames={"pageSize":this.pageSize,"pageNum":obj,"brandname":this.ppm}
                this.$http.post("lxy/getbrand",parames,{emulateJSON:true}).then(
                    function(res){
                        this.brand=res.data.list;
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
            }
        },
        created:function(){
            this.getList(1);
        },
        watch:{ //监听每页显示条数的变化
            "pageSize":function(){
                this.getList(this.nowPage);
            },
            "ppm":function(){
                this.getList(1);
            }
        }

    });


  //添加品牌
  $(function(){
      //查询出商品类型
      $.ajax({

          url:"lxy/getCustomer",
          ContentType:"text/html;charset=utf-8",
          type:"post",
          data:{},
          dataType:"json",
          success:function(data){
           var op="";
             for(var i=0;i<data.length;i++){
                 //data[i].customerid???????
                 op+="<option value='"+data[i].customerid+"'>"+data[i].customername+"</option>"
             }

             $("#sskh").end(op);
          }

      });
      $("#addbtn").click(function(){
             $.ajax({
                 url:"lxy/addbrand",
                 type:"post",
                 dataType:"json",
                 data:$("#myform").serialize(),
                 success:function(data){
                     $("#myModal").modal('hide');
                 }
             })
      })
  });

     //修改前查询
     function getOne(obj){
         var brandid=$(obj).parent().parent().children().html();//编号
         alert(brandid+"aa");
         $.ajax({
             url:"lxy/queryOne",
             data:{"id":brandid},
             type:"post",
             dataType:"json",
             success:function(data){
                       $("#ppid").val(data.brandid);//品牌编号
                       $("#ppmc").val(data.brandname);//品牌名称
                       $("#ppbm").val(data.brandnum);//品牌编码
                       $("#sskh2").val(data.customername);//客户名称
                       $("#ppqc").val(data.brandfullname);//品牌全称
                       $("#ybbs").val(data.samplemultiple);//样板
                       $("#bz").val(data.remark);//备注
                       $("#kuid").val(data.customerid);
                 $("#zt").val(data.state);
                 $("#abbreviation").val(data.abbreviation);

                   }




         });
     }
     //修改品牌信息
     function updatebrand(obj){
             $.ajax({
                 url:"lxy/updatebrand",
                 type:"post",
                 dataType:"text",
                 data:$("#myform2").serialize(),
                 success:function(data){
                     bootbox.alert("<b style='color:#428BCA'>"+"修改成功"+"</b>");

                     $("#myModal2").modal('hide');
                 }
             });

     }

</script>