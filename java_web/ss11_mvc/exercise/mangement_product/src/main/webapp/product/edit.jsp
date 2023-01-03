<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Edit Product</title>
</head>
<body>

<h1>Edit Product</h1>
<p>
  <c:if test='${requestScope["message"] != null}'>
    <span class="message">${requestScope["message"]}</span>
  </c:if>
</p>
<p>
  <a href="/Products">Back to product list</a>
</p>
<form method="post">
  <fieldset>
    <legend>Product information</legend>
    <table>
      <tr>
        <td>Name Product: </td>
        <td><input type="text" name="name"  value="${requestScope["product"].getNameProduct()}"></td>
      </tr>
      <tr>
        <td>Price Product: </td>
        <td><input type="text" name="price" value="${requestScope["product"].getPriceProduct()}"></td>
      </tr>
      <tr>
        <td>Description Product: </td>
        <td><input type="text" name="description"  value="${requestScope["product"].getDescriptionProduct()}"></td>
      </tr>
      <tr>
        <td>Brand Product: </td>
        <td><input type="text" name="brand" value="${requestScope["product"].getBrandProduct()}"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Update Product"></td>
      </tr>
    </table>
  </fieldset>
</form>
</body>
</html>
