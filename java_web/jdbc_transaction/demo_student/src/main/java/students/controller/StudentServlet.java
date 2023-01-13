package students.controller;

import students.model.Clazz;
import students.model.Student;
import students.service.IClazzService;
import students.service.IStudentService;
import students.service.impl.ClazzService;
import students.service.impl.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", value = "/Student")
public class StudentServlet extends HttpServlet {
    private final IStudentService studentService = new StudentService();
    private final IClazzService clazzService = new ClazzService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            default:
                showAllStudentForm(request, response);
                break;
        }
    }
    private void showAllStudentForm(HttpServletRequest request, HttpServletResponse response) {
        List<Student> studentList = this.studentService.selectAllStudent();
        request.setAttribute("studentList",studentList);
     List<Clazz> clazzList = this.clazzService.findByAll();
     request.setAttribute("clazzList",clazzList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("student/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
         e.printStackTrace();
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":

                break;
            default:
                break;
        }
    }


}
