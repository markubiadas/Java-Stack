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
    <title>Login Registration</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container mt-5">
		<div class="row">
			<div class="col-lg-6 p-5 mt-5">
				<h1>Register</h1>
				<form:form action="/register" method="POST" modelAttribute="newUser" class="mb-5">
					<!-- register form -->
					<div class="mb-3">
						<form:label for="userName" class="form-label" path="userName">Username:</form:label>
						<form:errors path="userName" class="text-danger" />
						<form:input type="text" path="userName" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label for="email" class="form-label" path="email">Email:</form:label>
						<form:errors path="email" class="text-danger" />
						<form:input type="text" path="email" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label for="password" class="form-label" path="password">Password:</form:label>
						<form:errors path="password" class="text-danger" />
						<form:input type="password" path="password" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label for="confirm" class="form-label" path="confirm">Confirm Password:</form:label>
						<form:errors path="confirm" class="text-danger" />
						<form:input type="password" path="confirm" class="form-control" />
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form:form>
			</div>
			
			<div class="col-lg-6 p-5 mt-5">
				<h1>Login</h1>
				<form:form action="/login" method="POST" modelAttribute="newLogin">
					<!-- login form -->
					<div class="mb-3">
						<form:label for="email" class="form-label" path="email">Email:</form:label>
						<form:errors path="email" class="text-danger" />
						<form:input type="text" path="email" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label for="password" class="form-label" path="password">Password:</form:label>
						<form:errors path="password" class="text-danger" />
						<form:input type="password" path="password" class="form-control" />
					</div>
					<button type="submit" class="btn btn-primary">Login</button>
				</form:form>
			</div>
			
		</div>
	</div>
   
</body>
</html>