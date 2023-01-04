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

<title>Activate Account</title>
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
		<div class="activateAccount" align="center">
			<h1>Activate Account</h1>
		</div>

<form:form method="POST" action="/setpassword" modelAttribute="setpassword">

		<div class="container">
			
			<div class="form-group row ">
				<label for="newPassword" class="col-sm-2 col-form-label">New
					Password</label>
				<div class="col-sm-6">
					<input type="password" class="form-control" id="newPassword"
						placeholder="Enter new password" name="newPassword">
				</div>
			</div>
			
			
			<div class="form-group row ">
				<label for="confirmPassword" class="col-sm-2 col-form-label">Confirm
					Password</label>
				<div class="col-sm-6">
					<input type="password" class="form-control" id="confirmPassword"
						placeholder="Re-enter password" name="confirmPassword">
				</div>
			</div>

			<br>

			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>

		</div>
	</form:form>

	
</body>
</html>
