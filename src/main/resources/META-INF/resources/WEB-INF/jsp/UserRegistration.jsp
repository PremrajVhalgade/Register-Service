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
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script src="//geodata.solutions/includes/countrystatecity.js"></script>


<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>User-Registration</title>
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
		<h1 class="text-center">Registration Form</h1>


		<form:form action="/addSignup" method="POST" modelAttribute="user">
		
		
					
			<div class="form-row align-items-center">
				<div class="col-md-6">
					<label for="firstName">First Name</label> <input type="text"
						class="form-control" id="firstName" aria-describedby="emailHelp"
						placeholder="Enter firstName" name="firstName">
				</div>


				<div class="col-md-6">
					<label for="lastName">Last Name</label> <input type="text"
						class="form-control" id="lastName" aria-describedby="emailHelp"
						placeholder="Enter lastName" name="lastName">
				</div>
			</div>

			<br>
			<div class="form-row">
				<div class="col-md-6">
					<label for="email">Email</label> <input type="email"
						class="form-control" id="email" aria-describedby="emailHelp"
						placeholder="Enter email" name="email">
				</div>

				<div class="col-md-6">
					<label for="mobileNo">Mobile No.</label> <input type="number"
						class="form-control" id="mobileNo" aria-describedby="emailHelp"
						placeholder="Enter mobileNo" name="mobileNo">
				</div>
			</div>
			<br>
			<div class="form-row">
				<div class="col-md-4">
					<label for="dob">D.O.B.</label> <input type="date"
						class="form-control" id="dob" aria-describedby="emailHelp"
						placeholder="Enter dob" name="dob">
				</div>

				<div class="col-md-4">
					<label for="policyNo">Policy No.</label> <input type="text"
						class="form-control" id="policyNo" aria-describedby="emailHelp"
						placeholder="Enter policyNo" name="policyNo">
				</div>

				<div class="col-md-4">
					<br>Select Gender :<br>
					
					<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" 
					name="gender" id="inlineRadio1" value="male">
					<label class ="form-check-label" for="inlineRadio1">Male</label>
					</div>
					<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" 
					name="gender" id="inlineRadio2" value="female">
					<label class ="form-check-label" for="inlineRadio2">Female</label>
					</div>
					
					
					<!--  
					<input type="radio" id="gender" name="gender" class="form-group" onclick="getAnswer('Male')" value="Male"/>
					<label class="form-group" for="gender">Male</label> <input
						type="radio" id="gender" name="gender" class="form-group" onclick="getAnswer('Female')" value="Female"/>
					<label class="form-group" for="gender">Female</label>
					-->
				
				</div>
			</div>
			<br>

			<div class="row">
				<div class="col-sm-4">
					<label for="countryId">Country</label> <select name="country"
						class="countries form-control" id="countryId">
						<option value="India">Select Country</option>
					</select>
				</div>

				<div class="col-sm-4">
					<label for="stateId">State</label> <select name="state"
						class="states form-control" id="stateId">
						<option value="">Select State</option>
					</select>
				</div>
				<div class="col-sm-4">
					<label for="cityId">City</label> <select name="city"
						class="cities form-control" id="cityId">
						<option value="">Select City</option>
					</select>
				</div>
			</div>
		</form:form>
	</div>
	<br>
	<div class="container text-center">
		<button type="submit" class="btn btn-primary">Submit</button>
	</div>

</body>
</html>