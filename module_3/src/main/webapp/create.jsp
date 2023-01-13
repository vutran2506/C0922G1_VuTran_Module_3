<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/11/2023
  Time: 6:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>...</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
          crossorigin="anonymous">
</head>
<body>
<%--header--%>
<div class="row bg-primary">
    <nav class="navbar bg-primary">
        <div class="container-fluid ">
            <span><img src="https://pic.trangvangvietnam.com/395681342/logo%20chuan.jpg" alt="Logo" width="150" height="50"
                       class="d-inline-block align-text-top"></span>
            <span style="float: right ; font-size: large ; margin-right: 100px ">Trần Ngọc Vũ</span>
        </div>
    </nav>
</div>

<%--Conten--%>
<div class="row" style="width: 100%">
    <div style="width: 70%; margin: 0 auto">

        <p>
            <button class="btn btn-outline-success"><span style="color: black;text-decoration: none "><a href="/nha" style="color: black ;text-decoration: none ">Trở về danh sách khác hàng</a></span></button>
        </p>
        <form action="/nha?action=create" method="post">
            <fieldset>
                <table>

                    <tr>
                        <td>Tên</td>
                        <td><input type="text" name="ten" style="width: 500px" required></td>
                    </tr>
                    <tr>
                        <td>Diện Tích</td>
                        <td><input type="text" name="dienTich" style="width: 500px "  required></td>
                    </tr>
                    <tr>
                        <td>Số tầng</td>
                        <td><input type="text" name="soTang" style="width: 500px "  required></td>
                    </tr>

                    <tr>
                    <td>Ngày bắt đầu</td>
                    <td><input type="date" name="ngayBatDau" style="width: 500px "  required></td>
                </tr>
                    <tr>
                        <td>Ngày kết thúc</td>
                        <td><input type="date" name="ngayKetThuc" style="width: 500px "  required></td>
                    </tr>
                    <tr>
                        <td>Giá</td>
                        <td><input type="text" name="gia" style="width: 500px "  required></td>
                    </tr>
                    <tr>
                        <td>Trạng thái phòng</td>
                        <td>
                            <select name="trangThai" required>
                            <c:forEach var="trangThaiList" items="${trangThaiList}">
                                <option value="${trangThaiList.getId()}" > ${trangThaiList.getTenTrangThai()}</option>
                            </c:forEach>
                        </select>
                        </td>
                    </tr>

                    <tr>
                        <td>Loai Phòng</td>
                        <td>
                            <select name="loaiPhong" required>
                            <c:forEach var="loaiPhongList" items="${loaiPhongList}">
                                <option value="${loaiPhongList.getId()}" > ${loaiPhongList.getTenLoaiPhong()}</option>
                            </c:forEach>
                        </select>
                        </td>
                    </tr>

                        <td></td>
                        <td>
                            <button type="submit" class="btn btn-outline-success" ><span style="color: black ">Thêm khách hàng</span></button>
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </div>
</div>

<%--footer--%>
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

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</html>

