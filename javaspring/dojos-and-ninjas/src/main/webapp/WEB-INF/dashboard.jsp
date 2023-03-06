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
<title>Dojos and Ninjas - Dashboard</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-lg-8 p-5 mt-5 mx-auto">
			
				<div class="d-flex justify-content-between align-items-center">
					<h1>All Dojos</h1>
					<div class="d-flex gap-4">
						<a class="btn btn-primary" href="/dojos/new">Add Dojo</a>
						<a class="btn btn-secondary" href="/ninjas/new">Add Ninja</a>
					</div>
				</div>
				
				<table class="table table-striped mx-auto text-center">
					<thead>
						<tr>
							<th scope="col">Dojo name</th>
							<th scope="col">Number of Students</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="oneDojo" items="${dojoList }">
							<tr>
								<td><a href="/dojos/show/${oneDojo.id}"><c:out value="${oneDojo.name }"></c:out></a></td>
								<td><c:out value="${oneDojo.ninjas.size() }"></c:out></td>
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