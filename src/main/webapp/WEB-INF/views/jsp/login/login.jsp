<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Spring MVC Test Application</title>
</head>
<body>
	<h1>The Login Page</h1>
	<sp:form action="doLogin" method="post" commandName="login">
		<div align="left">
			<table>
				<tr>
					<td>User</td>
					<td><sp:input path="userName" id="uName" /><sp:errors path="userName" class="control-label" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><sp:password path="password" id="pwd" /><sp:errors path="password" class="control-label" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login" /></td>
					<td><input type="reset" value="Clear" /></td>
				</tr>

			</table>

		</div>

	</sp:form>
</body>
</html>