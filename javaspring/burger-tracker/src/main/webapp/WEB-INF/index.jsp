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
	<div class="row">
		<div class="col p-5 mt-3">
			<h1 class="mt-3">Burger Tracker</h1>
			
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Burger Name</th>
						<th scope="col">Restaurant Name</th>
						<th scope="col">Rating (out of 5)</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="oneBurger" items="${burgerList }">
						<tr>
							<td><c:out value="${oneBurger.burgerName }"></c:out></td>
							<td><c:out value="${oneBurger.restaurantName }"></c:out></td>
							<td><c:out value="${oneBurger.rating }"></c:out></td>
							<td><a href="/burgers/${oneBurger.id }/edit">Edit</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	
	<!-- Burger Form -->
	
	<div class="row">
		<div class="col-lg-6 p-5">
			<h1>Add a Burger:</h1>
			<form:form action="/burgers/create" method="post" modelAttribute="burger">
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