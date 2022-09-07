<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.enroll.*,java.util.*"%>
    <jsp:useBean id="dao" class="com.it.enroll.enrollDAO"></jsp:useBean>
<%
	List<classVO> list = dao.classList();
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
				<th>순번</th><th>개강월</th><th>과정번호</th><th>캠퍼스</th><th>수정/삭제</th>
			</tr>
			<%for(classVO vo : list) { %>
			<tr>
				<td class="text-center">
					<a href="#"><%=vo.getClass_seq()%></a>
				</td>
				<td><%=vo.getRegist_month()%></td>
				<td><a href="class_detail.jsp?class_seq=<%=vo.getClass_seq() %>"><%=vo.getC_no()%></a></td>
				<td><%=vo.getClass_area()%></td>
				<td><a href="class_update.jsp?class_seq=<%=vo.getClass_seq() %>">수정</a>　　<a href="class_delete_impl.jsp?class_seq=<%=vo.getClass_seq() %>">삭제</a></td>
			</tr>
			<% } %>
			<tr>
				<td colspan="5"><a href="class_register.jsp">등록</a></td>
			</tr>
		</table>
	</section>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>