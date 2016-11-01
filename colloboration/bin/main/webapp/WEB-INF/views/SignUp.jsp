<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="header.jsp"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sign Up</title>
</head>
<body>
    <div class="form-container">
     
    <h1>Registration Form</h1>
     
    <form:form method="POST" modelAttribute="user" class="form-horizontal" action="register" enctype="multipart/form-data">
 
          <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="user_name">User Name</label>
                <div class="col-md-7">
                    <form:input type="text" path="user_name" id="user_name" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="user_name" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="name">Name</label>
                <div class="col-md-7">
                    <form:input type="text" path="name" id="name" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="name" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="password">Password</label>
                <div class="col-md-7">
                    <form:input type="password" path="password" id="password" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="password" class="help-inline"/>
                    </div>
                </div>
            </div>
                     
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="email">Email Id:</label>
                <div class="col-md-7">
                    <form:input type="text" path="email" id="email" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="email" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="location">Location: </label>
                <div class="col-md-7">
                    <form:input type="text" path="location" id="location" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="location" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="img">Profile Picture: </label>
                <div class="col-md-7">
                    <form:input type="file" path="img" id="img" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="img" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
	 
	          <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="Register" class="btn btn-primary btn-sm">
            </div>
        </div>
    </form:form>
    </div>
    <%@ include file="footer.jsp" %>
  </body>
</body>
</html>
