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
<title>Edit Donation</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-lg-6 p-5 mt-5">
				<h1 class="mb-3">Edit Donation</h1>
				
				<form:form action="/donations/edit/${editDonation.id }" method="POST" modelAttribute="editDonation">
					<input type="hidden" name="_method" value="put" />
					<div class="mb-3">
						<form:label for="donationName" class="form-label" path="donationName">Donation Name:</form:label>
						<form:errors path="donationName" class="text-danger" />
						<form:input type="text" path="donationName" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label for="donor" class="form-label" path="donor">Donor:</form:label>
						<form:errors path="donor" class="text-danger" />
						<form:input type="text" path="donor" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label for="quantity" class="form-label" path="quantity">Quantity:</form:label>
						<form:errors path="quantity" class="text-danger" />
						<form:input type="number" path="quantity" class="form-control" min="1" />
					</div>
					<div class="mb-3">
						<form:label for="description" path="description" class="form-label">Description</form:label>
						<form:errors path="description" class="text-danger" />
						<form:textarea class="form-control" rows="3" path="description"></form:textarea>
					</div>
					
					<div class="d-flex justify-content-between">
					<button type="submit" class="btn btn-primary">Submit</button>
					<a class="btn btn-secondary" href="/donations">Back to dashboard</a>
					</div>
				</form:form>
			</div>
		</div>
	</div>




<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>