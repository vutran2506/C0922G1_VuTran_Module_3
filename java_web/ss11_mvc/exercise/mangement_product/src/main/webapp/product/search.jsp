<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/4/2023
  Time: 7:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Search Product</title>
</head>
<body>
<h3> Product is:</h3>
<table border="1">
    <tr>
        <td>Name Product</td>
        <td>Price Product</td>
        <td>Description Product</td>
        <td>Brand Product</td>
        <td>Edit Product</td>
        <td>Delete Product</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="/Products?action=view&id=${product.getId()}">${product.getNameProduct()}</a></td>
            <td>${product.getPriceProduct()}</td>
            <td>${product.getDescriptionProduct()}</td>
            <td>${product.getBrandProduct()}</td>
            <td><a href="/Products?action=edit&id=${product.getId()}">Edit</a></td>
            <td><a href="/Products?action=delete&id=${product.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
