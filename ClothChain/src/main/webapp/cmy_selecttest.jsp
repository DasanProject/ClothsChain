<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-10-15
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   页数：<input id="pageNum"><br/>
   每页显示条数：<input id="pageSize"/><br/>
     <input type="button" id="btntest" value="分页查询">

</body>
</html>
<script src="vendors/jquery/dist/jquery.min.js"></script>
<script>
    $("#btntest").click(function () {

        $.ajax({
            url:"aaa/getAdmissionAll_cmy",
            data:{"pageNum":$("#pageNum").val(),"pageSize":$("#pageSize").val()},
            dataType:"json",
            success:function (data) {
                for (var i=0;i<data.list.length;i++){
                    alert(data.list[i].admissionmoney);
                }
            }
        })

    });
</script>