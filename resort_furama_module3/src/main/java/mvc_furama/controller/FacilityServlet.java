package mvc_furama.controller;

import mvc_furama.model.facility.Facility;
import mvc_furama.model.facility.FacilityType;
import mvc_furama.model.facility.RentType;
import mvc_furama.service.facility.IFacilityServce;
import mvc_furama.service.facility.IFacilityTypeService;
import mvc_furama.service.facility.IRentTypeService;
import mvc_furama.service.facility.impl.FacilityService;
import mvc_furama.service.facility.impl.FacilityTypeService;
import mvc_furama.service.facility.impl.RentTypeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FacilityServlet", value = "/Facility")
public class FacilityServlet extends HttpServlet {
    private  final IFacilityServce facilityService = new FacilityService();

    private  final IFacilityTypeService facilityTypeService = new FacilityTypeService();

    private  final IRentTypeService rentTypeService = new RentTypeService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getParameter("action");
if (action==null){
    action ="";
}
switch (action){
    case "create":
        showCreateFacilityForm(request,response);
        break;
    default:
        showFacilityForm(request,response);
        break;
}
    }

    private void showCreateFacilityForm(HttpServletRequest request, HttpServletResponse response) {
        List<FacilityType> facilityTypeList = this.facilityTypeService.listFacilityType();
        request.setAttribute("facilityTypeList",facilityTypeList);
        List<RentType> rentTypeList = this.rentTypeService.listRentType();
        request.setAttribute(" rentTypeList", rentTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("layout/facility/create_facility.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showFacilityForm(HttpServletRequest request, HttpServletResponse response) {
        List<Facility> facilityList =this.facilityService.selectAll();
        List<RentType> rentTypeList = this.rentTypeService.listRentType();
        List<FacilityType> facilityTypeList = this.facilityTypeService.listFacilityType();
        request.setAttribute("facilityTypeList",facilityTypeList);
        request.setAttribute("rentTypeList",rentTypeList);
        request.setAttribute("facilityList",facilityList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("layout/facility/list_facility.jsp");
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
            case "delete":
                deleteFacility(request,response);
                break;
            default:
                break;
        }
    }

    private void deleteFacility(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        this.facilityService.deleteFacility(id);
        try {
            response.sendRedirect("/Facility");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
