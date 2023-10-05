<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome <%=session.getAttribute("userid") %>
	<br>
	Your session id is : <%=session.getId() %>
	<br>
	
	<br>
	Cookies:
	<% String msg = "";%>
	
	<%
		Cookie cookies[] = request.getCookies();

		for (int i = 0; i < cookies.length; i++) {
			msg += "----#----" + cookies[i].getValue() + " ";
		}
	%>
	<%=msg%>
	
	<br><br><br>
	<% int balance =10000; %>
	
	<form action="tms" method="post">
		Your Acc No<input type="text" name="yan"><br>
		Friend's Acc No<input type="text" name="fan"><br>
		Amount<input type="text" name="amnt"><br>
		
		<input type="hidden" name="balance" value="<%=balance%>">
		
		<input type="submit" value="Submit">
	</form>
</body>
</html>