<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AuthServ" method="post">
		<table>
			<tr>
				<td>UserId</td>
				<td><input type="text" name="userid"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="hidden" name="msg" value="Helllllll"></td>
			</tr>
			<!-- tr>
				<td></td>
				<td><input type="text" name="msg" value="Helllllll"
					style="visibility: hidden"></td>
			</tr-->
			<tr>
				<td><input type="submit"></td>
				<td><input type="reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>