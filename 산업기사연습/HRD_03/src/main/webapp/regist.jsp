<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.it.lecture.*, java.util.*"%>
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
		<h1>교과목 추가</h1>
			<form action="regist_impl.jsp">
				<table border="1">
					<tr>
						<th>교과목 코드</th>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>
						<th>과목명</th>
						<td><input type="text" name="c_name"></td>
					</tr>
					<tr>
						<th>담당강사</th>
						<td>
							<select name="t_name">
								<option selected="selected">담당강사선택</option>
								<% for(lectureVO vo : list) {
									if(vo.getIdx()==1) { %>
									<option value="1">김교수</option>
								<% }else if(vo.getIdx()==2) { %>								
									<option value="2">이교수</option>
								<% }else if(vo.getIdx()==3) { %>								
								<option value="3">박교수</option>
								<% }else if(vo.getIdx()==4) { %>								
								<option value="4">우교수</option>
								<% }else if(vo.getIdx()==5) { %>								
								<option value="5">최교수</option>
								<% }else if(vo.getIdx()==6) { %>								
								<option value="6">강교수</option>
								<% }else if(vo.getIdx()==7) { %>								
								<option value="7">황교수</option>
								<%	
									}
								}
								%>
							</select>
						</td>
					</tr>
					<tr>
						<th>학점</th>
						<td><input type="text" name="credit"></td>
					</tr>
					<tr>
						<th>요일</th>
						<td>
							<input type="radio" name="week" value="1">월
							<input type="radio" name="week" value="2">화
							<input type="radio" name="week" value="3">수
							<input type="radio" name="week" value="4">목
							<input type="radio" name="week" value="5">금
							<input type="radio" name="week" value="6">토
						</td>
					</tr>
					<tr>
						<th>시작</th>
						<td><input type="text" name="start_hour"></td>
					</tr>
					<tr>
						<th>종료</th>
						<td><input type="text" name="end_end"></td>
					</tr>
				</table>
				<br>
				<input type="button" value="목록" onclick="location.href='index.jsp'">
				<input type="submit" value="완료" >
			</form>
	</section>



	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>