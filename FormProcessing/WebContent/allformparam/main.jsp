<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.io.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>HTTP Header Request Example</h2>
		<table width="100%" border="1" align="center">
			<tr bgcolor="#949494">
				<th>Param Name</th>
				<th>Param Value(s)</th>
			</tr>
			<%
				Enumeration paramNames = request.getParameterNames();

				while (paramNames.hasMoreElements()) {
					String paramName = (String) paramNames.nextElement();
					out.print("<tr><td>" + paramName + "</td>\n");
					String paramValue = request.getHeader(paramName);
					
					out.println("<td> " + paramValue + "</td></tr>\n");
				}
			%>
		</table>
	</center>
</body>
</html>