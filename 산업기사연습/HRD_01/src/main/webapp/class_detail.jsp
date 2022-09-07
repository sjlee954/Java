<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.enroll.*,java.util.*"%>
 <jsp:useBean id="dao" class="com.it.enroll.enrollDAO"></jsp:useBean>
<%
	int class_seq = Integer.parseInt(request.getParameter("class_seq"));	
	classVO vo = dao.class_detail(class_seq);
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
		<form action="class_register_impl.jsp">
			<table border="1">
				<tr>
					<td>개강월</td>
					<td><input type="text" name="regist_month" style="float: left;" value=<%=vo.getRegist_month() %>></td>
				</tr>
				<tr>
					<td>과정번호</td>
					<td><input type="text" name="c_no" style="float: left;" value=<%=vo.getC_no() %>></td>
				</tr>
				<tr>
					<td>캠퍼스</td>
					<td><input type="text" name="class_area" style="float: left;" value=<%=vo.getClass_area() %>></td>
				</tr>
				<tr>
					<td>수강료</td>
					<td><input type="text" name="tution" style="float: left;" value=<%=vo.getTution() %>></td>
				</tr>
				<tr>
					<td>교사코드</td>
					<td><input type="text" name="teacher_code" style="float: left;" value=<%=vo.getTeacher_code() %>></td>
				</tr>
				<tr>
					<td>교사명</td>
					<td><input type="text" name="teacher_code" style="float: left;" value=<%=vo.getTeacher_name() %>></td>
				</tr>
				<tr>
					<td>과정명</td>
					<td><input type="text" name="teacher_code" style="float: left;" value=<%=vo.getClass_name() %>></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="button" onclick="location.href='class.jsp'" value="목록">
					</td>
				</tr>
			</table>
		</form>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>