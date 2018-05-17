<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<link href="./static/css/mdb.min.css" type="text/css" rel="stylesheet">
<link href="./static/css/mdb.css" type="text/css" rel="stylesheet">
<link href="./static/css/bootstrap.min.css" type="text/css"
	rel="stylesheet">
<link href="./static/css/bootstrap.css" type="text/css" rel="stylesheet">
<link href="./static/css/style.min.css" type="text/css" rel="stylesheet">
<link href="./static/css/style.css" type="text/css" rel="stylesheet">
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-dark indigo">


			<a class="navbar-brand" href="home.jsp">Application</a>


			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#basicExampleNav" aria-controls="basicExampleNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>


			<div class="collapse navbar-collapse" id="basicExampleNav">

				<!-- Links -->
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link"
						href="home.jsp">Home <span class="sr-only">(current)</span>
					</a></li>
				</ul>

			</div>

		</nav>
	</header>
	<main> <!-- Login Form -->
	<form action="LoginController" method="post">

		<div class="modal fade" id="modalLoginForm" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header text-center">
						<h4 class="modal-title w-100 font-weight-bold">Sign in</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body mx-3">
						<div class="md-form mb-5">
							<i class="fa fa-envelope prefix grey-text"></i> <input
								type="email" id="defaultForm-email" name="email"
								class="form-control validate"> <label data-error="wrong"
								data-success="right" for="defaultForm-email">Your email</label>
						</div>

						<div class="md-form mb-4">
							<i class="fa fa-lock prefix grey-text"></i> <input
								name="password" type="password" id="defaultForm-pass"
								class="form-control validate"> <label data-error="wrong"
								data-success="right" for="defaultForm-pass">Your
								password</label>
						</div>

					</div>
					<div class="modal-footer d-flex justify-content-center">
						<button class="btn btn-default">Login</button>
					</div>
				</div>
			</div>
		</div>
	</form>
	<div class="text-center">
		<a class="btn btn-default btn-rounded mb-4"
			data-toggle="modal" data-target="#modalLoginForm">Launch Login
			Form</a>
	</div>

	<!-- Registration Form -->
	<form action="RegistrationController" method="post">
		<div class="modal fade" id="modalRegisterForm" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header text-center">
						<h4 class="modal-title w-100 font-weight-bold">Register</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body mx-3">
						<div class="md-form mb-5">
							<i class="fa fa-user prefix grey-text"></i> <input type="text"
								name="name" id="orangeForm-name" class="form-control validate">
							<label data-error="wrong" data-success="right"
								for="orangeForm-name">Name</label>
						</div>
						<div class="md-form mb-5">
							<i class="fa fa-envelope prefix grey-text"></i> <input
								name="email" type="email" id="orangeForm-email"
								class="form-control validate"> <label data-error="wrong"
								data-success="right" for="orangeForm-email">Email</label>
						</div>

						<div class="md-form mb-4">
							<i class="fa fa-lock prefix grey-text"></i> <input
								name="password" type="password" id="orangeForm-pass"
								class="form-control validate"> <label data-error="wrong"
								data-success="right" for="orangeForm-pass">Password</label>
						</div>

					</div>
					<div class="modal-footer d-flex justify-content-center">
						<button class="btn btn-deep-orange">Sign up</button>
					</div>
				</div>
			</div>
		</div>
	</form>
	<div class="text-center">
		<a class="btn btn-default btn-rounded mb-4"
			data-toggle="modal" data-target="#modalRegisterForm">Launch
			Registration Form</a>
	</div>

	</main>
	<script src="./static/js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="./static/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="./static/js/bootstrap.js"></script>
	<script src="./static/js/mdb.min.js"></script>
	<script src="./static/js/mdb.js"></script>
	<script src="./static/js/popper.min.js"></script>
</body>
</html>
