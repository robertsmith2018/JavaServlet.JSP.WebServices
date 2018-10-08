package com.codePlumber;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet(
		description = "Ma Premi�re Servlet", 
		urlPatterns = { "/MaServlet" }, 
		initParams = { 
				@WebInitParam(name = "auteur", value = "Rab", description = "L'Auteur de la Servlet")
		})
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String auteur;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServlet() {
       
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		
		this.auteur = this.getInitParameter("auteur");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("l'auteur de cette Servlet est:"+ this.auteur);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
