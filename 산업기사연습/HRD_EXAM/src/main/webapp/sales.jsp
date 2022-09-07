<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.shop.*"%>
    <jsp:useBean id="dao" class="com.it.shop.memberDAO"></jsp:useBean>
    
<%
	
	// 데이터베이스로 부터 데이터를 읽어 온다
	List<memberVO> price = dao.memberSalse(); 
	 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
	<section>
	<h3>회원매출조회</h3>
  		<table border="1">
  			<tr>
  				<th>회원번호</th>
  				<th>회원성명</th>
  				<th>고객등급</th>
  				<th>매출</th>
  			</tr>
  			 <%
               for(memberVO vo : price){
            %>
            <tr>
               <td class="text-center" ><%=vo.getCustno() %></td>
               <td class="text-center" ><%=vo.getCustname()%></td>
               <td class="text-center" ><%=vo.getGrade()%></td>
               <td class="text-center" ><%=vo.getPrice()%></td>
            </tr>
            <%      
               }
            %>
  		</table>
	 	
	</section>
	
<%@ include file="footer.jsp" %>
</body>
</html>