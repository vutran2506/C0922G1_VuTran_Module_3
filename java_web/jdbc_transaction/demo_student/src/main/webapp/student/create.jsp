<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Thêm mới sinh viên</h1>
<a href="/student">Quay lại danh sách</a>
<p style="color: red">${mess}</p>
<form action="/student" method="post">
    <input name="action" value="create" hidden>
    <input  name="name" placeholder="nhập tên">
    <br>
    <input type="radio" name="gender" value="true"> Nam
    <input type="radio" name="gender" value="false"> Nữ<br>
    <input type="number" name="point" placeholder="nhập điểm" required><br>
    <select name="classId">
        <option value="0">Chon lớp</option>
        <c:forEach var="clazz" items="${clazzList}">
            <option value="${clazz.id}">${clazz.name}</option>
        </c:forEach>
    </select>><br>
    <button disabled id="btnSave" type="submit">Save</button>
</form>
</body>
</html>
