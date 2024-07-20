<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	DBClass db = new DBClass();
	try {
		ResultSet rs= db.getData("SELECT * from studentdata");
		rs.next();
		request.setAttribute("studentData", rs);
	%>
		<c:out value="rs"></c:out>
	<%
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	%>
	${rs}
</body>
</html>