<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Thêm Mới Khách Hàng</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
          crossorigin="anonymous">
</head>
<body>
<div class="row bg-primary">
    <nav class="navbar bg-primary">
        <div class="container-fluid ">
            <span><img src="https://2.bp.blogspot.com/-jSZHyR7WoY0/VKtWJbaS2UI/AAAAAAAALWA/yxXe6bJlklU/s1600/quyet-tam-thi-do.png" alt="Logo" width="150"
                       height="50"
                       class="d-inline-block align-text-top"></span>
            <span style="float: right ; font-size: large ; margin-right: 100px ">Trần Ngọc Vũ</span>
        </div>
    </nav>
</div>
<div class="row" style="width: 100%">
    <div style="width: 70%; margin: 0 auto">

        <p>
            <button class="btn btn-outline-success"><span style="color: white;text-decoration: none "><a
                    href="/Customer" style="color: black ;text-decoration: none ">Trở về danh sách khác hàng</a></span>
            </button>
        </p>
        <form action="/Customer?action=create" method="post">
            <fieldset>
                <table>
                    <tr>
                        <td>Mã khách hàng</td>
                        <td><input type="text" name="id" style="width: 500px" required></td>
                    </tr>
                    <tr>
                        <td>Loại khách hàng</td>
                        <td>
                            <select name="typeId" required>
                                <c:forEach var="customerType" items="${typeList}">
                                    <option value="${customerType.getIdCustomerType()}"> ${customerType.getNameCustomerType()}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Tên khách hàng</td>
                        <td><input pattern="^[A-Z][a-z]*(\s[A-Z][a-z]*)+$" title="Nhập tên không đúng" type="text" oninput="checkName(this.value)" name="name" style="width: 500px"
                                   required><span style="color:red;" id="errorName"></span></td>
                    </tr>
                    <tr>
                        <td>Ngày sinh</td>
                        <td><input type="date" name="dateOfBirth" style="width: 500px " required></td>
                    </tr>
                    <tr>
                        <td>Giới tính</td>
                        <td><input type="radio" name="gender" value="true" checked> Nam
                            <input type="radio" name="gender" value="false"> Nữ<br>
                        </td>
                    </tr>
                    <tr>
                        <td>CMND</td>
                        <td><input type="text" name="idCard" style="width:500px" required></td>
                    </tr>
                    <tr>
                        <td>Số điện thoại</td>
                        <td><input type="text" name="phone" style="width: 500px" required></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="email" style="width: 500px" required></td>
                    </tr>
                    <tr>
                        <td>Địa chỉ</td>
                        <td><input  type="text" name="address" style="width: 500px" required></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button type="submit" class="btn btn-outline-success"><span style="color: black ">Thêm khách hàng</span>
                            </button>
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </div>
</div>
<div class="row">
    <div>
        <footer class="bg-primary text-white text-center text-lg-start">
            <div class="container p-4">
                <div class="row">
                    <div class="col-lg-6 col-md-12 mb-4 mb-md-0">
                        <h5 class="text-uppercase">Footer Content</h5>

                        <p>
                            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Iste atque ea quis
                            molestias. Fugiat pariatur maxime quis culpa corporis vitae repudiandae aliquam
                            voluptatem veniam, est atque cumque eum delectus sint!
                        </p>
                    </div>

                    <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
                        <h5 class="text-uppercase mb-0">Links</h5>

                        <ul class="list-unstyled">
                            <li>
                                <a href="#!" class="text-white">Link 1</a>
                            </li>
                            <li>
                                <a href="#!" class="text-white">Link 2</a>
                            </li>
                        </ul>
                    </div>

                </div>
            </div>
            <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
                <a class="text-white" href="https://mdbootstrap.com/">MDBootstrap.com</a>
            </div>
        </footer>
    </div>
</div>
</body>

<%--Regex html--%>
<script>
    function checkName(name1) {
        var errorName = document.getElementById("errorName");
        var regexName = /^[A-Z][a-z]*(\s[A-Z][a-z]*)+$/;
        if (!regexName.test(name1)) {
            errorName.innerHTML = "Nhập tên không đúng";
        } else {
            errorName.innerHTML = "";
        }
    }

</script>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</html>
