<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="board" class="com.mission.javabeans.BoardBean"/>
<jsp:setProperty name="board" property="*"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>입력 완료된 정보</h1>
<table>
	<tr>
		<td> 작성자 </td>
		<td> <%=board.getName() %> </td>
	</tr>	
	<tr>
		<td> 비밀번호 </td>
		<td> <jsp:getProperty name="board" property="pass" /> </td>
	</tr>
	<tr>
		<td> 이메일 </td>
		<td> <jsp:getProperty name="board" property="email" /> </td>
	</tr>
	<tr>
		<td> 글제목 </td>
		<td> <jsp:getProperty name="board" property="title" /> </td>
	</tr>
	<tr>
		<td> 글내용 </td>
		<td> <jsp:getProperty name="board" property="content" /> </td>
	</tr>
</table>
</body>
</html>