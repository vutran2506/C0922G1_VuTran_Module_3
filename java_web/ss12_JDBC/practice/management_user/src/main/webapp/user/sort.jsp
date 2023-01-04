<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sort By Name</title>
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
