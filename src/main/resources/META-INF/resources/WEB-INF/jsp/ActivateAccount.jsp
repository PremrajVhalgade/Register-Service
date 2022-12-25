<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

<title>Activate Account</title>
</head>
<body>
	<form>
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
		<div class="activateAccount" align="center">
			<h1>Activate Account</h1>
		</div>

		<div class="container">
			<div class="form-group row ">
				<label for="inputEmail3" class="col-sm-2 col-form-label">Registered
					Email</label>
				<div class="col-sm-6">
					<input type="email" class="form-control" id="inputEmail3"
						placeholder="Registered Email">
				</div>
			</div>

			<div class="form-group row ">
				<label for="newPassword" class="col-sm-2 col-form-label">New
					Password</label>
				<div class="col-sm-6">
					<input type="password" class="form-control" id="newPassword"
						placeholder="Enter new password">
				</div>
			</div>
			
			<div class="form-group row ">
				<label for="tempPassword" class="col-sm-2 col-form-label">Temporary
					Password</label>
				<div class="col-sm-6">
					<input type="password" class="form-control" id="tempPassword"
						placeholder="Enter new password">
				</div>
			</div>

			<div class="form-group row ">
				<label for="confirmPassword" class="col-sm-2 col-form-label">Confirm
					Password</label>
				<div class="col-sm-6">
					<input type="password" class="form-control" id="confirmPassword"
						placeholder="Re-enter password">
				</div>
			</div>

			<br>

			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>

		</div>
	</form>

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



































<!--  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Activate Account</title>
</head>
<body>
<form action="/login" method="post">
	<div align="center">
		<h2>Activate Account</h2>
		Registered Email:<input type="text" name="registeredEmail"><br>
		New Password:<input type="password" name="newPassword"><br>
		Temporary Password:<input type="password" name="temporaryPassword"><br>
		Confirm Password:<input type="password" name="confirmPassword"><br>
		<input type="submit" value="Submit">
	</div>
	</form>
</body>
</html>
-->