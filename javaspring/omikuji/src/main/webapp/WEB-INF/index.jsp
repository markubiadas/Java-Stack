<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col-lg-6 mx-auto mt-5">
			<h1 class="text-center">Send an Omikuji</h1>
			<form action='/send' method='POST'>
				<div class="mb-3">
				<label for="years" class="form-label">Pick a number from 5 to 25</label>
				<input type="number" class="form-control" name="years" min="5" max="25">
				</div>
			
  				<div class="mb-3">
    			<label for="city" class="form-label">Enter the name of any city:</label>
    			<input type="text" class="form-control" name="city">
  				</div>
  				
  				<div class="mb-3">
    			<label for="name" class="form-label">Enter the name of the person:</label>
    			<input type="text" class="form-control" name="name">
  				</div>
  				
  				<div class="mb-3">
    			<label for="occupation" class="form-label">Enter professional endeavor or hobby:</label>
    			<input type="text" class="form-control" name="occupation">
  				</div>
  				
  				<div class="mb-3">
    			<label for="thing" class="form-label">Enter any type of living thing:</label>
    			<input type="text" class="form-control" name="thing">
  				</div>
  				
  				<div class="mb-3">
  				<label for="message" class="form-label">Say something nice to someone:</label>
  				<textarea class="form-control" name="message" rows="3"></textarea>
				</div>
				
				<div class="mb-3">
				<p>Send and show a friend</p>
				</div>
				
  				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</div>


<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>