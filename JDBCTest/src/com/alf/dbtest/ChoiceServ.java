package com.alf.dbtest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChoiceServ
 */
@WebServlet("/ChoiceServ")
public class ChoiceServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChoiceServ() {
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
		// System.out.println(request.getParameter("chk"));

		Cookie cookie = new Cookie("mycookie", "Hello");
		cookie.setMaxAge(10);
		
		
		String chk[] = request.getParameterValues("chk");
		String msg = "You have selected ";
		for (String s : chk) {
			msg += s + " ";
		}

		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("./ChoiceDetail.jsp");
		rd.forward(request, response);
	}

}
