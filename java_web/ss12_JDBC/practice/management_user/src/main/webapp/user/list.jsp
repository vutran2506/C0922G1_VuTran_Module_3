<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<html>
<head>
    <title>User List</title>
</head>
<body>
<h1 style="text-align: center">USERS</h1>
<button style="background: green"><a href="/User?action=create">Create User</a></button>

<p>
    <a href="/User?action=sort">Sort By Name User</a>
</p>

<form action="/User?action=search" method="post">
    <input type="text" name="search">
    <button type="submit">Search</button>
    <table class="table table-striped">
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
</form>
</body>

</html>
