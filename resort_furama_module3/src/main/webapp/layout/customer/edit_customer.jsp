
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Chỉnh Sửa Khách Hàng</title>
</head>
<body>
<h1>Chỉnh Sửa Khách Hàng</h1>
<p>
    <a href="/Customer">Trở về danh sách khác hàng</a>
</p>
<form action="/Customer?action=edit" method="post">
    <fieldset>
        <legend> Chỉnh sửa khách hàng</legend>
        <table>
            <tr hidden>
                <td>Mã khách hàng</td>
                <td><input type="text" name="id" value="${customer.getId()}"></td>
            </tr>
            <tr>
                <td>Loại khách hàng</td>
                <td>
                    <select name="typeId"  >
                        <c:forEach var="customerType" items="${typeList}">
                            <option value="${customerType.getIdCustomerType()}"> ${customerType.getNameCustomerType()}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Tên khách hàng</td>
                <td><input type="text" name="name" value="${customer.getName()}"></td>
            </tr>
            <tr>
                <td>Ngày sinh</td>
                <td><input type="date" name="dateOfBirth" value="${customer.getDateOfBirth()}"></td>
            </tr>
            <tr>
                <td>Giới tính</td>
                <td><input type="radio" name="gender" checked value="true"> Nam
                    <input type="radio" name="gender" value="false"> Nữ<br>
                </td>
            </tr>
            <tr>
                <td>CMND</td>
                <td><input type="text" name="idCard" value="${customer.getIdCard()}"></td>
            </tr>
            <tr>
                <td>Số điện thoại</td>
                <td><input type="text" name="phone" value="${customer.getPhoneNumber()}"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" value="${customer. getEmail()}"></td>
            </tr>
            <tr>
                <td>Địa chỉ</td>
                <td><input type="text" name="address" value="${customer.getAddress()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><button type="submit"> Chỉnh Sửa Khách Hàng </button></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
