<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="movie" class="com.mission.javabeans.MovieBean"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1 {text-align: center;}
table {margin : 0 auto; width: 500px; height: 400px;}
header div {background-color: #C8C8FF;}
table { margin}
table tr td : first-child {text-align: center; background-color: #D5C2EE;}
</style>
</head>
<body>
<header><div><h1>정보 등록</h1></div></header>

<form action="movieWrite.jsp">
	<table>
		<tr>
			<td>제목</td> 
			<td><input type="text" name="title"></td>
		</tr>
		<tr>
			<td>가격</td> 
			<td><input type="text" name="price">원</td>
		</tr>
		<tr>
			<td>감독</td> 
			<td><input type="text" name="director"></td>
		</tr>
		<tr>
			<td>출연배우</td> 
			<td><input type="text" name="actor"></td>
		</tr>
		<tr>
			<td>시놉시스</td> 
			<td><textarea name="synopsis" rows="5" cols="40"></textarea></td>
		</tr>
		<tr>
			<td>장르</td> 
			<td colspan="2">
				<select name="genre">
					<option value="로맨스" <%movie.setGenre("로맨스"); %> selected="selected">로맨스</option>
					<option value="스릴러"<%movie.setGenre("스릴러"); %>>스릴러</option>
					<option value="미스터리"<%movie.setGenre("미스터리"); %>>미스터리</option>
					<option value="액션"<%movie.setGenre("액션"); %>>액션</option>
					<option value="코미디"<%movie.setGenre("코미디"); %>>코미디</option>
					<option value="애니메이션"<%movie.setGenre("애니메이션"); %>>애니메이션</option>
				</select>
			&nbsp;&nbsp;&nbsp;<input type="submit" value="확인">  <input type="reset" value="취소">
			</td>
		</tr>
	</table>
</form>
</body>
</html>