package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dto.ProductDto;
import Dto.UserDto;
import Service.ProductService;
import Service.ProductServiceImpl;
import Service.UserService;
import Service.UserServiceImpl;


@WebServlet("*.shop")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService uSer;
	private ProductService pSer;
	private String url="";
	@Override
	public void init() throws ServletException {
		uSer = new UserServiceImpl();
		pSer = new ProductServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String path = request.getServletPath();
			switch(path) {
			case "/initpage.shop":
				url = "redirect:index.jsp";
				break;
			case "/loginuserform.shop":
				url = "WEB-INF/user/loginform.jsp";
				break;
			case "/loginuser.shop":
				url = loginuser(request, response);
				break;
				
			case "/listprdform.shop" :
				System.out.println("여기들어오ㅓㅁ?");
				url = listprd(request, response);
				//url = "WEB-INF/product/productlist.jsp";
				break;
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(url.startsWith("redirect:")) {
			url = url.substring(url.indexOf(":")+1);
			response.sendRedirect(url);
		}else{
			request.getRequestDispatcher(url).forward(request, response);
		}
	}

	private String listprd(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		ArrayList<ProductDto> list = pSer.listprd();
		request.setAttribute("list", list);
	
		return "WEB-INF/product/productlist.jsp";
	}

	private String loginuser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		UserDto uDto = uSer.login(request.getParameter("id"), request.getParameter("pwd"));
		HttpSession session = request.getSession();
		session.setAttribute("userInfo", uDto);
		if(uDto!=null) System.out.println("로그인 성공");
		return "initpage.shop";
	}

}
