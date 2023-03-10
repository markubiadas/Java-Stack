<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Book</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col p-5 mt-5">
			<div class="d-flex justify-content-between align-items-center">
				<h1>Change your Entry</h1>
				<a class="btn btn-primary" href="/dashboard">Back to shelves</a>
			</div>
			
			<form:form action="/books/edit/${editBook.id}" method="POST" modelAttribute="editBook">
			<!-- include the line of code below for the update form -->
			<input type="hidden" name="_method" value="put" />
				<div class="mb-3">
					<form:label for="title" class="form-label" path="title">Title:</form:label>
					<form:errors path="title" class="text-danger" />
					<form:input type="text" path="title" class="form-control" />
				</div>
				<div class="mb-3">
					<form:label for="author" class="form-label" path="author">author:</form:label>
					<form:errors path="author" class="text-danger" />
					<form:input type="text" path="author" class="form-control" />
				</div>
				<div class="mb-3">
					<form:label for="thoughts" path="thoughts" class="form-label">thoughts:</form:label>
					<form:errors path="thoughts" class="text-danger" />
					<form:textarea class="form-control" rows="3" path="thoughts"></form:textarea>
				</div>
				
				<!-- line code below is to attach the user id to the submitted form -->
				<form:hidden path="user"/>
				
				<div class="d-flex justify-content-between align-items-center">
					<button type="submit" class="btn btn-primary">Submit</button>
					<a class="btn btn-secondary" href="/books/${editBook.id }">Back to book detail</a>
				</div>
			</form:form>
			
		</div>
	</div>
</div>


   
</body>
</html>