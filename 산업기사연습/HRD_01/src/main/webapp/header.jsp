<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{margin: 0; padding: 0;}
	
	header{height: 150px; line-height: 150px; 
		background-color: blue; color: white; text-align: center;}
		
	nav{height: 35px; line-height: 35px; background-color: Royalblue;}
	nav ul li {float: left; margin: 0 30px; list-style: none;}
	nav ul li a {text-decoration: none; color: white; line-height: 30px;}
	
	section{height: 700px; background-color: Gainsboro; padding: 50px 0 0 0;}
	section table{margin: 0 auto; width: 950px; height: 300px; text-align: center;}
	section ol{padding: 20px;}
	table a{text-decoration: none; color: white;}

	footer{background-color: CornflowerBlue; color: white; 
		height: 65px; text-align: center; line-height: 65px;}	
</style>
</head>
<body>
	<header><h1>수강관리 프로그램 ver 1.0</h1></header>
	<nav>
		<ul>
			<li><a href="class.jsp">과정관리</a></li>
			<li><a href="member.jsp">수강생 정보</a></li>
			<li><a href="teacher.jsp">교사정보</a></li>
			<li><a href="index.jsp">홈으로..</a></li>
		</ul>
	</nav>
</body>
</html>