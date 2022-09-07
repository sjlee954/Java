<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.enroll.*,java.util.*"%>
 <jsp:useBean id="dao" class="com.it.enroll.enrollDAO"></jsp:useBean>
 <%
	int teacher_seq = Integer.parseInt(request.getParameter("teacher_seq"));	
	teacherVO vo = dao.teacher_detail_one(teacher_seq);
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
		<form action="teacher_update_impl.jsp">
		<input type="hidden" name="teacher_seq" value=<%=vo.getTeacher_seq() %>>
			<table border="1">
				<tr>
					<td>교사코드</td>
					<td><input type="text" name="teacher_code" style="float: left;" value=<%=vo.getTeacher_code() %> readonly="readonly"></td>
				</tr>
				<tr>
					<td>과정명</td>
					<td><input type="text" name="class_name" style="float: left;" value=<%=vo.getClass_name() %>></td>
				</tr>
				<tr>
					<td>교사명</td>
					<td><input type="text" name="teacher_name" style="float: left;" value=<%=vo.getTeacher_name()%>></td>
				</tr>
				<tr>
					<td>배정금액</td>
					<td><input type="text" name="class_price" style="float: left;" value=<%=vo.getClass_price()%>></td>
				</tr>
				<tr>
					<td>등록일</td>
					<td><input type="text" name="teacher_regist_date" style="float: left;" value=<%=vo.getTeacher_regist_date()%>></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="수정">
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