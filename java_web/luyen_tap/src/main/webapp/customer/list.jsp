<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<html>
<head>
  <title>User List</title>
</head>
<body>
<h1 style="text-align: center">USERS</h1>
<button style="background: green"><a href="/Customer?action=create">Create User</a></button>


<form action="/Customer?action=search" method="post">
  <input type="text" name="name" placeholder="Enter Name">
  <input type="text" name="country" placeholder="Enter Country">
  <button type="submit">Search</button>
  <p>${mess}</p>
</form>
  <table class="table table-striped">
    <tr>
      <td>ID</td>
      <td>Name</td>
      <td>Email</td>
      <td>Country</td>
      <td>Edit</td>
      <td>Delete</td>
    </tr>
    <c:forEach var="customer" items="${customerList}">
      <tr>
        <td><a href="/Customer?action=view&id=${customer.getId()}">${customer.getId()}</a></td>
        <td>${customer.getName()}</td>
        <td>${customer.getEmail()}</td>
        <td>${customer.getCountry()}</td>
        <td><a href="/Customer?action=edit&id=${customer.getId()}">Edit</a></td>

        <td> <button onclick="infoDelete('${customer.getId()}','${customer.getName()}')" type="button"
                     class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
          Delete
        </button></td>
      </tr>
    </c:forEach>
  </table>


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
</body>
<script>
  function infoDelete(id, name){
    document.getElementById("id").value= id;
    document.getElementById("name").innerText= name;


  }
</script>
</html>