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
<title>New Ninja</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-lg-6 p-5 mt-5">
				<h1 class="mb-3">New Ninja</h1>
				
				<form:form action="/ninjas/new" method="POST" modelAttribute="newNinja">
				
					<div class="mb-3">
						<form:label for="dojo" class="form-label" path="dojo">Dojo:</form:label>
						<form:select path="dojo" class="form-select">
							<c:forEach var="oneDojo" items="${dojoList }">
								<form:option value="${oneDojo.id }" path="dojo">
									<c:out value="${oneDojo.name }"></c:out>
								</form:option>
							</c:forEach>
						</form:select>
						<form:errors path="dojo" class="text-danger" />
					</div>
					
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
					<div class="mb-3">
						<form:label for="age" class="form-label" path="age">Age:</form:label>
						<form:errors path="age" class="text-danger" />
						<form:input type="number" path="age" class="form-control" min="5" />
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