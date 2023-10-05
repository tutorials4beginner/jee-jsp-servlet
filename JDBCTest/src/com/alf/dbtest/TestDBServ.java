package com.alf.dbtest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TestDBServ")
public class TestDBServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public TestDBServ() {
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String u = request.getParameter("uname");
		String p = request.getParameter("pass");
		/*
		 * try { Class.forName("com.mysql.jdbc.Driver"); } catch
		 * (ClassNotFoundException e) { e.printStackTrace(); }
		 */
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		/*
		 * Table Name : users ==================== uname | password
		 * ----------------------- user1 | pass123
		 */

		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/mydb", "root", "iltwat");
			stmt = con.createStatement();
			rs = stmt
					.executeQuery("select password, username from users where username='"
							+ u + "'");

			if (rs.next()) {
				String pwd = rs.getString("password");

				if (pwd.equals(p)) {
					// request.setAttribute("uname", rs.getString("username"));
					
					HttpSession session = request.getSession();
					session.setAttribute("name", rs.getString("username"));
					session.setAttribute("pass", rs.getString("password"));
					RequestDispatcher rd = request
							.getRequestDispatcher("welcome.jsp");
					rd.forward(request, response);
				} else {
					RequestDispatcher rd = request
							.getRequestDispatcher("error.jsp");
					rd.forward(request, response);
				}
			} else {
				RequestDispatcher rd = request
						.getRequestDispatcher("nouser.jsp");
				rd.forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
