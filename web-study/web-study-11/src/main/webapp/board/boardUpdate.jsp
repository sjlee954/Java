<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
</head>
<body>
	<div id="wrap" align="center">
	<h1>게시글 등록</h1>
	<form action="BoardServlet" method="post" name="frm">
		<input type="hidden" name="command" value="board_update">
		<input type="hidden" name="num" value="${board.num}">
	
		<table class="list">
			<tr>
				<th>작성자</th>
				<td><input type="text" name="name" value="${board.name }"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pass" value="${board.pass}"></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" name="email" value="${board.email}"></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" size="70" value="${board.title }"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea cols="70" rows="15" name="content">${board.content }</textarea></td>
			</tr>
		</table>
		<br><br>
		<input type="submit" value="등록" onclick="return boardCheck()">
		<input type="reset" value="다시 작성">
		<input type="button" value="목록" onclick="location.href='BoardServlet?command=board_list'">
	</form>
</div>
</body>
</html>