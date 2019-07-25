<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="java.net.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>User Reg</title>
<meta name="keywords" content="">

 <!-- Bootstrap and Font Awesome css -->
 <link href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css" rel="stylesheet">
 <!-- #### JAVASCRIPT FILES ### -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>

<script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.5.3/js/bootstrapValidator.js"></script>


</head>
<body class="">
	<div class="row">
		<div class="col-sm-12">
			<p style="color: green; font-size: 15px; text-align: center">${statusMessage}</p>

		</div>
		
		<div > 
				<p>
					<a href="signout"><button class="btn btn-warning"> Logout</button></a>
				</p>
		</div>
	</div>


</body>
</html>