<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reading Books</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col mt-5 p-5">
			<div class=" d-flex mb-5 justify-content-between align-items-center">
			<h1>All Books</h1>
			<a class="btn btn-secondary" href="/books/new">Add Book</a>
			</div>
			
			<table class="table mx-auto text-center">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Title</th>
						<th scope="col">Language</th>
						<th scope="col"># Pages</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="oneBook" items="${books }">
					<tr>
						<td><c:out value="${oneBook.id }"></c:out></td>
						<td><a href="/books/${oneBook.id }"><c:out value="${oneBook.title }"></c:out></a></td>
						<td><c:out value="${oneBook.language }"></c:out></td>
						<td><c:out value="${oneBook.numberOfPages }"></c:out></td>
						<td><a href="/books/${oneBook.id }/edit" class="btn btn-warning">Edit</a>
							<!-- Delete Button -->
							<form action="/books/${oneBook.id}" method="post">
    						<input type="hidden" name="_method" value="delete">
    						<input class="btn btn-danger" type="submit" value="Delete">
							</form>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</div>
</div>




<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>