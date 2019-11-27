<%--
  Created by IntelliJ IDEA.
  User: Charlie
  Date: 2019/10/30
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>id</tr>
    <tr>username</tr>
    </thead>
        <tbody>
        <:c:forEach items="${pageInfo.list}" var="emp">
            <tr>${emp.id}</tr>
            <tr>${emp.username}</tr>
        </:c:forEach>
        </tbody>
</table>

<a href="/index?page=1&pageSize=${pageInfo.pageSize}">首页</a>
<a href="/index?page=${pageInfo.prePage}&pageSize=${pageInfo.pageSize}">上一页</a>
<a href="/index?page=${pageInfo.nextPage}&pageSize=${pageInfo.PageSize}">下一页</a>
<a href="/index?page=${pageInfo.pages}&pageSize=${pageInfo.PageSize}">尾页</a>

<ul>
    <c:forEach items="${pageInfo.uavigatepageNums}" var="num">
        <li><a href="/index?page=#{num}&pageSize=${pageInfo.Size}">${num}</a></li>
    </c:forEach>
</ul>
</body>
</html>
