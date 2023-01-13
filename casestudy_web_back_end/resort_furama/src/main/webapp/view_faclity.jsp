<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/31/2022
  Time: 8:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<html>
<head>
    <title>View Facility</title>
</head>
<body>
<table class="table">
  <thead class="table-light">
  <tr>
    <th scope="row">STT</th>
    <th>Name</th>
    <th>Area</th>
    <th>Cost</th>
    <th>Max People</th>
    <th>Rent Type</th>
    <th>Facility Type</th>
    <th>Standard Room</th>
    <th>Description Other Convenience</th>
    <th>Pool Area</th>
    <th>Number Of Floors</th>
    <th>Facility Free</th>
    <th>Edit</th>
    <th>Delete</th>
  </tr>
  </thead>
  <tbody>
  <tr>
    <th scope="row">1</th>
    <td>Villa</td>
    <td>100m2</td>
    <td>100USD</td>
    <td>12</td>
    <td>Month</td>
    <td>5 Stars</td>
    <td>Full Option</td>
    <td>20m2</td>
    <td>3</td>
    <td>Massage,Karaoke,BQQ</td>
    <td>
      <button type="button" class="btn btn-primary">Edit</button>
    </td>
    <td>
      <div class="modal" tabindex="-1">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title">Modal title</h5>
              <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
              <p>Modal body text goes here.</p>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
              <button type="button" class="btn btn-primary">Save changes</button>
            </div>
          </div>
        </div>
      </div>
    </td>
  </tr>
  </tbody>
</table>
</body>
</html>
