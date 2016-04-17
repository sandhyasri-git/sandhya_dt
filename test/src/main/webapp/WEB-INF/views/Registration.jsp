<!DOCTYPE html>
<html lang="en">
<head>
  <title>Registration</title>
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
       <label for="fusr">First Name:</label>
      <input type="text" class="form-control" id="fusr">
    </div>
    
    <div class="form-group">
      <label for="lusr">Last Name:</label>
      <input type="text" class="form-control" id="lusr">
    </div>
    <div class="form-group">
      <label for="usr">User Name:</label>
      <input type="text" class="form-control" id="usr">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd">
    </div>
  <div class="form-group">
      <label for="cpwd">Confirm Password:</label>
      <input type="password" class="form-control" id="cpwd">
    </div>
    <div class="form-group">
      <label for="email">Email Ide:</label>
      <input type="email" class="form-control" id="email">
    </div>
    <div class="form-group">
      <label for="ph">Phone Number:</label>
      <input type="text" class="form-control" id="ph">
    </div>
    <div class="form-group">
        <label class="radio-inline">
      <input type="radio" name="optradio">Male
    </label>
        <label class="radio-inline">
      <input type="radio" name="optradio">Female
    </label>
    </div>
        <button type="submit" class="btn btn-default">Submit</button>
            <button type="reset" class="btn btn-default">Reset</button>
  </form>
</div>

</body>
</html>
