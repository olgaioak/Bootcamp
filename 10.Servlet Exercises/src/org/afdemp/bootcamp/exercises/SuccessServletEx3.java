package org.afdemp.bootcamp.exercises;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SuccessServletEx3
 */
@WebServlet("/success")
public class SuccessServletEx3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Success s = new Success();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SuccessServletEx3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String entry =request.getParameter("numb");
		
		if (entry == null){
			response.sendRedirect("/bootcamp/Hello");
			return;
		}
		int num = Integer.parseInt(entry);
		if (s.isPrime(num)) {
			response.getWriter().append("Prime. Success");
		} else {
			response.sendRedirect("/bootcamp/Hello");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
