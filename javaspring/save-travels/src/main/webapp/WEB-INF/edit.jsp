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
<title>Edit My Task</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col">
			<div class="col-lg-6 p-5 mx-auto">
			<div class="d-flex justify-content-between align-items-center">
				<h1>Edit Expense</h1>
				<a class="btn btn-secondary" href="/">Go Back</a>
			</div>
			
			<form:form action="/expenses/edit/${expense.id}" method="post" modelAttribute="expense">
			<input type="hidden" name="_method" value="put">
				<div class="mb-3">
					<form:label for="expenseName" class="form-label" path="expenseName">Name of Expense:</form:label>
					<form:errors path="expenseName" class="text-danger" />
					<form:input type="text" path="expenseName" class="form-control" />
				</div>
				<div class="mb-3">
					<form:label for="vendor" class="form-label" path="vendor">Vendor:</form:label>
					<form:errors path="vendor" class="text-danger" />
					<form:input type="text" path="vendor" class="form-control" />
				</div>
				<div class="mb-3">
					<form:label for="amount" class="form-label" path="amount">Amount:</form:label>
					<form:errors path="amount" class="text-danger" />
					<form:input type="text" path="amount" class="form-control" min="0"/>
				</div>
				<div class="mb-3">
					<form:label for="description" path="description" class="form-label">Description:</form:label>
					<form:errors path="description" class="text-danger" />
					<form:textarea path="description" class="form-control" rows="3"></form:textarea>
				</div>
				
				<button type="submit" class="btn btn-primary">Submit</button>
			</form:form>
		</div>
		</div>
	</div>
</div>





<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>