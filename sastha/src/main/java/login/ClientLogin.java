package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;


public class ClientLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext ctx;
	RequestDispatcher rd;
	
	
    public ClientLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ctx=getServletContext();
     	rd = ctx.getRequestDispatcher("/login.html");
		rd.forward(request,response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter res = response.getWriter();
		String username = "";
		username = request.getParameter("user");
		if(username.equals("admin")) {
			res.println("Success");
		}else {
			res.println("Failure");
		}
		
		
		
	}
}
