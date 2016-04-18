<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@include file="Header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">   
<head>   
<meta charset="utf-8">   
<title>Products</title>   
<!--<meta name="description" content="Products.">  
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">   
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"></style>
<script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<style>
  body
  {
  background-color:#d0e4fe;
  }
  </style>-->
</head>  
<body style="margin:20px auto">  
<div class="container">
<div class="row header" style="text-align:center;color:green">
</div>


<table id="myTable" class="table table-striped" >  
        <thead>  
          <tr>  
            <th>Model No</th>  
            <th>Type</th>  
            <th>Manufacture ID</th>
            <th>Quantity</th>  
            <th>Price</th>  
          </tr>  
        </thead>  
        <tbody>  
        <c:forEach items="${products}" var="prod">
          <tr>  
            <td>${prod.modelId}</td>  
            <td>${prod.description}</td>  
            <td>${prod.manuId}</td>
            <td>${prod.prodQty}</td>  
            <td>${prod.prodPrice}</td>
            <td><a href="Sample" class="btn btn-primary">
          <span class="glyphicon glyphicon-info-sign"></span>
        </a></td>
          </tr>  
          </c:forEach>  
         </tbody>  
      </table>  
	  </div>
</body>  
<script>
$(document).ready(function(){
    $('#myTable').dataTable();
});
</script>
<%@include file="Footer.jsp" %>
</html>  
