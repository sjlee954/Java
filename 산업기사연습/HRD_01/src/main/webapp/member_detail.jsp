<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.enroll.*,java.util.*"%>
 <jsp:useBean id="dao" class="com.it.enroll.enrollDAO"></jsp:useBean>
<%
	int member_seq = Integer.parseInt(request.getParameter("member_seq"));	
	memberVO vo = dao.member_detail(member_seq);
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
					<td><input type="text" name="member_seq" style="float: left;" value=<%=vo.getMember_seq()%>></td>
				</tr>
				<tr>
					<td>과정코드</td>
					<td><input type="text" name="c_no" style="float: left;" value=<%=vo.getC_no() %>></td>
				</tr>
				<tr>
					<td>수강생명</td>
					<td><input type="text" name="c_name" style="float: left;" value=<%=vo.getC_name() %>></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="phone" style="float: left;" value=<%=vo.getPhone() %>></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="address" style="float: left;" value=<%=vo.getAddress() %>></td>
				</tr>
				<tr>
					<td>수강등록일</td>
					<td><input type="text" name="regist_date" style="float: left;" value=<%=vo.getRegist_date() %>></td>
				</tr>
				<tr>
					<td>수강등급</td>
					<td><input type="text" name="c_type" style="float: left;" value=<%=vo.getC_type() %>></td>
				</tr>
				<tr>
					<td>교사명</td>
					<td><input type="text" name="teacher_name" style="float: left;" value=<%=vo.getTeacher_name() %>></td>
				</tr>
				<tr>
					<td>과정명</td>
					<td><input type="text" name="class_name" style="float: left;" value=<%=vo.getClass_name() %>></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="button" onclick="location.href='member.jsp'" value="목록">
					</td>
				</tr>
			</table>
		</form>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>