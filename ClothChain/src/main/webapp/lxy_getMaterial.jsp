<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-10-19
  Time: 16:43
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
    * {font-family:"楷体";
    font-size:15px;
    }
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
<body style="background-color: white" >
<div id="app">
<ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
    <li role="presentation" class="active"><a href="#tab_content1" id="home-tab" role="tab" data-toggle="tab" aria-expanded="true">首页</a>
    </li>
    <li role="presentation" class=""><a href="#tab_content2" role="tab" id="profile-tab" data-toggle="tab" aria-expanded="false">添加</a>
    </li>
</ul>
<!---------->


<div id="myTabContent" class="tab-content">
    <div role="tabpanel" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">

        <div class="col-xs-12">
            <div class="x_panel">
                <div class="x_title row">
                    <div class="title_left col-xs-6" >
                        <h3>物料信息</h3>
                    </div>
                    <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                        <div class="input-group">
                            <input type="text" v-model="mname" class="form-control" placeholder="Search for...">
                            <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
                   </span>
                        </div>
                    </div>
                </div>
                <div class=" col-xs-12">
                    <div>
                        <br/>
                        <table class="table table-bordered table-condensed table-hover ">
                            <tr class="bgprimary"></tr>
                            <tr style="background-color:#0D3349;color: #FFFFFF ">
                                <td>编号</td>
                                <td>供应商</td>
                                <td>类别</td>
                                <td>物料编号</td>
                                <td>物料名称</td>
                                <td>规格型号</td>
                                <td>是否可用</td>
                                <td>审核状态</td>
                                <td>备注</td>
                                <td>主要成分</td>
                                <td>缩率</td>
                                <td>克重</td>
                                <td>支数</td>
                                <td>参考价格</td>
                                <td>基本单位</td>
                                <td>每单起订量</td>
                                <td>颜色编号</td>
                                <td>尺码</td>
                                <td>操作</td>
                            </tr>

                            <tbody><!--分页内容-->

                            <tr  v-for="sam in material">

                                <td>{{sam.materialid}}</td>
                                <td>{{sam.superliername}}</td>
                                <td>{{sam.categoryname}}</td>
                                <td>{{sam.materialnum}}</td>
                                <td>{{sam.materialname}}</td>
                                <td>{{sam.modal}}</td>
                                <td v-if="sam.state==1"><input type="checkbox" checked='true'></td>
                                <td v-if="sam.state==2"><input type="checkbox"></td>
                                <td v-if="sam.auditstatu==1"><input type="checkbox" checked="true"></td>
                                <td v-if="sam.auditstatu==2"><input type="checkbox"></td>
                                <td>{{sam.remark}}</td>
                                <td>{{sam.basis}}</td>
                                <td>{{sam.shrinkage}}</td>
                                <td>{{sam.weight}}</td>
                                <td>{{sam.num}}</td>
                                <td>{{sam.price}}</td>
                                <td>{{sam.unit}}</td>
                                <td>{{sam.startnum}}</td>
                                <td>{{sam.color}}</td>
                                <td>{{sam.size}}</td>
                                <td><a  class='btn btn-white  btn-xs btn-bold glyphicon glyphicon-pencil' data-toggle='modal' data-target='#myModal' @click='getOne(sam.materialid)'>查看</a></td>
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
<!---------------首页导航分割-------------------------------------------------------->
    </div>
    <!-------------------添加------------------------->
    <div role="tabpanel" class="tab-pane fade" id="tab_content2" aria-labelledby="profile-tab">
          <form action="lxy/addMaterial" method="post" id="myform2">
              <table class="table table-bordered  table-hover ">
                  <h3>新增物料</h3>
                  <tr>
                      <td>物料名称</td>
                      <td><input name="materialname"></td>
                      <td>供应商</td>
                      <td><select id="gys" name="superlierid"></select></td>
                  </tr>
                  <tr>
                      <td>类别</td>
                      <td><select id="lb" name="categoryid"></select></td>
                      <td>基本单位</td>
                      <td><input name="unit"></td>
                  </tr>
                  <tr>
                      <td>主要成分</td>
                      <td><input name="basis"></td>
                      <td>物料编号</td>
                      <td><input name="materialnum"></td>
                  </tr>
                  <tr>
                      <td>缩率</td>
                      <td><input name="shrinkage"></td>
                      <td>克重</td>
                      <td><input name="weight"></td>
                  </tr>
                  <tr>
                      <td>支数</td>
                      <td><input name="num"></td>
                      <td>参考价格</td>
                      <td><input name="price"></td>
                  </tr>
                  <tr>
                      <td>每单起订量</td>
                      <td><input name="startnum"></td>
                      <td>颜色编号</td>
                      <td><input name="color"></td>
                  </tr>
                  <tr>
                      <td>尺码</td>
                      <td><input name="size"></td>
                      <td>规格型号</td>
                      <td><input name="modal"></td>
                  </tr>
                
                  <tr>
                      <td>备注</td>
                      <td><input name="remark"></td>
                  </tr>
                  <tr>
                      <td style="text-align: center">
                          <input type="submit" value="提交" class="btn btn-default btn-lg">
                      </td>
                  </tr>
              </table>
          </form>
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
                                <td><input name="materialid" :value="mat.materialid" readonly="readonly"/></td>
                            </tr>
                            <tr>
                                <td   style="line-height:30px;color:#428BCA;margin-right:2px">供应商名称：</td>
                                <td><input name="superlierid":value="mat.superliername"/></td>
                            </tr>
                            <tr>
                                <td  style="line-height:30px;color:#428BCA;margin-right:2px">类别编号：</td>
                                <td><input name="categoryid" :value="mat.categoryname"/></td>
                            </tr>
                            <tr>
                                <td   style="line-height:30px;color:#428BCA;margin-right:2px">物料编号：</td>
                                <td><input name="materialnum" :value="mat.materialnum"></td>
                            </tr>
                            <tr>
                                <td  style="line-height:30px;color:#428BCA;margin-right:2px">物料名称：</td>
                                <td><input name="materialname" :value="mat.materialname"/></td>
                            </tr>
                            <tr>
                                <td  style="line-height:30px;color:#428BCA;margin-right:2px">规格型号：</td>
                                <td><input name="modal" :value="mat.modal"/></td>
                            </tr>
                            <tr>
                                <td style="line-height:30px;color:#428BCA;margin-right:2px">备注：</td>
                                <td><input name="remark" :value="mat.remark"/></td>
                            </tr>
                            <tr>
                                <td style="line-height:30px;color:#428BCA;margin-right:2px">主要成分：</td>
                                <td><input name="basis":value="mat.basis"/></td>
                            </tr>
                            <tr>
                                <td style="line-height:30px;color:#428BCA;margin-right:2px">缩率：</td>
                                <td><input name="shrinkage":value="mat.shrinkage"/></td>
                            </tr>
                            <tr>
                                <td style="line-height:30px;color:#428BCA;margin-right:2px">克重：</td>
                                <td><input name="weight":value="mat.weight"/></td>
                            </tr>
                            <tr>
                                <td style="line-height:30px;color:#428BCA;margin-right:2px">支数：</td>
                                <td><input name="num" :value="mat.num"/></td>
                            </tr>
                            <tr>
                                <td style="line-height:30px;color:#428BCA;margin-right:2px">参考价格：</td>
                                <td><input name="price" :value="mat.price"/></td>
                            </tr>
                            <tr>
                                <td style="line-height:30px;color:#428BCA;margin-right:2px">基本单位：</td>
                                <td><input name="unit" :value="mat.unit"/></td>
                            </tr>
                            <tr>
                                <td style="line-height:30px;color:#428BCA;margin-right:2px">每单起订量：</td>
                                <td><input name="startnum" :value="mat.startnum"/></td>
                            </tr>
                            <tr>
                                <td style="line-height:30px;color:#428BCA;margin-right:2px">颜色编号</td>
                                <td><input name="color" :value="mat.color"/></td>
                            </tr>
                            <tr>
                                <td style="line-height:30px;color:#428BCA;margin-right:2px">尺码：</td>
                                <td><input name="size" :value="mat.size"/></td>
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


