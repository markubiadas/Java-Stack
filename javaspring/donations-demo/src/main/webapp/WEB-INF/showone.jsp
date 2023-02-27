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
		<div class="col-lg-6 p-5 mt-5 mx-auto">
			<h1>Donation details:</h1>
			<h2>Donation: <c:out value="${donation.donationName }"></c:out></h2>
			<h4>Quantity: <c:out value="${donation.quantity }"></c:out></h4>
			<h4>Donor: <c:out value="${donation.donor }"></c:out></h4>
			<h4>Description: <c:out value="${donation.description }"></c:out></h4>
			
			<a class="btn btn-warning" href="/donations">Back to Dashboard</a>
		</div>
	</div>
</div>


<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>