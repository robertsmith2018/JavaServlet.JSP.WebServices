package ca.qc.cgodin.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.qc.cgodin.model.CD;

/**
 * Servlet implementation class Ex2Servlet
 */
@WebServlet("/Ex2Servlet")
public class Ex2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex2Servlet() {
    	   
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//stocker la liste des CDs dans une variable de session
		if(request.getSession().getAttribute("liste_cds") == null) {
			    List<CD> CDs = new ArrayList<CD>();
		        CDs.add(new CD(1, "ColdPlay - Ghost Stories", 14.95, 0));
		        CDs.add(new CD(2, "U2 - Songs od Innocence", 13.95, 0));
		        CDs.add(new CD(3, "NikelBack - No Fixed Address ", 12.66, 0));
		        CDs.add(new CD(4, "Chris Beily - I will always remenber", 10.75, 0));
			    request.getSession().setAttribute("liste_cds", CDs);
		}
		
		//afficher les CDs sous forme d'une table;
		response.setContentType("text/html");
		String msg = "<h2 style=\"color:blue; font-weight:bold\">CD List</h2>";
		msg += "<table border=1>";
		List<CD> CDs = (List<CD>)request.getSession().getAttribute("liste_cds");
		for (CD c : CDs) {
			msg += "<tr>";
			msg += "<td>" + c.getDescription() + "</td>";
			msg += "<td>" + c.getPrice() + " $</td>";
			msg += "<td><a href=\"ShoppingServlet?idCD=" + c.getId() + "\"> Add to Cart</a></td>";
			msg += "</tr>";
		}
		msg += "</table>";	
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
