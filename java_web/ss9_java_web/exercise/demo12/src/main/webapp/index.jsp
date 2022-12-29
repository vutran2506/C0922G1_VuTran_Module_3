<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Discount-Product- Calculator</title>
</head>
<body>
<div style="margin-right: auto">
    <h1>Discount Calculator</h1>
    <br/>
    <form action="/CalculatorServlet" method="post">

        <h3>Product Description</h3>
        <label>
            <input type="text" name="description">
        </label><br>
        <h3>List Price</h3>
        <label>
            <input type="number" name="price">
        </label><br>
        <h3>Discount Percent</h3>
        <label>
            <input type="number" name="discount">
        </label><br>
        <h3>Calculator</h3>
        <button type="submit">Submit</button>

    </form>
</div>

</body>
</html>