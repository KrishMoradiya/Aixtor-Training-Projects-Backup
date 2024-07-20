<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Signin Page</title>
<script type="text/javascript" src="FormValidation.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<form action="Login" name="loginForm" method="Post">

			Email : <input class="form-control" type="email" name="email" required/> <br /> <br /> 
			Password : <input class="form-control" type="password" name="password" required/> <br /> <br /> 
			<input type="submit" class="form-control btn btn-primary" value="login now" onclick="return signInValidate();">
		</form>
	</div>
</body>
</html>