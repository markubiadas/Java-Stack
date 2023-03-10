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
    <title>Read Share</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

	<div class="row">
		<div class="col p-5- mt-5">
		
			<!-- Welcome Username and logout button -->
			<div class="d-flex align-items-center justify-content-between mb-4">
				<h1>Welcome, <c:out value="${userName }"></c:out></h1>
				<a class="btn btn-danger" href="/logout">Logout</a>
			</div>
			
			<!-- Table description and add book button -->
			<div class="d-flex align-items-center justify-content-between mb-4">
				<p>Books from everyone's shelves:</p>
				<a class="btn btn-warning" href="/books/new">Add book to shelf</a>
			</div>
			
			<!-- All book table -->
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Title</th>
						<th scope="col">Author Name</th>
						<th scope="col">Posted By</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="oneBook" items="${bookList }">
						<tr>
							<td><c:out value="${oneBook.id }"></c:out></td>
							<td><a href="/books/${oneBook.id }"><c:out value="${oneBook.title }"></c:out></a></td>
							<td><c:out value="${oneBook.author }"></c:out></td>
							<td><c:out value="${oneBook.user.userName }"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>
			
			</table>
			
			
		</div>
	</div>
	

</div>






   
</body>
</html>