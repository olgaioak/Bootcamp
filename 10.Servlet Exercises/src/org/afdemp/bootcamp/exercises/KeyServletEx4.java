package org.afdemp.bootcamp.exercises;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KeyServletEx4
 */
@WebServlet("/key")
public class KeyServletEx4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KeyServletEx4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<html>");
        response.getWriter().append("<body>");
        response.getWriter().append("<form action=\"/bootcamp/key\" method=\"POST\">");
        response.getWriter().append("<input name=\"key1\">");
        response.getWriter().append("<input name=\"key2\">");
        response.getWriter().append("<input type=\"submit\" value=\"Servlet post\">");
        response.getWriter().append("</form>");
        response.getWriter().append("</body>");
        response.getWriter().append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String key1 = request.getParameter("key1");
//		String key2 = request.getParameter("key2");
//		response.getWriter().append(key1 + key2);
		
		Enumeration<String> keys = request.getParameterNames();
		String key = keys.nextElement();
		while(key != null){
			response.getWriter()
				.append(key).append(" = ")
				.append(request.getParameter(key))
				.append("\n");
			key = keys.nextElement();
		}
		
		
	}

}
