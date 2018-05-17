<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Question List</title>
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
			<a class="navbar-brand" href="#">Application</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#basicExampleNav" aria-controls="basicExampleNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="basicExampleNav">


				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="#">Home
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#"></a></li>
					<li class="nav-item"><a class="nav-link" href="#"></a></li>

					<li class="nav-item dropdown">
						<!--  <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                        <div class="dropdown-menu dropdown-primary" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div> -->
					</li>
				</ul>
				<!-- <form class="form-inline">
                    <div class="md-form mt-0">
                        <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                    </div>
                </form> -->
				<div class="nav-item dropdown" id="basicExampleNav">
					<a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
					<div class="dropdown-menu dropdown-primary"
						aria-labelledby="navbarDropdownMenuLink">
						<a class="dropdown-item" href="#">Logout</a>

					</div>
				</div>
			</div>
		</nav>
	</header>
	<main> <%-- 	<table>
		<c:forEach var="question" items="${questionList }">
			<tr>
				<td><c:out value="${question.id }" /></td>
				<td><c:out value="${question.question }" /></td>
			</tr>
		</c:forEach>
	</table> --%>

	<div class="card">
		<div class="card-body">

			<!--Table-->
			<table class="table table-hover table-responsive-md table-fixed">

				<!--Table head-->
				<thead>
					<tr>
						<th>#</th>
						<th>Question</th>
					</tr>
				</thead>
				<!--Table head-->

				<!--Table body-->
				<tbody>
					<c:forEach var="question" items="${questionList }">
						<tr>
							<td><c:out value="${question.id }" /></td>
							<td><c:out value="${question.question }" /></td>
						</tr>
					</c:forEach>
				</tbody>
				<!--Table body-->

			</table>
			<!--Table-->

		</div>
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