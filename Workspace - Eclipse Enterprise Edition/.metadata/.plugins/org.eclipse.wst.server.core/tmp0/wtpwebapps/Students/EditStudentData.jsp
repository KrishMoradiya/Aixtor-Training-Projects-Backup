<%@page import="java.sql.ResultSet,java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int id= Integer.parseInt(request.getParameter("id"));
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from studentdata where id="+id+" LIMIT 1");
		
		while(rs.next()){
	%>
			<form action="Edit?id=${id}" method="Post">
				Name : <input type="text" name="name" value=<c:out value="rs.getString("name");"></c:out>/> <br /> <br /> 
				Email : <input type="email" name="email" value=<c:out value="rs.getString("email");"></c:out> /> <br /> <br /> 
				Password : <input type="password" name="password" value=<c:out value="rs.getString("password");"></c:out>/> <br /> <br /> 
				Gender : <input	type="radio" name="gender" value="Male" />Male <input type="radio" name="gender" value="Female" />Female<br />
				Mobile: <input type="text" name="mobile" value=<c:out value="rs.getString("mobile");"></c:out> /> <br /> <br /> 
				<input type="submit" value="Update">
			</form>
	<%
		}
	
	%>
</body>
</html>