<html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap.min.css"/>">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="<c:url value="/resources/bootstrap-3.3.6-dist/js/bootstrap.min.js"/>"></script>
<style>
.carousel-inner>.item>img {
	margin: auto;
	height: 40%;
	width: 30%;
}

.left carousel-control {
	background-color: teal;
}
</style>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<ul class="nav navbar-nav">

				<li><a href="login">Sign In</a></li>
				<li><a href="signup">Sign Up</a></li>
				<li><a href="aboutus">About Us</a></li>
			</ul>
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
				<li data-target="#myCarousel" data-slide-to="3"></li>
				<li data-target="#myCarousel" data-slide-to="4"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="<c:url value="/resources/images/music6.jpg"/>"
						alt="Music" width="460" height="300">
				</div>

				<div class="item">
					<img src="<c:url value="/resources/images/music8.jpg"/>"
						alt="Music" width="460" height="300">
				</div>

				<div class="item">
					<img src="<c:url value="/resources/images/music9.jpg"/>"
						alt="Music" width="460" height="300">
				</div>

				<div class="item">
					<img src="<c:url value="/resources/images/music11.jpg"/>"
						alt="Music" width="460" height="300">
				</div>
				<div class="item">
					<img src="<c:url value="/resources/images/music12.jpg"/>"
						alt="Music" width="460" height="300">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>
</body>
</html>
