<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int n = 5;
	int res = 1;

	void show() {

	}%>

	Welcome
	<%=request.getParameter("uname")%>


	<br>
	<%
		int num = 5;
		for (int i = 1; i <= 5; i++) {
			res *= i;
		}
	%>

	<%=res%>



</body>
</html>