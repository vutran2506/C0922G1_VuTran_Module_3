
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create User</title>
</head>
<body>
<h1>User</h1>
<p>
  <a href="/User">Back to List User</a>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
</p>
<form action="/User?action=create" method="post">
  <table>
<tr>
  <td>Name User</td>
  <td><input type="text" name="name"></td>
</tr>
    <tr>
    <td>Email User</td>
    <td><input type="text" name="email"></td>
  </tr>
    <tr>
      <td>Country User</td>
      <td><input type="text" name="country"></td>
    </tr>
    <tr>
      <td></td>
      <td><button type="submit">Create User</button></td>
    </tr>
  </table>
</form>
</body>
</html>
