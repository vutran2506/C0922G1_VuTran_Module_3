<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/4/2023
  Time: 12:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<table>
  <tr>
    <td>Name Product: </td>
    <td>${requestScope["product"].getNameProduct()}</td>
  </tr>
  <tr>
    <td>Price Product: </td>
    <td>${requestScope["product"].getPriceProduct()}</td>
  </tr>
  <tr>
    <td>Description Product: </td>
    <td>${requestScope["product"].getDescriptionProduct()}</td>
  </tr>
  <tr>
    <td>Brand Product: </td>
    <td>${requestScope["product"].getBrandProduct()}</td>
  </tr>
  <tr>
    <td></td>
    <td><a href="/Products">Back to product list</a></td>
  </tr>
</table>
</body>
</html>
