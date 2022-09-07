<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.enroll.*,java.util.*"%>
 <jsp:useBean id="dao" class="com.it.enroll.enrollDAO"></jsp:useBean>
 <%
 	String today = new SimpleDateFormat("yyyyMMdd").format(new Date());
 %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<section>
		<form action="teacher_register_impl.jsp">
			<table border="1">
				<tr>
					<td>교사코드</td>
					<td><input type="text" name="teacher_code" style="float: left;"></td>
				</tr>
				<tr>
					<td>과정명</td>
					<td><input type="text" name="class_name" style="float: left;"></td>
				</tr>
				<tr>
					<td>교사명</td>
					<td><input type="text" name="teacher_name" style="float: left;"></td>
				</tr>
				<tr>
					<td>배정금액</td>
					<td><input type="text" name="class_price" style="float: left;"></td>
				</tr>
				<tr>
					<td>등록일</td>
					<td><input type="text" name="teacher_regist_date" style="float: left;" value=<%=today %>></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="등록">
						<input type="reset" value="취소">
						<input type="button" onclick="location.href='teacher.jsp'" value="목록">
					</td>
				</tr>
			</table>
		</form>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>