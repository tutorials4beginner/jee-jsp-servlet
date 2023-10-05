package edu.msit.cse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Connection con = DBConnection.getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select * from userstab where name='"
							+ request.getParameter("username") + "'");
			if (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));

				if (request.getParameter("username").equals(rs.getString(1))
						&& request.getParameter("password").equals(
								rs.getString(2))) {
					RequestDispatcher rd = request
							.getRequestDispatcher("home.jsp");
					rd.forward(request, response);
				} else {
					RequestDispatcher rd = request
							.getRequestDispatcher("index.html");
					rd.forward(request, response);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Connection con = DBConnection.getConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select * from userstab where name='"
							+ request.getParameter("username") + "'");
			if (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));

				if (request.getParameter("username").equals(rs.getString(1))
						&& request.getParameter("password").equals(
								rs.getString(2))) {
					RequestDispatcher rd = request
							.getRequestDispatcher("home.jsp");
					rd.forward(request, response);
				} else {
					RequestDispatcher rd = request
							.getRequestDispatcher("index.html");
					rd.forward(request, response);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
