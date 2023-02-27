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
<title>New Book</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col-lg-6 mx-auto mt-5 p-5">
			<h1 class="mb-3">Create a Book</h1>
			
			<!-- Use the form prefix when using data binding. Also add change name into path. -->
			<!-- The variable that will be inside the path should be the same as the ones in the model constructor -->
			<!-- Also add / at the end of input tag -->
			<form:form action="/books/create" method="post" modelAttribute="book">
				<div class="mb-3">
    				<form:label for="title" class="form-label" path="title">Book Title:</form:label>
    				<form:errors path="title" class="text-danger" />
    				<form:input path="title" type="text" class="form-control"/>
  				</div>
  				<div class="mb-3">
  					<form:label for="description" class="form-label" path="description">Book description:</form:label>
  					<form:errors path="description" class="text-danger" />
  					<form:textarea class="form-control" path="description" rows="3"></form:textarea>
				</div>
				<div class="mb-3">
    				<form:label for="language" class="form-label" path="language">Language:</form:label>
    				<form:errors path="language" class="text-danger" />
    				<form:input type="text" class="form-control" path="language"/>
  				</div>
  				<div class="mb-3">
					<form:label for="numberOfPages" class="form-label" path="numberOfPages">Pages</form:label>
					<form:errors path="numberOfPages" class="text-danger" />
					<form:input type="number" class="form-control" path="numberOfPages" min="5" max="10000"/>
				</div>
  				
  				<div class="d-flex justify-content-between align-items-center">
  				<button type="submit" class="btn btn-primary">Submit</button>
  				<a class="btn btn-secondary" href="/books">Back to Home</a>
  				</div>
  				
			</form:form>
		</div>
	</div>
</div>




<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>