<%@page import="util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% response.sendRedirect("EmployeeServlet?command=employee_list"); %>
<% DBManager.getConnection(); %>
</body>
</html>