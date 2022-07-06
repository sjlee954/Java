<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>정보 입력 폼</h1>

<form action="itemWrite.jsp">
	<table>
		<tr>
			<td>상품명</td> 
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>가격</td> 
			<td><input type="text" name="price"></td>
		</tr>
		<tr>
			<td>설명</td> 
			<td><textarea name="description" rows="5" cols="40"></textarea></td>
		</tr>
	</table>
	<div><input type="submit" value="전송">  <input type="reset" value="취소"></div>
</form>
</body>
</html>