</div>

</body>
</html>
<script>

    var newlist = new Vue({
        el: '#app',
        data: {
            material:[],
            nowPage: 1, //当前页
            pageSize:5,//每页显示的条数
            pages: 50, //总页数
            changePage:'',//跳转页
            nowIndex:0,
            mat:"",
            mname:''

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
                var parames={"pageSize":this.pageSize,"pageNum":obj,"materialname":this.mname}
                this.$http.post("lxy/getMaterial",parames,{emulateJSON:true}).then(
                    function(res){
                        this.material=res.data.list;
                        this.pages=res.data.pages;
                    }
                )

            },
            getOne:function(obj){
              var res=this;

                $.ajax({
                        url:"lxy/findOneMaterial",
                        data:{"id":obj},
                        type:"post",
                        dataType:"json",
                        success:function(data){
                            res.mat=data;
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
            "mname":function(){
                this.getList(1);
            }
        }
    });

 //查询供应循环到select框中
    $(function(){
        $.ajax({
            url: "lxy/findsuperlier",
            ContentType: "text/html;charset=utf-8",
            type: "post",
            data: {},
            dataType: "json",
            success: function (data) {
                var op = "";
                for (var i = 0; i < data.length; i++) {
                    op += "<option value='" + data[i].superlierid + "'>" + data[i].superliername + "</option>"
                }
                $("#gys").append(op);
            }
        });
    })
//查询类别循环到类别下拉框中
    $(function(){
        $.ajax({
            url: "lxy/getMaterialcategory",
            ContentType: "text/html;charset=utf-8",
            type: "post",
            data: {},
            dataType: "json",
            success: function (data) {
                var op = "";
                for (var i = 0; i < data.length; i++) {
                    op += "<option value='" + data[i].categoryid + "'>" + data[i].categoryname + "</option>"
                }
                $("#lb").append(op);
            }
        });
    })

    //根据id查询修改前信息
    // function getOne(obj){
    //     var materialid=$(obj).parent().parent().children().html();//编号
    //     $.ajax({
    //         url:"lxy/findOneMaterial",
    //         data:{"id":materialid},
    //         type:"post",
    //         dataType:"json",
    //         success:function(data){
    //             $("#bh").val(data.materialid);//编号
    //             $("#gysid").val(data.superliername);//供应商编号
    //             $("#lbid").val(data.categoryname);//类别编号
    //             $("#gysid").val(data.superlierid);//供应商编号
    //             $("#wlbh").val(data.materialnum);//物料编号
    //             $("#wlmc").val(data.materialname);//物料名称
    //             $("#ggxh").val(data.modal);//规格型号
    //             $("#bz").val(data.remark);//备注
    //             $("#zycf").val(data.basis);//主要成分
    //             $("#sl").val(data.shrinkage);//缩率
    //             $("#kz").val(data.weight);//克重
    //             $("#zs").val(data.num);//支数
    //             $("#ckjg").val(data.price);//参考价格
    //             $("#jbdw").val(data.unit);//基本单位
    //             $("#mdqdl").val(data.startnum);//没胆起订量
    //             $("#ysbh").val(data.color);//颜色
    //             $("#cm").val(data.size);//尺码
    //         }
    //     });
    // }
    //修改物料信息
    function updatebtn(obj){
        alert("aa")
        $.ajax({
            url:"lxy/updateMaterial",
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
