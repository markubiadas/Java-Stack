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
<title>Ninja Info</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-lg-8 p-5 mt-5 mx-auto">
				<div class="d-flex justify-content-between align-items-center mb-5">
					<h1><c:out value="${ninja.firstName }"></c:out>  <c:out value="${ninja.lastName }"></c:out></h1>
					<div class="d-flex gap-4">
					<a class="btn btn-warning" href="">Edit</a>
					<a class="btn btn-primary" href="/">Dashboard</a>
					</div>
				</div>
				
				<table class="table table-striped">
					<tbody>
						
						<tr>
							<th scope="col">First Name:</th>
							<td><c:out value="${ninja.firstName }" /></td>
						</tr>
						<tr>
							<th scope="col">Last Name:</th>
							<td><c:out value="${ninja.lastName }" /></td>
						</tr>
						<tr>
							<th scope="col">Age:</th>
							<td><c:out value="${ninja.age }" /></td>
						</tr>
						<tr>
							<th scope="col">Dojo:</th>
							<td><c:out value="${ninja.dojo.name }" /></td>
						</tr>
					</tbody>
				</table>
				
			</div>
		</div>
	</div>


	




<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>