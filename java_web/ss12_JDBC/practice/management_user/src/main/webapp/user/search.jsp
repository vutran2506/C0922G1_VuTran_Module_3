<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/4/2023
  Time: 8:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search User</title>
</head>
<body>
<table border="1">
  <tr>
    <td>ID</td>
    <td>Name</td>
    <td>Email</td>
    <td>Country</td>
    <td>Edit</td>
    <td>Delete</td>
  </tr>
  <c:forEach var="user" items="${userList}">
    <tr>
      <td><a href="/User?action=view&id=${user.getId()}">${user.getId()}</a></td>
      <td>${user.getName()}</td>
      <td>${user.getEmail()}</td>
      <td>${user.getCountry()}</td>
      <td><a href="/User?action=edit&id=${user.getId()}">Edit</a></td>
      <td><a href="/User?action=delete&id=${user.getId()}">Delete</a></td>

    </tr>
  </c:forEach>
</table>
</body>
</html>
