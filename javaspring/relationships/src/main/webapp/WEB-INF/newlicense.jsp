<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Import to use the c prefix -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Import when using the ModelAttribute -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- Import for checking error -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New License</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-lg-6 p-5 mt-5 mx-auto">
				<h1 class="mb-3">New License</h1>
				<form:form action="/licenses/create" method="post" modelAttribute="license">
				
					<div class="mb-3">
						<form:select class="form-select" path="person">
        					<c:forEach var="onePerson" items="${personList}">
        					
            					<!--- Each option VALUE is the id of the person --->
            					<form:option value="${onePerson.id}" path="person">
            					<!--- This is what shows to the user as the option --->
                					<c:out value="${onePerson.firstName}"/>
                					<c:out value="${onePerson.lastName}"/>
            					</form:option>
        					</c:forEach>
    					</form:select>
					</div>
					
					<div class="mb-3">
						<form:label for="state" class="form-label" path="state">State:</form:label>
						<form:errors path="state" class="text-danger" />
						<form:input type="text" path="state" class="form-control" />		
					</div>
					
					<div class="mb-3">
						<form:label for="expirationDate" class="form-label" path="expirationDate">Exp date:</form:label>
						<form:errors path="expirationDate" class="text-danger" />
						<form:input type="date" path="expirationDate" class="form-control" />		
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