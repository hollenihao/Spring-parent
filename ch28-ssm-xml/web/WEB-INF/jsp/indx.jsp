<%--
  Created by IntelliJ IDEA.
  User: Charlie
  Date: 2019/11/21
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>username</th>
        <th>hiredate</th>
        <th>salary</th>
    </tr>
<c:forEach items="${list.list}" var="emp">
    <tr>
        <td>${emp.id}</td>
        <td>${emp.username}</td>
        <td>${emp.hiredate}</td>
        <td>${emp.salary}</td>
    </tr>
</c:forEach>
</table>

<ul>
    <li><a href="/list?pageNum=1">首页</a></li>
    <li><a href="/list?pageNum=${list.prePage}">上一页</a> </li>
    <li><a href="/list?pageNum=${list.nextPage}">下一页</a></li>
    <li><a href="/list?pageNum-${list.pages}">尾页</a></li>
    <c:forEach items="${lsit.navigatepageNums}" var="p">
        <li><a href="/list?pageNum=${p}">${p}</a></li>
    </c:forEach>
</ul>
</body>
</html>
