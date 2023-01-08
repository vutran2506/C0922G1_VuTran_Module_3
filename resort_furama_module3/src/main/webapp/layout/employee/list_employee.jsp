<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous">
  </script>

</head>
<body>
<div class="row m-lg-1 bg-gray ">
  <div class="col-md-2 d-flex justify-content-center  ">
    <div>
      <img src="https://furamavietnam.com/wp-content/uploads/2018/08/logo.png">
    </div>
  </div>
  <div class="col-md-2"></div>
  <div class="col-md-3 ">
        <span>
103 – 105 Đường Võ Nguyên Giáp, Phường Khuê Mỹ, Quận Ngũ hành Sơn, Tp. Đà Nẵng, Việt Nam

7.0 km từ Sân bay Quốc tế Đà Nẵng</span>
  </div>
  <div class="col-md-3">
        <span>84-236-3847 333/888
reservation@furamavietnam.com
        </span></div>
  <div class="col-md-2 d-flex justify-content-center align-items-center">
    <p>Trần Ngọc Vũ</p>
  </div>
</div>
<div class="row bg-body-tertiary">
  <div class="col-md-12 d-flex justify-content-center">
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
      <div class="container-fluid">
        <a class="navbar-brand" href="#">Trang Chủ</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                 aria-expanded="false">
                Nhân Viên
              </a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">Action</a></li>
                <li><a class="dropdown-item" href="#">Another action</a></li>
                <li>
                  <hr class="dropdown-divider">
                </li>
                <li><a class="dropdown-item" href="#">Something else here</a></li>
              </ul>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                 aria-expanded="false">
                Khách Hàng
              </a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">Action</a></li>
                <li><a class="dropdown-item" href="#">Another action</a></li>
                <li>
                  <hr class="dropdown-divider">
                </li>
                <li><a class="dropdown-item" href="#">Something else here</a></li>
              </ul>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                 aria-expanded="false">
                Dịch Vụ
              </a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">List Service</a></li>

                <li><a class="dropdown-item" href="#">Add Service</a></li>
                <li>
                  <hr class="dropdown-divider">
                </li>
                <li><a class="dropdown-item" href="#">Edit Service</a></li>
              </ul>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                 aria-expanded="false">
                Hợp Đồng
              </a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">Action</a></li>
                <li><a class="dropdown-item" href="#">Another action</a></li>
                <li>
                  <hr class="dropdown-divider">
                </li>
                <li><a class="dropdown-item" href="#">Something else here</a></li>
              </ul>
            </li>
          </ul>
          <form class="d-flex" role="search">
            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success " type="submit">Tìm Kiếm</button>
          </form>
        </div>
      </div>
    </nav>
  </div>

</div>
<div>
  <div class="row">
    <div class="col-md-12 d-flex justify-content-center">
      <h1>Danh Sách Nhân Viên</h1>
    </div>
  </div>
  <div class="row">
    <div>
      <button type="button" class="btn btn-primary">Thêm Mới Nhân Viên</button>
    </div>
  </div>
  <div class="row">
    <div>
      <table class="table table-primary table-info border-danger border-secondary table-hover">
        <thead class="table-light">
        <tr>
          <th scope="row">STT</th>
          <th>Tên Nhân Viên</th>
          <th>CMND</th>
          <th>Ngày Sinh</th>
          <th>Lương</th>
          <th>Số Điện Thoại</th>
          <th>Mail</th>
          <th>Địa Chỉ</th>
          <th>Position_id</th>
          <th>Trình Độ Học Vấn</th>
          <th>Division</th>
          <th>Username</th>
          <th>Edit</th>
          <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <tr>
          <th scope="row">1</th>
          <th>Phan Van Hung</th>
          <th>1223</th>
          <th>01/01/2001</th>
          <th>1000$</th>
          <th>456</th>
          <th>hung@gmail.com</th>
          <th>Nghe An</th>
          <th>Employee</th>
          <th>University</th>
          <th>Abc</th>
          <th>HungPV</th>
          <td>
            <button type="button" class=" btn-sm btn btn-primary ">Edit</button>
          </td>
          <td>
            <button type="button" class=" btn-sm btn btn-outline-danger" data-bs-toggle="modal"
                    data-bs-target="#exampleModal">
              Delete
            </button>
          </td>
        </tr>
        <tr>
          <th scope="row">2</th>
          <th>Bui Duc Vu</th>
          <th>159</th>
          <th>01/01/2000</th>
          <th>1000$</th>
          <th>123</th>
          <th>vu@gmail.com</th>
          <th>Quang Tri</th>
          <th>Employee</th>
          <th>University</th>
          <th>Anc</th>
          <th>VuBD</th>
          <td>
            <button type="button" class=" btn-sm btn btn-primary ">Edit</button>
          </td>
          <td>
            <button type="button" class=" btn-sm btn btn-outline-danger" data-bs-toggle="modal"
                    data-bs-target="#exampleModal">
              Delete
            </button>
          </td>
        </tr>

        <!--    Modal-->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal"
                        aria-label="Close"></button>
              </div>
              <div style="" class="modal-body">
                ...
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
              </div>
            </div>
          </div>
        </div>
        </tbody>
      </table>
    </div>
  </div>
</div>
<div class="row">
  <div>
    <footer class="bg-primary text-white text-center text-lg-start">
      <!-- Grid container -->
      <div class="container p-4">
        <!--Grid row-->
        <div class="row">
          <!--Grid column-->
          <div class="col-lg-6 col-md-12 mb-4 mb-md-0">
            <h5 class="text-uppercase">Footer Content</h5>

            <p>
              Lorem ipsum dolor sit amet consectetur, adipisicing elit. Iste atque ea quis
              molestias. Fugiat pariatur maxime quis culpa corporis vitae repudiandae aliquam
              voluptatem veniam, est atque cumque eum delectus sint!
            </p>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
            <h5 class="text-uppercase">Links</h5>

            <ul class="list-unstyled mb-0">
              <li>
                <a href="#!" class="text-white">Link 1</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 2</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 3</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 4</a>
              </li>
            </ul>
          </div>
          <!--Grid column-->

          <!--Grid column-->
          <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
            <h5 class="text-uppercase mb-0">Links</h5>

            <ul class="list-unstyled">
              <li>
                <a href="#!" class="text-white">Link 1</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 2</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 3</a>
              </li>
              <li>
                <a href="#!" class="text-white">Link 4</a>
              </li>
            </ul>
          </div>
          <!--Grid column-->
        </div>
        <!--Grid row-->
      </div>
      <!-- Grid container -->

      <!-- Copyright -->
      <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
        © 2020 Copyright:
        <a class="text-white" href="https://mdbootstrap.com/">MDBootstrap.com</a>
      </div>
      <!-- Copyright -->
    </footer>
  </div>
</div>
</body>
</html>