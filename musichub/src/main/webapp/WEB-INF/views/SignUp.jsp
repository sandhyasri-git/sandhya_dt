<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h2>Create Account Here</h2>
		<form:form commandName="userDetails" class="form-horizontal"
			role="form" action="index" method="post">
			<div class="form-group">
				<form:label class="control-label col-sm-2" path="name">User Id:</form:label>
				<div class="col-sm-10">
					<form:input path="pwd" type="password" class="form-control"
						placeholder="Enter UserId" />
				</div>
			</div>
			<div class="form-group">
				<form:label class="control-label col-sm-2" path="name">First Name:</form:label>
				<div class="col-sm-10">
					<form:input path="fname" type="password" class="form-control"
						placeholder="Enter Name" />
				</div>
			</div>
						<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">Password:</label>
				<div class="col-sm-10">
					<form:input path="password" type="password" class="form-control"
						placeholder="Enter password" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="cpwd">Confirmed
					Password:</label>
				<div class="col-sm-10">
					<form:input path="cpassword" type="password" class="form-control"
						placeholder="Enter Confirmed password" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">Email:</label>
				<div class="col-sm-10">
					<form:input path="email" class="form-control"
						placeholder="Enter Email" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" value="Save" class="btn btn-default" />
				</div>
			</div>
		</form:form>
</body>
</html>