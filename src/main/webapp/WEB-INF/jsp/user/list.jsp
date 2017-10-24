<%--
  Created by IntelliJ IDEA.
  User: Rafał Ochotny
  Date: 23.10.2017
  Time: 09:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<spring:url value="/register" var="addURL" />
<a href="${addURL}">Register</a>
<table width="50%" border = "1" style="text-align: center">
    <tr>
        <td>username</td>
        <td>password</td>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>