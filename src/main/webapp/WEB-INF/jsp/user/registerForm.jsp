<%--
  Created by IntelliJ IDEA.
  User: Rafał Ochotny
  Date: 23.10.2017
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<spring:url value="/save" var="saveURL" />
<form:form action="${saveURL}" method="POST" modelAttribute="userForm">
    <form:hidden path="id"/>
    <table>
        <tr>
            <td>Username:</td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><form:input path="password" /></td>
        </tr>
        <tr>
            <td></td>
            <td><button type="submit">Save</button> </td>
        </tr>

    </table>
</form:form>
</body>
</html>