<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome
	<%=request.getParameter("username")%>

	<%
		out.print("Hello");
	%>
	<%=session.getId()%><br>
	<%
		session.setAttribute("u", request.getParameter("username"));
	%>
	<form action="ProcessDataServ" method="post">
		<table>
			<tr>
				<td>Friend Name</td>
				<td><input type="text" name="fname"></td>
			</tr>
			<tr>
				<td>Phone No</td>
				<td><input type="text" name="phno"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="hidden" name="friendof"
					value="<%=request.getParameter("username")%>"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>

</body>
</html>