<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- Decision-Making Statements: --%>
	<%!int day = 3;%>
	<%
		if (day == 1 | day == 7) {
	%>
	<p>Today is weekend</p>
	<%
		} else {
	%>
	<p>Today is not weekend</p>
	<%
		}
	%>


	<%
		switch (day) {
		case 0:
			out.println("It\'s Sunday.");
			break;
		case 1:
			out.println("It\'s Monday.");
			break;
		case 2:
			out.println("It\'s Tuesday.");
			break;
		case 3:
			out.println("It\'s Wednesday.");
			break;
		case 4:
			out.println("It\'s Thursday.");
			break;
		case 5:
			out.println("It\'s Friday.");
			break;
		default:
			out.println("It's Saturday.");
		}
	%>

	<%!int fontSize;%>
	<%
		for (fontSize = 1; fontSize <= 3; fontSize++) {
	%>
	<font color="green" size="<%=fontSize%>"> JSP Tutorial </font>
	<br />
	<%
		}
	%>
</body>
</html>