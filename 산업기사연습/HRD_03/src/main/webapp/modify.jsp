<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.it.lecture.*, java.util.*"%>
<jsp:useBean id="dao" class="com.it.lecture.lecturerDAO"></jsp:useBean>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	lectureVO vo = dao.oneClass(id);
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
		<h1>교과목 수정</h1>
			<form action="modify_impl.jsp">
				<table border="1">
					<tr>
						<th>교과목 코드</th>
						<td><input type="text" name="id" value=<%=vo.getId() %> readonly="readonly"></td>
					</tr>
					<tr>
						<th>과목명</th>
						<td><input type="text" name="c_name" value=<%=vo.getC_name() %>></td>
					</tr>
					<tr>
						<th>담당강사</th>
						<td>
							<select name="lecturer">
								<% 
									if(vo.getLecturer().equals("1")) { %>
									<option>담당강사선택</option> 
									<option selected="selected" value="1">김교수</option>
									<option value="2">이교수</option>
									<option value="3">박교수</option>
									<option value="4">우교수</option>
									<option value="5">최교수</option>
									<option value="6">강교수</option>
									<option value="7">황교수</option>
								<% }else if(vo.getLecturer().equals("2")) { %>								
									<option value="1">김교수</option>
									<option selected="selected" value="2">이교수</option>
									<option value="3">박교수</option>
									<option value="4">우교수</option>
									<option value="5">최교수</option>
									<option value="6">강교수</option>
									<option value="7">황교수</option>
								<% }else if(vo.getLecturer().equals("3")) { %>								
									<option value="1">김교수</option>
									<option value="2">이교수</option>
									<option selected="selected" value="3">박교수</option>
									<option value="4">우교수</option>
									<option value="5">최교수</option>
									<option value="6">강교수</option>
									<option value="7">황교수</option>
								<% }else if(vo.getLecturer().equals("4")) { %>								
									<option value="1">김교수</option>
									<option value="2">이교수</option>
									<option value="3">박교수</option>
									<option selected="selected" value="4">우교수</option>
									<option value="5">최교수</option>
									<option value="6">강교수</option>
									<option value="7">황교수</option>
								<% }else if(vo.getLecturer().equals("5")) { %>								
									<option value="1">김교수</option>
									<option value="2">이교수</option>
									<option value="3">박교수</option>
									<option value="4">우교수</option>
									<option selected="selected" value="5">최교수</option>
									<option value="6">강교수</option>
									<option value="7">황교수</option>
								<% }else if(vo.getLecturer().equals("6")) { %>								
									<option value="1">김교수</option>
									<option value="2">이교수</option>
									<option value="3">박교수</option>
									<option value="4">우교수</option>
									<option value="5">최교수</option>
									<option selected="selected" value="6">강교수</option>
									<option value="7">황교수</option>
								<% }else if(vo.getLecturer().equals("7")) { %>								
									<option value="1">김교수</option>
									<option value="2">이교수</option>
									<option value="3">박교수</option>
									<option value="4">우교수</option>
									<option value="5">최교수</option>
									<option value="6">강교수</option>
									<option selected="selected" value="7">황교수</option>
								<%	
									}
								%>
							</select>
						</td>
					</tr>
					<tr>
						<th>학점</th>
						<td><input type="text" name="credit" value=<%=vo.getCredit()%>></td>
					</tr>
					<tr>
						<th>요일</th>
						<td>
						<%if(vo.getWeek()==1) { %>
							<input type="radio" name="week" value="1" checked="checked">월
							<input type="radio" name="week" value="2">화
							<input type="radio" name="week" value="3">수
							<input type="radio" name="week" value="4">목
							<input type="radio" name="week" value="5">금
							<input type="radio" name="week" value="6">토
						<%}else if(vo.getWeek()==2) { %>
							<input type="radio" name="week" value="1">월
							<input type="radio" name="week" value="2" checked="checked">화
							<input type="radio" name="week" value="3">수
							<input type="radio" name="week" value="4">목
							<input type="radio" name="week" value="5">금
							<input type="radio" name="week" value="6">토
						<%}else if(vo.getWeek()==3) { %>
							<input type="radio" name="week" value="1">월
							<input type="radio" name="week" value="2">화
							<input type="radio" name="week" value="3" checked="checked">수
							<input type="radio" name="week" value="4">목
							<input type="radio" name="week" value="5">금
							<input type="radio" name="week" value="6">토
						<%}else if(vo.getWeek()==4) { %>
							<input type="radio" name="week" value="1">월
							<input type="radio" name="week" value="2">화
							<input type="radio" name="week" value="3">수
							<input type="radio" name="week" value="4" checked="checked">목
							<input type="radio" name="week" value="5">금
							<input type="radio" name="week" value="6">토
						<%}else if(vo.getWeek()==5) { %>
							<input type="radio" name="week" value="1">월
							<input type="radio" name="week" value="2">화
							<input type="radio" name="week" value="3">수
							<input type="radio" name="week" value="4">목
							<input type="radio" name="week" value="5" checked="checked">금
							<input type="radio" name="week" value="6">토
						<%}else if(vo.getWeek()==6) { %>
							<input type="radio" name="week" value="1">월
							<input type="radio" name="week" value="2">화
							<input type="radio" name="week" value="3">수
							<input type="radio" name="week" value="4">목
							<input type="radio" name="week" value="5">금
							<input type="radio" name="week" value="6" checked="checked">토
						<% } %>
						</td>
					</tr>
					<tr>
						<th>시작</th>
						<td><input type="text" name="start_hour" value=<%=vo.getStart_hour()%>></td>
					</tr>
					<tr>
						<th>종료</th>
						<td><input type="text" name="end_end" value=<%=vo.getEnd_end()%>></td>
					</tr>
				</table>
				<br>
				<input type="button" value="목록" onclick="location.href='index.jsp'">
				<input type="reset" value="취소">
				<input type="submit" value="완료">
			</form>
	</section>



	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>