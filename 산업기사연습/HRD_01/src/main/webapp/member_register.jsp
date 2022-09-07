<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.enroll.*,java.util.*"%>
<jsp:useBean id="dao" class="com.it.enroll.enrollDAO"></jsp:useBean>
<%
	String today = new SimpleDateFormat("yyyyMMdd").format(new Date());
	int member_seq = dao.member_seq();
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
		<form action="member_register_impl.jsp">
			<table border="1">
				<tr>
					<td>순번</td>
					<td><input type="text" name="member_seq" value=<%=member_seq %>>[자동생성]</td>
				</tr>
				<tr>
					<td>수강생명</td>
					<td><input type="text" name="c_name"></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td>과정코드</td>
					<td><input type="text" name="c_no"></td>
				</tr>
				<tr>
					<td>등록일</td>
					<td><input type="text" name="regist_date" value=<%=today %>></td>
				</tr>
				<tr>
					<td>수강등급</td>
					<td><input type="text" name="c_type">[일반/VIP]</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="등록">
						<input type="reset" value="취소">
						<input type="button" onclick="location.href='member.jsp'" value="목록">
					</td>
				</tr>
			</table>
		</form>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>