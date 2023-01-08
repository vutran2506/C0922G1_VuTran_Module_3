package mvc_furama.controller;

import mvc_furama.model.customer.Customer;
import mvc_furama.service.ICustomerService;
import mvc_furama.service.impl.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/Customer")
public class CustomerServlet extends HttpServlet {
    private final ICustomerService customerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

       String action = request.getParameter("action");
       if (action==null){
           action ="";
       }
       switch (action){
           case "create":
               showCreateCustomerForm(request,response);
               break;
           case "edit":
               showEditCustomerForm(request,response);
               break;
           default:
               showCustomerForm(request,response);
               break;
       }
    }

    private void showEditCustomerForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.selectCustomerById(id);
        request.setAttribute("customer" ,customer);
        RequestDispatcher dispatcher =request.getRequestDispatcher("layout/customer/edit_customer.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateCustomerForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher =request.getRequestDispatcher("layout/customer/create_customer.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCustomerForm(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = this.customerService.selectAllCustomer();
        request.setAttribute("customerList",customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("layout/customer/list_customer.jsp");
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
        if (action==null){
            action ="";
        }
        switch (action){
            case "create":
                createCustomer(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
            case "edit":
                editCustomer(request,response);
                break;
            default:
                break;

        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int typeId = Integer.parseInt(request.getParameter("typeId"));
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id,typeId,name,dateOfBirth,gender,idCard,phone,email,address);
        this.customerService.updateCustomer(id,customer);
        showCustomerForm(request,response);

    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        this.customerService.deleteCustomer(id);
        showCustomerForm(request,response);
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int typeId = Integer.parseInt(request.getParameter("typeId"));
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id,typeId,name,dateOfBirth,gender,idCard,phone,email,address);
        this.customerService.insertCustomer(customer);
        showCustomerForm(request,response);
    }
}
