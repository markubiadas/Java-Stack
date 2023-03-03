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
<title>Drivers License</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-lg-6 p-5 mt-5 mx-auto text-center">
				<h1 class="mb-3">Drivers License</h1>
				<a class="btn btn-primary" href="/persons/new">New Person</a>
				<a class="btn btn-secondary" href="/licenses/new">New License</a>
			</div>
		</div>
	</div>


<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>