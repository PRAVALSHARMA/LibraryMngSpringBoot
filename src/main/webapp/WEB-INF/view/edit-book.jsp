<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Library</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" />
</head>
<body>
<div class="card">
		<div class="card-header bg-info text-center text-white">
			<h3>NEW USER</h3>
		</div>
		<div class="card-body">
			<form:form method = "post" modelAttribute="book" action="${book.id}/update">
				<div>
				Id: ${book.id }
			</div>
				<div class="row">
					<div class="col-2">
						<form:label path="auther" for="auther">
							<b>AUTHOR</b>
						</form:label>
					</div>
					<div class="col-4">
						<form:input path="auther" class="form-control" /></div>	</div>
				
				<div class="row">
					<div class="col-2">
						<form:label path= "name" for="name"><b>NAME</b></form:label>
					</div>
					<div class="col-4"><form:input path="name"  class="form-control" />
					</div>
				</div>
				<br />
				<div>
					<input type='submit' value='Update User'>
				</div>
			</form:form>
		</div>
	</div>
	
</body>
</html>