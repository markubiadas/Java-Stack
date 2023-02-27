<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Submission</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col">
			<h3>Login</h3>
    		<form action='/login' method='POST'>
				<label>Email:</label>
    			<input type="text" name='email'>
				<label>Password:</label>
    			<input type='password' name='password'>
    			<input type='submit' value='login'>
    		</form>
		</div>
	</div>
</div>



<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>