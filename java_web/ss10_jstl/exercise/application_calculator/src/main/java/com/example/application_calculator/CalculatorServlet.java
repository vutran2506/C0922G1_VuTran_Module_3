package com.example.application_calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("n1"));
        double num2 = Double.parseDouble(request.getParameter("n2"));
        String operator = request.getParameter("ope");
        double result = 0;
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else {
            try {
                if (num2 == 0) {
                    throw new ArithmeticException();
                } else {
                    result = num1 / num2;
                }
            } catch (ArithmeticException e) {
                request.setAttribute("exception", "Can't divide by zero");
                request.getRequestDispatcher("exception.jsp").forward(request,response);
            }
        }
        request.setAttribute("n1", num1);
        request.setAttribute("n2", num2);
        request.setAttribute("ope", operator);
        request.setAttribute("result", result);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
