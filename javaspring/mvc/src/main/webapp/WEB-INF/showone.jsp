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
		<div class="col mt-5 p-5 mx-auto">
			<h1>Title: <c:out value="${book.title }"></c:out></h1>
			<h4>Description: <c:out value="${book.description }"></c:out> </h4>
			<h4>Language: <c:out value="${book.language }"></c:out></h4>
			<h4>Number of Pages: <c:out value="${book.numberOfPages }"></c:out></h4>
			
			
			<a class="btn btn-warning mt-5" href="/books">See all books</a>
		</div>
	</div>
</div>




<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>