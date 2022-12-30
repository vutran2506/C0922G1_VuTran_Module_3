package model;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
private  static List<Customer> customerList = new ArrayList<>();
static {
    customerList.add(new Customer("Mai Văn Hoàng","1982-08-20","Hà Nội","https://tse4.mm.bing.net/th?id=OIP.bKS-pAbTiZDTqwyuGfh2ZwHaLI&pid=Api&P=0"));
    customerList.add(new Customer("Nguyễn Văn Nam","1982-08-21","Bắc Giang","https://tse1.mm.bing.net/th?id=OIP.zDpkbSxWJKF9vp9HB0zkSgHaLH&pid=Api&P=0 "));
    customerList.add(new Customer("Nguyễn Thái Hoà","1982-08-22","Nam Định","https://toplist.vn/images/800px/chup-hinh-gia-an-319523.jpg "));
    customerList.add(new Customer("Trần Đăng Khoa","1982-08-17","Hà Tây"," https://dichvuphotoshop.com/wp-content/uploads/2021/05/Photoshop-thay-nen-xanh-anh-the-theo-yeu-cau-1.jpg"));
    customerList.add(new Customer("Nguyễn Đình Thi","1982-08-19","Hà Nội","https://img1.kienthucvui.vn/uploads/2019/07/19/hinh-the-dep_111316291.png "));
}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setAttribute("CustomerServlet",customerList);
request.getRequestDispatcher("list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
