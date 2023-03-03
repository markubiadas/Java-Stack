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
<title>Dashboard</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	
	<div class="container">
		<div class="row">
			<div class="col-lg-10 p-5 mt-5 mx-auto">
			
				<div class="d-flex justify-content-between align-items-center">
					<h1>Person Details</h1>
					<div class="d-flex gap-3">
						<a class="btn btn-primary" href="/persons/new">New Person</a>
						<a class="btn btn-secondary" href="/licenses/new">New License</a>
					</div>
				</div>
				
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Name</th>
							<th scope="col">License Number</th>
							<th scope="col">State</th>
							<th scope="col">Exp Date</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="onePerson" items="${personList}">
						<tr>
							<td><c:out value="${onePerson.firstName }"></c:out></td>
							<td>00000<c:out value="${onePerson.id }"></c:out></td>
							<td><c:out value="${onePerson.license.state }"></c:out></td>
							<td><c:out value="${onePerson.license.expirationDate }"></c:out></td>
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