package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TestServ")
public class TestServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TestServ() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.setAttribute("userid", request.getParameter("uid"));
		
		Cookie c1 = new Cookie("c1", "Cook1");
		response.addCookie(c1);

		Cookie c2 = new Cookie("c2", "Cook2");
		response.addCookie(c2);
		
		RequestDispatcher rd = request.getRequestDispatcher("nextpage.jsp");
		rd.forward(request, response);
	}

}
