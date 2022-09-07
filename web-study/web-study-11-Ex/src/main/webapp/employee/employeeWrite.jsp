<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<h1>사원 정보 등록</h1>
		<form action="EmployeeServlet" method="post" name=frm>
			<input type="hidden" name="command" value="employee_write">
		<table class="list">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>권한</th>
				<td>
					<select name="lev">
						<option value="A" selected="selected">운영자</option>
						<option value="B">일반회원</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<select name="gender">
						<option value="1" selected="selected">남자</option>
						<option value="2">여자</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="phone"></td>
			</tr>
		</table>
		<br><br>
		<input type="submit" value="확인" onclick="return employeeCheck()">
		<input type="reset" value="취소">
		<input type="button" value="목록" onclick="location.href='EmployeeServlet?command=employee_list'">
	</form>	
	</div>
</body>
</html>