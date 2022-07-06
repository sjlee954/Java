<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.user}==사용자">
			<c:redirect url="Exam_09_userpage.jsp?id=${param.id}"></c:redirect>
		</c:when>
		<c:otherwise>
			<c:redirect  url="Exam_09_managerpage.jsp?id=${param.id}"></c:redirect>
		</c:otherwise>
	</c:choose>
	
</body>
</html>