<%-- <%@ page language="java" contentType="text/html" %>-->--%>
<%@include file="Header.jsp" %>
<html lang="en">
<head>
  <title>Music Hub</title>
<!--  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  body
  {
  background-color:#d0e4fe;
  }
  </style>-->
</head>
<body>
<div class="container">
<form role="form">
    <div class="form-group">
    <table border="1">
     <tr><td><label for="pwd">Login ID:</label></td>
      <td><input type="text" class="form-control" id="usr" placeholder="Enter login Id"></td></tr>
      <tr><td>
      <label for="pwd">Password:</label></td><td>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password"></td></tr>
     </table>
    </div>
    <button type="submit" class="btn btn-default" onclick="Home.jsp">Submit</button>
  </form>
</div>
<%@include file="Footer.jsp" %>
</body>
</html>
