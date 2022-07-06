<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1 {text-align: center;}
table{margin: 0 auto; width:800px; height: 500px;}
.tds {background: lightgray; text-align: center;}
#tdd {text-align: center;}
div {text-align: center;}
*{font-family: "휴먼편지체";}
</style>
</head>
<body>
<h1>게시판 글쓰기</h1><br>
<form action="boardWrite.jsp" method="post">
<table border="1">
	<tr>
		<td class="tds"> 작성자 </td>
		<td> <input type="text" name="name" size="5"></td>
	</tr>	
	<tr>
		<td class="tds"> 비밀번호 </td>
		<td> <input type="password" name="pass" size="10">(게시물 수정 삭제시 필요합니다.)</td>
	</tr>
	<tr>
		<td class="tds"> 이메일 </td>
		<td> <input type="text" name="email" size="15"></td>
	</tr>
	<tr>
		<td class="tds"> 글제목 </td>
		<td> <input type="text" name="title" size="30"></td>
	</tr>
	<tr>
		<td class="tds"> 글내용 </td>
		<td> <textarea rows="20" cols="100" name="content"></textarea> </td>
	</tr>
</table>
	
<div><input type="submit" value="전송"> <input type="reset" value="다시작성"></div>
	
</form>
</body>
</html>