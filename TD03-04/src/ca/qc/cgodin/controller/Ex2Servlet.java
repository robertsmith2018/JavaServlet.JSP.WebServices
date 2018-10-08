package ca.qc.cgodin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex2Servlet
 */
@WebServlet("/Ex2Servlet")
public class Ex2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int nombreAppels;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex2Servlet() {
    	super();
    	nombreAppels = 0 ;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		nombreAppels++;
		response.getWriter().println("Nombre d'appels = " + nombreAppels);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
