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
    <title>Book Detail</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
   
	<div class="container">
		<div class="row">
			<div class="col mt-5 p-5">
				<div class="d-flex justify-content-between align-items-center mb-5">
					<h1><c:out value="${book.title }"></c:out> </h1>
					<a class="btn btn-primary" href="/dashboard">Back to shelves</a>
				</div>
				
				<h3><c:out value="${book.user.userName }"/> read <c:out value="${book.title }"/> by <c:out value="${book.author }"/></h3>
				<h3 class="mb-5">Here are <c:out value="${book.user.userName }"/> thoughts:</h3>
				
				<p class="mb-5"><c:out value="${book.thoughts }"/></p>
				
				
				<!-- Edit and delete button conditional rendering -->
				<c:if test="${book.user.id.equals(userId) }">
				<div class="d-flex align-items-center gap-4">
					<!-- Edit button -->
					<a class="btn btn-warning" href="/books/edit/${book.id}">Edit</a>
					<!-- Delete form -->
					<form action="/books/delete/${book.id}" method="POST">
					<input type="hidden" name="_method" value="delete"/>
					<input class="btn btn-danger" type="submit" value="delete" />
					</form>
				</div>
				</c:if>
				
				
			</div>
		</div>
	</div>
   
</body>
</html>