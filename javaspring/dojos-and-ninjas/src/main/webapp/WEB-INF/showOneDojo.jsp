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
<title>Dojo Page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-lg-10 p-5 mt-5 mx-auto">
			
				<div class="d-flex justify-content-between align-items-center">
					<h1><c:out value="${dojo.name }"></c:out> Students</h1>
					<div class="d-flex gap-4">
						<a class="btn btn-primary" href="/">Back to Dashboard</a>
						<a class="btn btn-secondary" href="/ninjas/new">Add Ninja</a>
					</div>
				</div>
				
				<table class="table table-striped mx-auto">
					<thead>
						<tr>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Age</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="oneNinja" items="${dojoList.ninjas }">
							<tr>
								<td><a href="/ninjas/${oneNinja.id} "><c:out value="${oneNinja.firstName }"></c:out></a></td>
								<td><c:out value="${oneNinja.lastName }"></c:out></td>
								<td><c:out value="${oneNinja.age }"></c:out></td>
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