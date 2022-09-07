<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.it.lecture.*, java.util.*" %>
<jsp:useBean id="dao" class="com.it.lecture.lecturerDAO"></jsp:useBean>
<%
	List<lectureVO> list = dao.class_List();
	int count = dao.getCount();
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
			<h2 class="h2">총 <%=count%>개의 교과목이 있습니다.</h2>
			<table border="1">
				<tr>
					<th>과목코드</th>
					<th>과목명</th>
					<th>학점</th>
					<th>담당강사</th>
					<th>요일</th>
					<th>시작시간</th>
					<th>종료시간</th>
					<th>관리</th>
				</tr>
				<%	for(lectureVO vo : list) { %>			
				<tr>
					<td>
						<a href="detail.jsp?id=<%=vo.getId()%>"><%=vo.getId()%></a>
					</td>
					<td>
						<%=vo.getC_name()%>
					</td>
					<td>
						<%=vo.getCredit()%>
					</td>
					<td>
						<%=vo.getT_name()%>
					</td>

				<% if(vo.getWeek()== 1) { %>
					<td>월요일</td>
				<% }else if(vo.getWeek()== 2) { %>
					<td>화요일</td>
				<% }else if(vo.getWeek()== 3) { %>
					<td>수요일</td>
				<% }else if(vo.getWeek()== 4) { %>
					<td>목요일</td>
				<% }else if(vo.getWeek()== 5) { %>
					<td>금요일</td>
				<% }else if(vo.getWeek()== 6) { %>
					<td>토요일</td>
				<% }else if(vo.getWeek()== 7) { %>
					<td>일요일</td>
				<% } %>					
				
				<% if(vo.getStart_hour()<1000) { %>
					<td>
						0<%=vo.getStart_hour()%>
					</td>
				<% }else if(vo.getStart_hour()>=1000) { %>
					<td>
						<%=vo.getStart_hour()%>
					</td>
				<% } %>
					<td>
						<%=vo.getEnd_end()%>
					</td>
					<td>
						<a href="modify.jsp?id=<%=vo.getId()%>">수정</a>
						/
						<a href="delete_impl.jsp?id=<%=vo.getId()%>">삭제</a>
					</td>
				</tr>
				<% } %>
			</table>
			<input class="regist_btn" type="button" onclick="location.href='regist.jsp'" value="작성">
			<input class="t_btn" type="button" onclick="location.href='teacher.jsp'" value="강사조회">
		</section>
		
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>