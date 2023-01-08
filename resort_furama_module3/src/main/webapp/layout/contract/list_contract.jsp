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
<div class="row">
  <div class="col-md-12 d-flex justify-content-center">
    <h1 class="text-center " >Danh Sách Hợp Đồng </h1>
  </div>
</div>
<div class="row">
  <div class="col-md-3">
    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal"
            data-bs-whatever="@mdo" >Danh Sách Hợp Đồng
    </button>
  </div>
  <div class="col-md-9"></div>
</div>
<div class="row">

  <table class="table table-primary table-info border-danger border-secondary table-hover">
    <thead class="table-light">
    <tr>
      <th scope="col">Dịch vụ</th>
      <th scope="col">Khách hàng</th>
      <th scope="col">Ngày bắt đầu</th>
      <th scope="col">Ngày kết thúc</th>
      <th scope="col">Tiền đặt cọc</th>
      <th scope="col">Tổng Tiền</th>
      <th scope="col" rowspan="2">Các dịch vụ đi kèm</th>
    </tr>
    </thead>
    <tbody class="table-light">
    <tr>
      <td>Room Twin 01</td>
      <td>Phan Văn Hùng</td>
      <td>14/02/2022</td>
      <td>16/02/2020</td>
      <td>0</td>
      <td>100000</td>
      <td>
        <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#example"
                data-bs-whatever="@mdo">+
        </button>
        <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop"
                data-bs-whatever="@fat">Hiển thị danh sách dịch vụ
        </button>
      </td>
    </tr>
    </tbody>
  </table>

  <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h1 class="modal-title fs-5" id="exampleModalLabel">Thêm Mới Hợp Đồng Chi Tiết</h1>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <form>
            <div class="mb-3">
              <label for="recipient-name" class="col-form-label">Ngày bắt đầu:</label>
              <input type="text" class="form-control" id="recipient-name">
            </div>
            <div class="mb-3">
              <label for="recipient-name" class="col-form-label">Ngày kết thúc:</label>
              <input type="text" class="form-control">
            </div>
            <div class="mb-3">
              <label for="recipient-name" class="col-form-label">Tiền gửi</label>
              <input type="text" class="form-control">
            </div>
            <div class="mb-3">
              <label for="recipient-name" class="col-form-label">Tổng tiền</label>
              <input type="text" class="form-control" disabled readonly aria-label="Disabled input example">
            </div>
            <div class="mb-3">
              <label class="form-label">Chọn khách hàng</label>
              <select class="form-select" aria-label="Default select example">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
              </select>
            </div>
            <div class="mb-3">
              <label class="form-label">Chọn dịch vụ</label>
              <select class="form-select" aria-label="Default select example">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
              </select>
            </div>
            <div class="mb-3">
              <label class="form-label">Dịch vụ đi kèm </label>
              <button type="button" class="btn btn-primary" data-bs-toggle="modal"
                      data-bs-target="#example" data-bs-whatever="@mdo">+
              </button>
            </div>
          </form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy Bỏ</button>
          <button type="button" class="btn btn-primary">Tạo Hợp Đồng</button>
        </div>
      </div>
    </div>
  </div>


  <div class="modal fade" id="example" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h1 class="modal-title fs-5">Thêm Mới Dịch Vụ Đi Kèm</h1>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <form>
            <div class="mb-3">
              <label class="form-label">Chọn loại dịch vụ</label>
              <select class="form-select" aria-label="Default select example">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
              </select>
            </div>
            <div class="mb-3">
              <label for="recipient-name" class="col-form-label">Số lượng</label>
              <input type="number" class="form-control">
            </div>
          </form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy Bỏ</button>
          <button type="button" class="btn btn-primary">Tạo dịch vụ đi kèm</button>
        </div>
      </div>
    </div>
  </div>

  --Modal--
  <div class="modal fade" id="staticBackdrop" tabindex="-1" aria-labelledby="staticBackdrop" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h1 class="modal-title fs-5">Hiển Thị Dịch Vụ Đi Kèm</h1>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <table class="table text-center">
            <thead>
            <tr>
              <th scope="col">Tên Dịch Vụ Đi Kèm</th>
              <th scope="col">Số lượng</th>
            </tr>
            </thead>
            <tbody class="table-group-divider">
            <tr>
              <td>Thuê Xe Đạp</td>
              <td>1</td>
            </tr>
            </tbody>
          </table>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Đóng</button>
        </div>
      </div>
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