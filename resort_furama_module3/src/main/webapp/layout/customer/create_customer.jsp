
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Thêm Mới Khách Hàng</title>
</head>
<body>
<h1>Thêm Mới Khách Hàng</h1>
<p>
    <a href="/Customer">Trở về danh sách khác hàng</a>
</p>
<form action="/Customer?action=create" method="post">
    <fieldset>
        <legend> User Information</legend>
        <table>
            <tr>
                <td>Mã khách hàng</td>
                <td><input type="text" name="id" ></td>
            </tr>
            <tr>
                <td>Loại khách hàng</td>
                <td>
                    <select name="typeId" >
                    <c:forEach var="customerType" items="${typeList}">
                            <option value="${customerType.getIdCustomerType()}"> ${customerType.getNameCustomerType()}</option>
                    </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Tên khách hàng</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
            <td>Ngày sinh</td>
            <td><input type="date" name="dateOfBirth"></td>
        </tr>
            <tr>
                <td>Giới tính</td>
                <td><input type="radio" name="gender" value="true"> Nam
                    <input type="radio" name="gender" value="false"> Nữ<br>
                </td>
            </tr>
            <tr>
                <td>CMND</td>
                <td><input type="text" name="idCard"></td>
            </tr>
            <tr>
                <td>Số điện thoại</td>
                <td><input type="text" name="phone"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>Địa chỉ</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td></td>
                <td><button type="submit">Create User </button></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
