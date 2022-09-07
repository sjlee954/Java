<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.dao.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<jsp:useBean id="dao" class="com.it.dao.memberDAO"/>
<jsp:useBean id="vo" class="com.it.dao.memberVO"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<section>
	<h1>쇼핑몰 회원 등록</h1>
	<form method="post" action="joinImpl.jsp" name="frm">
		<table border="1" style="margin-left: auto; margin-right: auto;">
			<tr>
				<th>회원번호(자동발생)</th>
				<td><input type="text" value="${dao.seqCustno(vo)}"></td>
			</tr>
			<tr>
				<th>회원성명</th>
				<td></td>
			</tr>
			<tr>
				<th>회원전화</th>
				<td></td>
			</tr>
			<tr>
				<th>회원주소</th>
				<td></td>
			</tr>
			<tr>
				<th>가입일자</th>
				<td></td>
			</tr>
			<tr>
				<th>고객등급 [A:VIP,B:일반,C:직원]</th>
				<td></td>
			</tr>
			<tr>
				<th>도시코드</th>
				<td></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="등록" onclick="return joinForm_check()">
					<input type="button" value="조회" onclick="location.href='memberForm.jsp'">
				</td>
			</tr>
		</table>
	</form>
	</section>
	
	<%@include file="footer.jsp" %>
</body>
</html>