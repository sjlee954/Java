<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.enroll.*,java.util.*"%>
    <jsp:useBean id="dao" class="com.it.enroll.enrollDAO"></jsp:useBean>
<%
	List<teacherVO> list = dao.teacherList();
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
		<table border="1">
			<tr>
				<th>순번</th><th>교사코드</th><th>담당과정명</th><th>교사명</th><th>배정금액</th><th>등록일</th><th>수정/삭제</th>
			</tr>
			<%for(teacherVO vo : list) { %>
			<tr>
				<td class="text-center">
					<a href="teacher_detail.jsp?teacher_seq=<%=vo.getTeacher_seq()%>"><%=vo.getTeacher_seq()%></a>
				</td>
				<td><%=vo.getTeacher_code()%></td>
				<td><%=vo.getClass_name()%></td>
				<td><%=vo.getTeacher_name()%></td>
				<td><%=vo.getClass_price()%></td>
				<td><%=vo.getTeacher_regist_date()%></td>
				<td><a href="teacher_update.jsp?teacher_seq=<%=vo.getTeacher_seq()%>">수정</a>　　<a href="teacher_delete_impl.jsp?teacher_seq=<%=vo.getTeacher_seq()%>">삭제</a></td>
			</tr>
			<% } %>
			<tr>
				<td colspan="7"><a href="teacher_register.jsp">등록</a></td>
			</tr>
		</table>
	</section>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>