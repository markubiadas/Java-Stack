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
<title>Read Share</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col p-5 mt-3">
			<h1 class="mt-3">Save Travels</h1>
			
			<table class="table table-striped text-center">
				<thead>
					<tr>
						<th scope="col">Expense</th>
						<th scope="col">Vendor</th>
						<th scope="col">Amount</th>
						<th scope="col">Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="oneExpense" items="${expenseList }">
						<tr>
							<td><a href="/expenses/show/${oneExpense.id}"><c:out value="${oneExpense.expenseName }"></c:out></a></td>
							<td><c:out value="${oneExpense.vendor }"></c:out></td>
							<td>$ <c:out value="${oneExpense.amount }"></c:out></td>
							<td>
								<div class="d-flex align-items-center gap-2 justify-content-center">
									<a class="btn btn-warning" href="/expenses/edit/${oneExpense.id}">Edit</a>
									  
									<form action="/expenses/delete/${oneExpense.id}" method="post">
    								<input type="hidden" name="_method" value="delete">
    								<button type="submit" value="Delete" class="btn btn-danger">Delete</button>
									</form>
								</div>
							</td>
						</tr>
					</c:forEach>
				</tbody>			
			</table>
		</div>
	</div>
	
	<!-- Add Expense Form -->
	
	<div class="row">
		<div class="col-lg-6 p-5">
			<h1>Add an Expense</h1>
			<form:form action="/expenses/create" method="post" modelAttribute="expense">
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




<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>