<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Import when using the ModelAttribute -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- Import for checking error -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Burger Tracker</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<div class="container">	
	<!-- Burger Form -->
	
	<div class="row">
		<div class="col-lg-6 p-5 mt-3">
			<h1 class="mt-3">Edit a Burger:</h1>
			<form:form action="/burgers/${burger.id}" method="post" modelAttribute="burger">
			<input type="hidden" name="_method" value="put">
				<div class="mb-3">
					<form:label for="burgerName" class="form-label" path="burgerName">Burger Name:</form:label>
					<form:errors path="burgerName" class="text-danger" />
					<form:input type="text" path="burgerName" class="form-control" />
				</div>
				<div class="mb-3">
					<form:label for="restaurantName" class="form-label" path="restaurantName">Restaurant Name:</form:label>
					<form:errors path="restaurantName" class="text-danger" />
					<form:input type="text" path="restaurantName" class="form-control" />
				</div>
				<div class="mb-3">
					<form:label for="rating" class="form-label" path="rating">Rating:</form:label>
					<form:errors path="rating" class="text-danger" />
					<form:input type="number" path="rating" class="form-control" min="0" max="5"/>
				</div>
				<div class="mb-3">
					<form:label for="notes" class="form-label" path="notes">Notes:</form:label>
					<form:errors path="notes" class="text-danger" />
					<form:textarea class="form-control" path="notes" rows="3"></form:textarea>
				</div>
				
				<button type="submit" class="btn btn-primary">Submit</button>
			
			</form:form>
		</div>
	</div>
</div>





<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>