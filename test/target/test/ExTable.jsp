<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
  <title>Bootstrap and Spring MVC Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 50%;
      margin: auto;
  }
  </style>
</head>
<body>
<nav class="navbar navbar-default">
   <div class="col-sm-3 col-md-6 col-lg-4" style="background-color:yellow;">
      <a href="views/index.jsp" class="btn btn-primary">Sign In</a>
    <a href="AboutUs.jsp" class="btn btn-primary">About Us</a>
    <a href="Registration.jsp" class="btn btn-primary">Sign Up</a>

  </div>

</nav>


<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
         </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="images/pic1.jpg" alt="Nature" width="50" height="50">
      </div>

      <div class="item">
        <img src="images/pic2.jpg" alt="Nature" width="50" height="50">
      </div>
    
      <div class="item">
        <img src="images/pic3.jpg" alt="Nature" width="50" height="50">
      </div>
    
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
   <div class="row">
    </div>
    <table class="table table-hover">
       <tbody>
      <tr>
      <td><a href="index.jsp" class="thumbnail">
        <p>Click Here to Login.</p>    
        <img src="images/pic1.jpg" alt="Login" style="width:150px;height:150px">
      </a>
    </td>
    <td>
      <a href="images/pic2.jpg" class="thumbnail">
        <p>To Know to about Music Hub.</p>
        <img src="images/pic2.jpg" alt="About Us" style="width:150px;height:150px">
      </a>
    </td>
    <td>
      <a href="images/pic3.jpg" class="thumbnail">
        <p>Are You A New User ? Sign Up Here</p>      
        <img src="images/pic3.jpg" alt="New User" style="width:150px;height:150px">
      </a>
    </td>
  </tr>
  </tbody>
  </table>
</div>
  
</div>

</body>
</html>
