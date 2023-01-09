<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
<html>
<head>
    <title>User List</title>
</head>
<body>
<h1 style="text-align: center">User</h1>
<button> <a href="/Customer">Back to List User</a></button>
<c:if test='${requestScope["message"] != null}'>
    <span class="message">${requestScope["message"]}</span>
</c:if>
</p>
</p>
<form action="/Customer?action=edit" method="post">
    <table>
        <tr hidden>
            <td>Id User</td>
            <td><input type="text" name="id" value="${customer.getId()}"></td>
        </tr>
        <tr>
            <td>Name User</td>
            <td><input type="text" name="name" value="${customer.getName()}"></td>
        </tr>
        <tr>
            <td>Email User</td>
            <td><input type="text" name="email" value="${customer.getEmail()}"></td>
        </tr>
        <tr>
            <td>Country User</td>
            <td><input type="text" name="country" value="${customer.getCountry()}"></td>
        </tr>
        <tr>
            <td></td>
            <td><button type="submit">Edit User</button></td>
        </tr>
    </table>
</form>
</body>
</html>
