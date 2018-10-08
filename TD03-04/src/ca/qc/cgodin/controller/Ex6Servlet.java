package ca.qc.cgodin.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.qc.cgodin.model.Product;
import ca.qc.cgodin.model.ProductManager;

/**
 * Servlet implementation class Ex6Servlet
 */
@WebServlet("/Ex6Servlet")
public class Ex6Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Ex6Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductManager productManager = new ProductManager();
		
		int prodID = Integer.parseInt(request.getParameter("prodID"));
		
		Product p = productManager.getProductById(prodID); // find product prodID
		if (p != null) {
			String details = "Name : " + p.getNameProd();
			details += "<br />";
			details += "Price : " + p.getPriceProd();

			response.getWriter().append(details);
		}
		else {
			response.getWriter().append("No product has been found");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
