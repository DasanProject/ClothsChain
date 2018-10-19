<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-10-19
  Time: 9:04
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
<script src="laydate/laydate.js"></script>


<html>
<head>
    <title>查询样衣订单信息表</title>
    <style>
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
            background: #337ab7;
            border-color: #337ab7;
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
            background: #337ab7;
            border-color: #337ab7;
        }
    </style>
</head>
<body style="background-color: white">
  <div class="col-xs-12">
                        <div class="x_panel">
                            <div class="x_title row">
                                <div class="title_left col-xs-6" >
                                    <h3>样衣信息列表</h3>
                                </div>
 </div>
                            <div class=" col-xs-12">
                                      <div id="app">
                                          <div class="col-xs-12">
                                              <div class="x_panel" style="height: auto;">
                                                  <div class="x_title">
                                                      <h2><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"><a class="btn btn-primary btn-small">新增</a></font></font></h2>
                                                      <ul class="nav navbar-right panel_toolbox">
                                                          <li><a class="collapse-link"><i class="fa fa-chevron-down btn btn-primary btn-small">查询条件</i></a>
                                                          </li>
                                                          <li></a>
                                                          </li>
                                                      </ul>
                                                      <div class="clearfix"></div>
                                                  </div>
                                                  <div class="x_content" style="display: none;">
                                                      <form id="for">
                                                          <table class="table">
                                                              <tr>
                                                                  <td>客户：</td>
                                                                  <td>
                                                                      <select name="customerid" v-model="customerid" class="form-control">
                                                                          <option value="-1">请选择客户</option>
                                                                          <template v-for="cus in cuslist">
                                                                              <option :value="cus.customerid">{{cus.customername}}</option>
                                                                          </template>
                                                                      </select>
                                                                  </td>
                                                                  <td>款式：</td>
                                                                  <td>
                                                                      <select name="styleid" v-model="styleid" class="form-control">
                                                                         <option value="-1">请选择款式</option>
                                                                          <template v-for="sty in stylelist">
                                                                              <option :value="sty.styleid">{{sty.stylename}}</option>
                                                                          </template>
                                                                      </select>

                                                                  </td>
                                                                  <td>样衣单号：</td>
                                                                  <td>
                                                                      <fieldset>
                                                                          <div class="control-group">
                                                                              <div class="controls">
                                                                                  <div class="col-md-6 form-group">
                                                                                      <input type="text" class="form-control has-feedback-left"  v-model="sampleno">
                                                                                  </div>
                                                                              </div>
                                                                          </div>
                                                                      </fieldset>
                                                                  </td>
                                                              </tr>
                                                              <tr>
                                                                  <td>季度</td>
                                                                  <td><select name="quarterlyid" v-model="quarterlyid" class="form-control">
                                                                      <option value="-1">请选择季度</option>
                                                                      <template v-for="qua in quarterlylist">
                                                                          <option :value="qua.quarterlyid">{{qua.describle}}</option>
                                                                      </template>

                                                                  </select></td>
                                                                  <td>版型</td>
                                                                  <td>

                                                                      <select name="sampletypeid" v-model="sampletypeid" class="form-control">
                                                                          <option value="-1">请选择版型</option>
                                                                          <template v-for="samty in sampletypelist">
                                                                              <option :value="samty.sampletypeid">{{samty.sampletypename}}</option>
                                                                          </template>
                                                                      </select>

                                                                  </td>
                                                                  <td>接单日期</td>
                                                                  <td>
                                                                          <div class="control-group">

                                                                                  <div class="col-md-6 form-group">
                                                                                      <input type="text" v-model="opendates"  class="form-control has-feedback-left"   placeholder="接单日期" id="test1">

                                                                                      <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                                                                                  </div>
                                                                          </div>

                                                                  </td>
                                                              </tr>
                                                          </table>
                                                      </form>
                                                  </div>
                                              </div>
                                          </div>
                                              <!--日期插件1--->

                                              <!--日期插件2-->

                                              <table class="table table-bordered table-condensed">
                                              </table>
                                          </form>
                                          <br/>

                                    <table class="table table-bordered table-condensed table-hover ">
                                        <tr class="bgprimary">
                                            <td>开发单号</td>
                                            <td>客户</td>
                                            <td>款式</td>
                                            <td>款号</td>
                                            <td>款名</td>
                                            <td>版型</td>
                                            <td>件数</td>
                                            <td>接单日期</td>
                                            <td>跟单人</td>
                                            <td>客户订单</td>
                                            <td>版期</td>
                                            <td>季度</td>
                                            <td style="display: none">样衣ID</td>
                                        </tr>




                                        <tbody><!--分页内容-->

                                               <tr  v-for="sam in samlist">
                                                   <td v-text="sam.sampleno"></td>
                                                   <td v-text="sam.customername"></td>
                                                   <td v-text="sam.stylename"></td>
                                                                            <td v-text="sam.stylenum"></td>
                                        <td>{{sam.stylename}}</td>
                                        <td>{{sam.sampletypename}}</td>
                                        <td>{{sam.receptnum}}</td>
                                        <td>{{sam.opendate}}</td>
                                        <td>{{sam.auditor}}</td>
                                        <td>{{sam.customerno}}</td>
                                        <td>{{sam.edationdate}}</td>
                                        <td>{{sam.describle}}</td>
                                        <td style="display: none">{{sam.sampleid}}</td>
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
</body>

</html>
<script>
    var newlist = new Vue({
           el: '#app',
        mounted: function(){
            laydate.render({
                elem: '#test1' //指定元素
                ,theme: '#347AB6'//指定颜色
            }).bind('datepicker-change', this.setDate);
        },
           data: {
               samlist:[],
             nowPage: 1, //当前页
               pageSize:5,//每页显示的条数
                 pages: 50, //总页数
                 changePage:'',//跳转页
                 nowIndex:0,
                 cuslist:[],
               stylelist:[],
               quarterlylist:[],
               sampletypelist:[],
               customerid:"",
               styleid:"",
               sampleno:"",
               quarterlyid:"",
               sampletypeid:"",
               opendates:""
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
   this.opendates=$("#test1").val();
               this.nowPage=obj;
               var parames={"pageSize":this.pageSize,"pageNum":obj,"customerid":this.customerid,"styleid":this.styleid,"sampleno":this.sampleno,"quarterlyid":this.quarterlyid,"sampletypeid":this.sampletypeid,"opendate":this.opendates}
               this.$http.post("cmy/getAllSampleListByPage_cmy",parames,{emulateJSON:true}).then(
                   function(res){
                       this.samlist=res.data.list;
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
           getCus:function(){
               this.$http.post("cmy/getCustomer_cmy",{emulateJSON:true}).then(
                   function (res) {
                       this.cuslist=res.body;
                   }
               )
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
           }


       },
        created:function(){
            this.getList(1);
            this.getCus();
            this.getQuarterly();
            this.getSampletype();
            this.getStylelibrary();

        },
        watch:{ //监听每页显示条数的变化
            "pageSize":function(){
                this.getList(1);
            },
            "opendates":function(){
                this.getList(1);
            },
            "sampleno":function(){
                this.getList(1);
            },
            "customerid":function(){
                this.getList(1);
            },
            "styleid":function(){
                this.getList(1);
            },
            "quarterlyid":function(){
                this.getList(1);
            },
            "sampletypeid":function(){
                this.getList(1);
            }

        }
    })
    //执行一个laydate实例
    /*  laydate.render({
          elem: '#test1' //指定元素
          ,theme: '#347AB6'//指定颜色
      }).bind('datepicker-change',newlist.getDate());
  */
</script>
