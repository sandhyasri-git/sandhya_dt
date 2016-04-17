<%@ page language="java" contentType="text/html" %>

<html lang="en">
<head>
  <title>Music Hub</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  body
  {
  background-color:#d0e4fe;
  }
  </style>
</head>
<body>
<div class="container">
<form role="form">
    <div class="form-group">
     <label for="pwd">Login ID:</label>
      <input type="text" class="form-control" id="usr" placeholder="Enter login Id">
      
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password">
     
    </div>
    <button type="submit" class="btn btn-default" onclick="Home.jsp">Submit</button>
  </form>
</div>
</body>
</html>
