<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Register" method="post">
		Name : <input type="text" name="name" required></br>
		Email : <input type="email" name="email" required></br>
		Password : <input type="text" name="password" required></br>
		Gender : <input type="radio" name="gender" value="Male">&nbsp;Male
				<input type="radio" name="gender" value="Female">&nbsp;Female
				</br>
		Mobile Number : <input type="text" name="mobilenumber" maxlength="10" minlength="10" required>
		</br>
		<input type="submit" value="Register Now">
	</form>
</body>
</html>