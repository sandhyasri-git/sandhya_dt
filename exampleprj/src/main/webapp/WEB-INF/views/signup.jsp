<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
body { 
        background: url('resources/images/pic1.jpg') no-repeat center center fixed; 
        background-size: cover;
}
</style>

</head>
<body>

</body>
</html> --%>
<%@include file="header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <title>Registration Form</title>
<h2> Information</h2>
<form:form method="POST" action="addUser" commandName="user">
   <table>
    <tr>
        <td><form:label path="username">User Name</form:label></td>
        <td><form:input path="username" /></td>
    </tr>
    <tr>
        <td><form:label path="id">Id</form:label></td>
        <td><form:input path="id" /></td>
    </tr>
    <tr>
        <td><form:label path="phno">Phone</form:label></td>
        <td><form:input path="phno" /></td>
    </tr>
        <tr>
        <td><form:label path="emailid">Email Id</form:label></td>
        <td><form:input path="emailid" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>