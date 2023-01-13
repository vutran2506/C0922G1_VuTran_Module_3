package model;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet", value = "/StudentServlet")
public class StudentServlet extends HttpServlet {
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"vu1",true,5,1));
        studentList.add(new Student(2,"vu2",false,8,2));
        studentList.add(new Student(2,"vu3",true,3,1));
        studentList.add(new Student(4,"vu4",false,6,2));
        studentList.add(new Student(5,"vu5",true,7,1));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setAttribute("StudentServlet",studentList);
request.getRequestDispatcher("list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
