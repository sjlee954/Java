<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.enroll.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<section>
		<form action="class_register_impl.jsp">
			<table border="1">
				<tr>
					<td>개강월</td>
					<td><input type="text" name="regist_month" style="float: left;"></td>
				</tr>
				<tr>
					<td>과정번호</td>
					<td><input type="text" name="c_no" style="float: left;"></td>
				</tr>
				<tr>
					<td>캠퍼스</td>
					<td><input type="text" name="class_area" style="float: left;"></td>
				</tr>
				<tr>
					<td>수강료</td>
					<td><input type="text" name="tution" style="float: left;"></td>
				</tr>
				<tr>
					<td>교사코드</td>
					<td><input type="text" name="teacher_code" style="float: left;"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="등록">
						<input type="reset" value="취소">
						<input type="button" onclick="location.href='class.jsp'" value="목록">
					</td>
				</tr>
			</table>
		</form>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>