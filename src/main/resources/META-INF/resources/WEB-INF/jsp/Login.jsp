<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Login</title>
</head>
<body>
	<!-- Start of navbar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

		<a class="navbar-brand" href="#">Health Insurance</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse ml-10"
			id="navbarSupportedContent">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="/home">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="/login">Login</a></li>
				<li class="nav-item"><a class="nav-link" href="/signup">Sign
						Up</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/activateaccount">Activate Account</a></li>

				</li>
			</ul>

		</div>
	</nav>
	<!-- End of navbar -->
	<br>
	<div class="container ">
		<h2 class="text-center">Welcome to Login Page</h2>
		<form:form action="/thankyou" method="POST" modelAttribute="login">
			<div class="form-group row ">
				<label for="inputEmail3" class="col-sm-2  col-form-label">Email</label>
				<div class="col-sm-6 text-center">
					<input type="email" class="form-control" id="inputEmail3"
						placeholder="Email" name="email">
					<div class="invalid-feedback">Please provide a valid email.</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
				<div class="col-sm-6">
					<input type="password" class="form-control" id="inputPassword3"
						placeholder="Password" name="password">
				</div>
			</div>

			<div class="login" align="center">

				<br>
				<div class="container text-center">
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>
				<!--  	<br> <a href="/forgetpassword">Forgot Password</a>-->
			</div>

		</form:form>

		<form:form action="/forgetpassword">
			<div class="container text-center">
				<br> <a href="/forgetpassword">Forgot Password</a>
			</div>
		</form:form>

	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>