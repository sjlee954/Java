<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
<script type="text/javascript" src="script/employee.js"></script>
</head>
<body>
<div id="wrap" align="center">
		<h1>사원 정보 수정</h1>
		<form action="EmployeeServlet" method="post" name="frm">
			<input type="hidden" name="command" value="employee_update">
		<table class="list">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id" value="${employee.id }" readonly="readonly"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pass" value="${employee.pass }"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" value="${employee.name }"></td>
			</tr>
			<tr>
				<th>권한</th>
				<td>
					<c:choose>
						<c:when test="${employee.lev eq 'A'}">
							<select name="lev">
								<option value="A" selected="selected">운영자</option>
								<option value="B">일반회원</option>
							</select>
						</c:when>
						<c:otherwise>
							<select name="lev">
								<option value="A">운영자</option>
								<option value="B" selected="selected">일반회원</option>
							</select>
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<c:choose>
						<c:when test="${employee.gender eq '1'}">
							<select name="gender">
								<option value="1" selected="selected">남자</option>
								<option value="2">여자</option>
							</select>
						</c:when>
						<c:otherwise>
							<select name="gender">
								<option value="1">남자</option>
								<option value="2" selected="selected">여자</option>
							</select>
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="phone" value="${employee.phone }"></td>
			</tr>
		</table>
		<br><br>
		<input type="submit" value="확인" onclick="return employeeCheck()">
		<input type="reset" value="취소" >
		<input type="button" value="목록" onclick="location.href='EmployeeServlet?command=employee_list'">
	</form>
	</div>
</body>
</html>