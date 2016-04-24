<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h2>Enter Login Details Here</h2>
<form:form commandName="userDetails" method="POST" action="index">
		<table>
			<tr>
				<td>Enter User Id:</td>
				<td><form:input path="userId" /></td>
				<td><form:errors path="userId" cssStyle="color: #ff0000;"/></td>
			</tr>
			
			<tr>
				<td>Enter a password:</td>
				<td><form:password path="password"  showPassword="true"/></td>
					<tr>
				<td><input type="submit" name="submit" value="Submit"></td>
				<td>New User ?<a href="signUp.jsp" >Click Here</a></td>
			</tr>
			<tr>
		</table>
	</form:form>
	
</body>
</html>