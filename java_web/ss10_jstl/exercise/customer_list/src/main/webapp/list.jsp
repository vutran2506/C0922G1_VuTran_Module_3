<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/30/2022
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
<html>
<head>
    <title>Customer List</title>

<style>
    img {
        width: 50px;
    }

    th, td, h1 {
        text-align: center;
    }
</style>
</head>
<body>
<div style="width: 50%; height: 50%;">
    <h1>Danh Sách Khách Hàng</h1>
    <table class="table  ">
        <tr>
            <thead>
            <th>STT</th>
            <th>Name</th>
            <th>Date Of Birth</th>
            <th>Address</th>
            <th>Img</th>
            </thead>
            <tbody>
            <c:forEach var="cumtomer" items="${CustomerServlet}" varStatus="status">
                <tr>
                    <td>${status.count}</td>
                    <td>${cumtomer.name}</td>
                    <td>${cumtomer.dateOfBirth}</td>
                    <td>${cumtomer.address}</td>
                    <td><img src=${cumtomer.img}></td>
                </tr>
            </c:forEach>
            </tbody>
        </tr>
    </table>
</div>
</body>
</html>
