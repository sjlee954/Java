<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//request.setCharacterEncoding("utf-8");
		String str = request.getParameter("select");
		if(str.equals("네이버")) {
			response.sendRedirect("https://www.naver.com/");
		}else if(str.equals("다음")){
			response.sendRedirect("https://www.daum.net/");
		}else if(str.equals("네이트")){
			response.sendRedirect("https://www.nate.com/");
		}else 
			response.sendRedirect("https://www.google.co.kr/");
	
	%>
</body>
</html>