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
	<form action="itemWriteResult.jsp" method="post">
		<table>
			<tr>
				<td>상품명</td>
				<td><input type = "text" name ="name"></td>
			</tr>
			<tr>
				<td>가　격</td> 
				<td><input type = "text" name ="price"></td>
			</tr>
			<tr>
				<td>설　명</td> 
				<td><textarea cols="30" rows="5" name="decription" ></textarea></td>
			<tr> 
				<td colspan="2">
					<input type="submit" value="전송">  
					<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>