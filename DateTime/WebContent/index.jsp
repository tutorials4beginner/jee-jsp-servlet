<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.io.*, java.util.*, javax.servlet.*, java.text.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Display Current Date & Time</h1>
	</center>
	<%
		Date date = new Date();
		out.print("<h2 align=\"center\">" + date.toString() + "</h2>");
	%>


	<center>
		<h1>Display Current Date & Time</h1>
	</center>
	<%
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat(
				"E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		out.print("<h2 align=\"center\">" + ft.format(dNow) + "</h2>");
	%>
</body>
</html>