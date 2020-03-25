package com.uca.capas.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usr = request.getParameter("usr");
		String psw = request.getParameter("psw");
		
		String usuario  = "admin";
		String pass = "admin";
		
		
		PrintWriter out = response.getWriter();
		
		if (usr.equals(usuario) && psw.equals(pass)) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>Sesión iniciada.</h3>");
			out.println("</html>");
			out.println("</body>");
		}
		else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>Datos Erroneos. Intente de nuevo</h3>");
			out.println("</html>");
			out.println("</body>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
