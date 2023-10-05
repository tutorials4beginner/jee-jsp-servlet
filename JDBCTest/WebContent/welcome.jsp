<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome....<%=request.getParameter("uname")%><br> Your Password
	is :
	<%=request.getParameter("pass")%><br> Data from session :
	<%=session.getAttribute("name")%><br>
	<%=session.getAttribute("pass")%>

	<form action="ChoiceServ" method="post">
		<input type="checkbox" name="chk" value="Book">Book<br> <input
			type="checkbox" name="chk" value="Movie">Movie<br> <input
			type="checkbox" name="chk" value="Internet">Internet<br>
		<input type="submit" value="Submit ur choice">
	</form>
	<%
		request.isRequestedSessionIdValid();
	%>
</body>
</html>