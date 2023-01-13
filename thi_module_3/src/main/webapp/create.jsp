<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>


  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%--    phân trang--%>
  <link rel="stylesheet" href="bootstrap520/css/bootstrap.min.css"/>
  <link rel="stylesheet" href="datatables/css/dataTables.bootstrap5.min.css"/>

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
        rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
        crossorigin="anonymous">

</head>
<body>
<%--Header--%>
<div class="row bg-primary">
  <nav class="navbar bg-primary">
    <div class="container-fluid ">
            <span><img src="https://pic.trangvangvietnam.com/395681342/logo%20chuan.jpg" alt="Logo" width="150" height="50"
                       class="d-inline-block align-text-top"></span>
      <span style="float: right ; font-size: large ; margin-right: 100px ">Trần Ngọc Vũ</span>
    </div>
  </nav>
</div>
<%--Tiêu đề--%>
<div class="row">
  <div class="col-md-12 d-flex justify-content-center">
    <h1>Danh Sách Nhân Viên</h1>
  </div>
</div>

<%--Thêm mới--%>
<div class="row">
  <div>
    <button type="button" class="btn btn-primary">Thống kê danh sách dang mượn</button>
  </div>
</div>
<%--Conten--%>
<div class="row">

  <table class="table table-primary table-info border-danger border-secondary table-hover table-striped " id="tableEmployee">
    <thead class="table-light">
    <tr>
      <th scope="row">Mã Sách</th>
      <th>Tên sách</th>
      <th>Tác giả</th>
      <th>Số lượng</th>
      <th>Mô tả</th>
      <th>Mượn</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="muonSachList" items="${muonSachList}">
      <tr>

        <td>${muonSachList.getMaMuonSach()}</td>
        <td>${muonSachList.getTen() }</td>
        <td>${muonSachList.getTacGia() }</td>
        <td>${muonSachList.getSoLuong()}</td>
        <td>${muonSachList.getMoTa()}</td>


        <td><a href="" class="btn btn-outline-secondary">Mượn</a>
        </td>

      </tr>
    </c:forEach>

    </tbody>

  </table>

</div>

<%--Modal--%>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="exampleModalLabel">Delete</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <form action="/Customer?action=delete" method="post">
        <div class="modal-body">
          <input hidden type="text" id="id" name="id">
          <span>You Want To Delete: </span><span id="name"></span>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
          <button type="submit" class="btn btn-primary">Delete</button>
        </div>
      </form>
    </div>
  </div>
</div>

<%--Footer--%>
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

<%--Modal--%>
<div>
  <script>
    function infoDelete(id, name) {
      document.getElementById("id").value = id;
      document.getElementById("name").innerText = name;
    }
  </script>
</div>

</body>

<%--phân trang--%>
<div>

  <script src="jquery/jquery-3.5.1.min.js"></script>
  <script src="datatables/js/jquery.dataTables.min.js"></script>
  <script src="datatables/js/dataTables.bootstrap5.min.js"></script>
  <script>
    $(document).ready(function () {
      $('#tableEmployee').dataTable({
        "dom": 'lrtip',
        "lengthChange": false,
        "pageLength": 3
      });
    });
  </script>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</html>