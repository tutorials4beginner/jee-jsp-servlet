package edu.msit.it;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AuthServ
 */
@WebServlet("/AuthServ")
public class AuthServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String n = request.getParameter("userid");
		String p = request.getParameter("password");
		System.out.println(request.getParameter("msg"));
		String s = n;
		HttpSession ses = request.getSession();
		ses.setAttribute("u", s);

		// logic
		int x = 10;

		RequestDispatcher rd = request.getRequestDispatcher("home.jsp?var1="
				+ x);
		rd.forward(request, response);
	}

}
