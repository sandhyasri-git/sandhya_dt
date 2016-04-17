<html lang="en">   
<head>   
<meta charset="utf-8">   
<title>Products</title>   
<meta name="description" content="Products.">  
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">   
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"></style>
<script type="text/javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
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
            <th>Quantity</th>  
            <th>Price</th>  
          </tr>  
        </thead>  
        <tbody>  
          <tr>  
            <td>M001</td>  
            <td>Violin</td>  
            <td>3</td>  
            <td>10000</td>  
          </tr>  
          <tr>  
            <td>M002</td>  
            <td>Veena</td>  
            <td>2</td>  
            <td>28000</td>  
          </tr>  
          <tr>  
            <td>M003</td>  
            <td>Piano</td>  
            <td>5</td>  
            <td>700</td>  
          </tr>  
		   <tr>  
            <td>M004</td>  
            <td>Violin</td>  
            <td>1</td>  
            <td>11000</td>  
          </tr>  
          <tr>  
            <td>M005</td>  
            <td>Veena</td>  
            <td>3</td>  
            <td>22000</td>  
          </tr>  
                  </tbody>  
      </table>  
	  </div>
</body>  
<script>
$(document).ready(function(){
    $('#myTable').dataTable();
});
</script>
</html>  
