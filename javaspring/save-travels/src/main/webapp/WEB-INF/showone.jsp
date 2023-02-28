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
<title>Show Expense</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col-lg-8 p-5 mt-5 mx-auto">
			<div class="d-flex justify-content-between align-items-center mb-3">
				<h1>Expense Details</h1>
				<a class="btn btn-secondary" href="/">Go Back</a>
			</div>
			
			<table class="table">
				<tbody>
					<tr>
						<th scope="col">Expense Name:</th>
						<td><c:out value="${expense.expenseName} "></c:out></td>
					</tr>
					<tr>
						<th scope="col">Description:</th>
						<td><c:out value="${expense.description} "></c:out></td>
					</tr>
					<tr>
						<th scope="col">Vendor:</th>
						<td><c:out value="${expense.vendor} "></c:out></td>
					</tr>
					<tr>
						<th scope="col">Amount:</th>
						<td>$ <c:out value="${expense.amount} "></c:out></td>
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