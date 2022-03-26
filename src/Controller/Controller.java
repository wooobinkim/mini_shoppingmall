package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			case "/loginuseform.shop":
				break;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(url.startsWith("redirect:")) {
			url = url.substring(url.indexOf(":"+1));
			response.sendRedirect(url);
		}else{
			request.getRequestDispatcher(url).forward(request, response);
		}
	}

}
