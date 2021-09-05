<%@page import="com.EmployeeDto.EmployeeDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
EmployeeDto dto=(EmployeeDto)request.getAttribute("addEmp");
	String mssg=(String)request.getAttribute("msg");
%>
<%=mssg %>
</body>
</html>