<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Import to use the c prefix -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Import when using the ModelAttribute -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- Import for checking error -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Person</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-lg-6 p-5 mt-5 mx-auto">
				<h1 class="mb-3">New Person</h1>
				<form:form action="/persons/create" method="post" modelAttribute="person">
					<div class="mb-3">
						<form:label for="firstName" class="form-label" path="firstName">First Name:</form:label>
						<form:errors path="firstName" class="text-danger" />
						<form:input type="text" path="firstName" class="form-control" />				
					</div>
					<div class="mb-3">
						<form:label for="lastName" class="form-label" path="lastName">Last Name:</form:label>
						<form:errors path="lastName" class="text-danger" />
						<form:input type="text" path="lastName" class="form-control" />				
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