<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col-lg-6 mx-auto mt-5 text-center">
			<h1 class="mb-3">Here's your Omikuji!</h1>
			<h4 class="bg-info text-light p-5 mb-3">
			In <c:out value="${years }"></c:out> years, you will live in <c:out value="${city }"></c:out> 
			with <c:out value="${name }"></c:out> as your roommate, 
			<c:out value="${occupation }"></c:out> for a living. 
			The next time you see a <c:out value="${thing }"></c:out>, 
			you will have a good luck. Also, <c:out value="${message }"></c:out>
			</h4>
			<a class="btn btn-secondary" href="/">Go back</a>
		</div>
	</div>
</div>



<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>