<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-10-15
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">

<html>
<head>
    <title>Title</title>
</head>
  <style>
      * {font-family:"楷体"}

  </style>
<div>
<div class="title_right">
    <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Search for...">
            <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
        </span>
        </div>
    </div>
</div>
</div>

   <table class="table table-hover table-striped table-condensed" >
       <tr>
           <h3>客户管理</h3>
       </tr>
       <tr>
           <a data-toggle="modal" data-target="#myModal">添加 </a>
       </tr>
        <tr style="background-color:#0D3349;color:#FFFFFF;">
            <td>客户编号</td>
            <td>客户名称</td>
            <td>客户简称</td>
            <td>客户状态</td>
            <td>备注</td>
            <td colspan="2px">操作</td>
        </tr>
       <tbody id="tab">

       </tbody>
   </table>

<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    模态框（Modal）标题
                </h4>
            </div>
            <div class="modal-body">
                在这里添加一些文本
           </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
                <button type="button" class="btn btn-primary">
                    提交更改
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div>
</div>
</body>
</html>
<!-- Bootstrap -->
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="js/jquery-1.10.2.min.js"></script>

<script>
     $(function(){
         queryCustomer();
     })
     function queryCustomer(){
         $.ajax({
             url:"customer/queryCustomer",
             dataType:"json",
             type:"post",
             success:function(data){
                 var tr="";
                 for(var i=0;i<data.length;i++){
                     tr+="<tr><td>"+data[i].customerid+"</td><td>"+data[i].customername+"</td><td>"+data[i].abbreviation+"</td><td>"+data[i].state+"</td><td>"+data[i].remark+"</td></tr>";

                 }
                 $("#tab").append(tr);
             },
         })

     }

</script>
