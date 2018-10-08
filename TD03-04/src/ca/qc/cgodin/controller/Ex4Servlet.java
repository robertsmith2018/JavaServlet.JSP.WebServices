package ca.qc.cgodin.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex4Servlet
 */
@WebServlet("/Ex4Servlet")
public class Ex4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex4Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String useAgent = request.getHeader("User-Agent");
		String bgColor = "";
		if(useAgent.contains("Chrome")) {
			bgColor = "blue";
		} else if (useAgent.contains("Postman")) {
			bgColor = "red";
		} else {
			bgColor = "yellow";
		}
		
		String msg = "<html>";
		msg += "<body style='background-color:" + bgColor + "'>";
		msg += "<h2>Bienvenue a la Servlet de Ex 4</h2>";
		msg += "</body>";
		msg += "</html>";
		response.getWriter().println(msg);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
