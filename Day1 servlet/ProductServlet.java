
  
package com.sonata;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.prdDAOImpl.DuplicateException;
import com.sonata.prdDAOImpl.PrdDAOImpl;
import com.sonata.prdModel.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	DuplicateException de = new DuplicateException();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		   PrintWriter out = response.getWriter();
		   
		   String id = request.getParameter("prdid");
		   String name = request.getParameter("prdName");
		   String amount = request.getParameter("prdAmount");
		   
		   int id1= Integer.parseInt(id);
		   double amount1 = Double.parseDouble(amount);
		   
		   Product product1 = new Product();
		   product1.setPrdID(id1);
		   product1.setPrdName(name);
		   product1.setPrdPrice(amount1);
		   try {
			   if(amount1 >100)
			   {
				   response.sendError(450, "Amount is greater than 100");
				  // response..sendError("Access Denied for user [" );
			   }
			   else
			   {
				   
		   PrdDAOImpl product2 = new PrdDAOImpl();
		   int s1 = product2.addProduct(product1);
		   out.println("one row is inserted " + s1);
		   }
		   }
		   catch (DuplicateException e)
		   {
			   e.printStackTrace();
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
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
