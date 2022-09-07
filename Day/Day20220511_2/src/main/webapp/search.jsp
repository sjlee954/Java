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
	section table {margin:0 auto; margin-top:20px; width : 800px; height:300px;}
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
		<p>회원목록조회/수정</p>
		<table border="2">
			<tr>
				<td>회원번호</td>
				<td>회원성명</td>
				<td>전화번호</td>
				<td>주소</td>
				<td>가입일자</td>
				<td>고객등급</td>
				<td>거주지역</td>
			</tr>
			<tr>
				<td>1</td>
				<td>이수정</td>
				<td>010-1111-2222</td>
				<td>서울 동대문구 휘경동</td>
				<td>2022-05-24</td>
				<td>VIP</td>
				<td>01</td>
			</tr>
			<tr>
				<td>2</td>
				<td>이축복</td>
				<td>010-2222-3333</td>
				<td>서울 동대문구 휘경동</td>
				<td>2022-03-12</td>
				<td>일반</td>
				<td>01</td>
			</tr>
			<tr>
				<td>3</td>
				<td>정믿음</td>
				<td>010-3333-4444</td>
				<td>울릉군 울릉읍 독도1리</td>
				<td>2022-07-08</td>
				<td>일반</td>
				<td>01</td>
			</tr>
			<tr>
				<td>4</td>
				<td>최사랑</td>
				<td>010-4444-5555</td>
				<td>울릉군 울릉읍 독도2리</td>
				<td>2022-01-01</td>
				<td>VIP</td>
				<td>30</td>
			</tr>
			<tr>
				<td>5</td>
				<td>진평화</td>
				<td>010-5555-6666</td>
				<td>제주도 제주시 외나무골</td>
				<td>2022-09-15</td>
				<td>일반</td>
				<td>60</td>
			</tr>
			<tr>
				<td>6</td>
				<td>차공단</td>
				<td>010-6666-7777</td>
				<td>제주도 제주시 외나무골</td>
				<td>2022-12-25</td>
				<td>60</td>
				<td></td>
			</tr>
		</table>
		
	</section>
	<footer>이수정 배고파 홈런볼 커스타드맛</footer>


</body>
</html>