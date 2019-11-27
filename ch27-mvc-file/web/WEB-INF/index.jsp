<%--
  Created by IntelliJ IDEA.
  User: Charlie
  Date: 2019/11/20
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" enctype="multipart/form-data" action="/upload">

<input type="file" name="multipartFile"/>
<input type="submit" value="提交"/>
</form>

<%--  路径是保存D： --%>
<a herf="D/?filename=2.jpg">下载（文件名有中文）</a>
<a herf="D/?filename=001.jpg">下载</a>

<img src="D/?filename=2.jpg"/>
</body>
</html>
