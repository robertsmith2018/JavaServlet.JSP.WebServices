package ca.qc.cgodin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex1Servlet
 */
@WebServlet(value="/Login", 
             initParams = {@WebInitParam(name="login", value="admin"), 
		                  @WebInitParam(name="pwd", value="admin")})

public class Ex1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String login;
    private String pwd;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

   
	@Override
	public void init() throws ServletException {
		login = getInitParameter("login");
		pwd = getInitParameter("pwd");
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String givenLogin = request.getParameter("username");
		String givenPwd  = request.getParameter("password");
		
		if(givenLogin.equals(login) && givenPwd.equals(pwd)) {
			//access autorisé
			response.sendRedirect("Succes.html");
			
		}else {
			//acces interdit
			response.sendRedirect("Echec.html");
		}
	}

}
