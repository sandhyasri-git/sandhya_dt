<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In Page</title>

<style>
.container {
	background-color: teal;
}
</style>
</head>
<body>
	<br>
	<br>
	<div class=".container">
		<center>
			<form:form commandName="user" action="login" cssClass="form-horizantal" method="post">
				<div class="form-group">
					<label for="name" class="col-sm-2 control-label">Name :</label>
					<div class="col-sm-5">
						<form:input path="name" placeholder="Enter Name Here"
							cssClass="form-control" />
					</div>
				</div>
				<div class="form-group">
					<label for="name" class="col-sm-2 control-label">Password :</label>
					<div class="col-sm-5">
						<form:password path="password" placeholder="Enter Password Here"
							cssClass="form-control" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-2">
						<input type="submit" name="add" value="SignUp"
							class="btn btn-success pull-right" />
					</div>
				</div>

			</form:form>
		</center>

	</div>

</body>
</html>