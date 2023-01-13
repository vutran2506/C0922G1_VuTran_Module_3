<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
    <style>
        tr{
            text-align: center;
        }
    </style>
</head>
<body>
<div>
    <h1><%= "Calculator" %>
    </h1>
    <br/>
    <form action="CalculatorServlet" method="get" >
        <table style="width: 60%;height: 50%;border: 2px;color: black">
            <tr style="text-align: center"> calculator</tr>
            <tr>
                <td>First Operand</td>
                <td><input type="text" name="n1"></td>
            </tr>
            <tr>
                <td>operator</td>
                <td><select name="ope">
                    <option>+</option>
                    <option>-</option>
                    <option>*</option>
                    <option>/</option>
                </select></td>
            </tr>
            <tr>
                <td>Second Operand</td>
                <td><input type="text" name="n2"></td>
            </tr>
            <tr>
                <td></td>
                <td><button type="submit">Result</button></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>