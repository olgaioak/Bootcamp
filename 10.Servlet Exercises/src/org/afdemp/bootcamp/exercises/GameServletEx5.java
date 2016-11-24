package org.afdemp.bootcamp.exercises;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GameServletEx5
 */
@WebServlet("/play")
public class GameServletEx5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Game mGame;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameServletEx5() {
        super();
        // TODO Auto-generated constructor stub
        mGame = new Game();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append(mGame.play());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
