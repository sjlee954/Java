<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.it.lecture.*, java.util.*" %>
<jsp:useBean id="dao" class="com.it.lecture.lecturerDAO"></jsp:useBean>
<%
	List<lectureVO> list = dao.teacher_List();
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
			<h2 class="h2">강사 목록</h2>
			<table border="1">
				<tr>
					<th>강사번호</th>
					<th>강사명</th>
					<th>전공</th>
					<th>연구분야</th>
					<th>관리</th>
				</tr>
				<%	for(lectureVO vo : list) { %>			
				<tr>
					<td>
						<a href="teacher_detail.jsp?idx=<%=vo.getIdx()%>"><%=vo.getIdx()%></a>
					</td>
					<td>
						<%=vo.getT_name()%>
					</td>
					<td>
						<%=vo.getMajor()%>
					</td>
					<td>
						<%=vo.getField()%>
					</td>
					<td>
						<a href="teacher_delete_impl.jsp?idx=<%=vo.getIdx()%>">삭제</a>
					</td>
				</tr>
				<% } %>
			</table>
			<input class="regist_btn" type="button" onclick="location.href='teacher_regist.jsp'" value="강사추가">
		</section>
		
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>