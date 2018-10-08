package ca.qc.cgodin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.qc.cgodin.model.CD;

/**
 * Servlet implementation class ShoppingServlet
 */
@WebServlet("/ShoppingServlet")
public class ShoppingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idCD = Integer.parseInt(request.getParameter("idCD"));
		List<CD> CDs = (List<CD>)request.getSession().getAttribute("liste_cds");
		String msg = "";
		for(CD c : CDs) {
			if(c.getId() == idCD) {
				msg += c.getId();
				msg += "<br />";
				msg += c.getDescription();
				msg += "<br />";
				msg += c.getPrice();
				msg += "<br />";
				c.setQte(c.getQte() + 1);
				msg += c.getQte();
				break;
			}
		}
		response.setContentType("text/html");
		request.getSession().setAttribute("liste_cds", CDs);
		response.getWriter().append(msg);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
