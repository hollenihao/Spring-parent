<%--
  Created by IntelliJ IDEA.
  User: Charlie
  Date: 2019/11/18
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="static/jquery-3.3.1.min.js"></script>
</head>
<body>
<h1>id${empv.id} ${empv.name} ${empv.birthday}</h1>

<input type="button" value="list" id="btnList">
<input type="button" value="insert" id="btnInsert">

<script>
    $(function () {
        $("#btnList").click(function () {
            $.ajax({
url:"/list",
type:"GET",
success:function (data) {
    console.log(data);
    alert(data.name);
}
            });
        });//btnList end

        /**
         *
         */
        $("#btnInsert").click(function () {
    var data = {id:100,name:"client"}
                $.ajax({
                    url:"/insert",
                    data:JSON.stringify(data),
                    type:"POST",
                    contentType:"application/json",
                    dataType:"Json",
                     success:function (data) {
                    alert(data.name)
            }
            });
        });
    });
</script>
</body>
</html>
