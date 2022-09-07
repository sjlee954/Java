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
		<h1>강사 추가</h1>
			<form action="teacher_regist_impl.jsp">
				<table border="1">
					<tr>
						<th>강사번호</th>
						<td><input type="text" name="idx"></td>
					</tr>
					<tr>
						<th>강사명</th>
						<td><input type="text" name="t_name"></td>
					</tr>
					<tr>
						<th>전공</th>
						<td><input type="text" name="major"></td>
					</tr>
					<tr>
						<th>연구분야</th>
						<td><input type="text" name="field"></td>
					</tr>
				</table>
				<br>
				<input type="button" value="목록" onclick="location.href='teacher.jsp'">
				<input type="submit" value="완료" >
			</form>
	</section>



	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>