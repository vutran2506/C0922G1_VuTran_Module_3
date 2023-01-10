package mvc_furama.controller;

import mvc_furama.model.employee.Division;
import mvc_furama.model.employee.Education;
import mvc_furama.model.employee.Employee;
import mvc_furama.model.employee.Position;
import mvc_furama.service.employee.IDivisionService;
import mvc_furama.service.employee.IEducationService;
import mvc_furama.service.employee.IEmployeeService;
import mvc_furama.service.employee.IPositionService;
import mvc_furama.service.employee.impl.DivisionService;
import mvc_furama.service.employee.impl.EducationService;
import mvc_furama.service.employee.impl.EmployeeService;
import mvc_furama.service.employee.impl.PositionService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", value = "/Employee")
public class EmployeeServlet extends HttpServlet {
    private final IEmployeeService employeeService = new EmployeeService();
    private final IDivisionService divisionService = new DivisionService();
    private final IPositionService positionService = new PositionService();
    private final IEducationService educationService = new EducationService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":

                break;
            case "delete":

                break;
            case "edit":

                break;
            default:
                showEmployeeForm(request, response);
                break;

        }
    }

    private void showEmployeeForm(HttpServletRequest request, HttpServletResponse response) {
        List<Division> divisionList = this.divisionService.getAllDivision();
        request.setAttribute("divisionList", divisionList);
        List<Education> educationList = this.educationService.getAllEducation();
        request.setAttribute("educationList", educationList);
        List<Employee> employeeList = this.employeeService.selectAll();
        request.setAttribute("employeeList", employeeList);
        List<Position> positionList = this.positionService.getAllPosition();
        request.setAttribute("positionList", positionList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("layout/employee/list_employee.jsp");
        try {
            dispatcher.forward(request, response);
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
            case "delete":

                break;
            case "edit":

                break;
            default:
                break;

        }
    }
}
