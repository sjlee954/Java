<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Exam_09_test.jsp" method="get">
		아이디 : <input type="text" name="id"><br>	
		암　호 : <input type="password" name="pwd"><br>
		
		<input type="radio" name="user" value="사용자" checked="checked">사용자 
		<input type="radio" name="user" value="관리자">관리자 <br>
		<input type="submit" value="로그인" >
	</form>
</body>
</html>