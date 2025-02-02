<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>

    <center>
        <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/student" user="root"  password="root"/>
        <sql:query dataSource="${db}" var="rs">SELECT * from studentdata;</sql:query>
        <table border="2" width="100%">
        <tr>  
            <th>Student ID</th>  
            <th>Student Name</th>  
            <th>Email ID</th>  
            <th>Gender</th>  
            <th>Mobile No.</th>
            <th>Action</th>  
        </tr>  
            <c:forEach var="data" items="${rs.rows}">  
                <tr>  
                    <td><c:out value="${data.id}"/></td>  
                    <td><c:out value="${data.name}"/></td>  
                    <td><c:out value="${data.email}"/></td>  
                    <td><c:out value="${data.gender}"/></td>
                    <td><c:out value="${data.mobile}"/></td>
                    <td><a href="EditServlet.jsp?id=${data.id}">Edit</a></td>
                </tr>  
            </c:forEach>  
        </table> 
    </center>
</body>
</html>
