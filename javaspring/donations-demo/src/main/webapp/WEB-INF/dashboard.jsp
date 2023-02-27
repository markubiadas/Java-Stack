<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Donations Demo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col p-5 mt-5">
			<div class="d-flex justify-content-between align-items-center mb-3">
				<h1>Donation Dashboard</h1>
				<a class="btn btn-primary" href="/donations/new">Add Donation</a>
			</div>
		
			
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Donation</th>
						<th scope="col">Quantity</th>
						<th scope="col">Donor</th>
						<th scope="col">Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="oneDonation" items="${donationList }">
						<tr>
							<td><a href="/donations/${oneDonation.id }"><c:out value="${oneDonation.donationName }"></c:out></a></td>
							<td><c:out value="${oneDonation.quantity }"></c:out> </td>
							<td><c:out value="${oneDonation.donor }"></c:out> </td>
							<td>
								<a class="btn btn-warning" href="/donations/edit/${oneDonation.id}">Edit</a>
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