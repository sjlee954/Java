<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{margin:0; padding:0;}
	ul,li{list-style:none;}
	a{text-decoration:none; color: #fff;}
	
	header {height:150px; background-color: coral; text-align:center; font-size:40px; color: #fff; line-height:150px; }
	nav {height:60px; background-color: pink; line-height:60px;}
	nav ul li{float: left; margin: 0 50px 0 10px; color: white;}
	section {height: 750px; background-color: darksalmon; }
	section p {text-align:center; padding-top :20px;}
	section table {margin:0 auto; margin-top:20px; width : 500px; height:200px; text-align: center;}
	footer {height:60px; background:coral; line-height:60px; color: #fff; text-align:center;}
</style>

</head>
<body>
	<header>쇼핑몰 회원관리 ver 1.0</header>
	<nav>
		<ul>
			<li><a href="submit.jsp">회원등록</a></li>
			<li><a href="search.jsp">회원목록 조회/수정</a></li>
			<li><a href="VIP.jsp">회원매출조회</a></li>
			<li><a href="home.jsp">홈으로</a></li>
		</ul>
	</nav>
	<section>
		<p>회원매출조회</p>
		<table border="2">
			<tr>
				<td>회원번호</td>
				<td>회원성명</td>
				<td>고객등급</td>
				<td>매출</td>
			</tr>
			<tr>
				<td>1</td>
				<td>이수정</td>
				<td>VIP</td>
				<td>8000</td>
			</tr>
			<tr>
				<td>2</td>
				<td>이축복</td>
				<td>일반</td>
				<td>4900</td>
			</tr>
			<tr>
				<td>3</td>
				<td>정믿음</td>
				<td>일반</td>
				<td>3000</td>
			</tr>
			<tr>
				<td>4</td>
				<td>최사랑</td>
				<td>VIP</td>
				<td>2500</td>
			</tr>
		</table>
		
	</section>
	<footer>이수정 배고파 홈런볼 커스타드맛</footer>


</body>
</html>