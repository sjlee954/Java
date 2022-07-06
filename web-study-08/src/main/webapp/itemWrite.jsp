<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%!
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String uid = "scott";
	String pass = "tiger";
	String sql = "select * from item";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1"> 
		<tr>
			<td>이름</td><td>가격</td><td>설명</td>
		</tr>
<%
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,uid,pass);
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			out.println("<tr>");
			out.println("<td>" + rs.getString("name")+ "</td>");
			out.println("<td>" + rs.getInt("price") + "</td>");
			out.println("<td>" + rs.getString("decription") + "</td>");
			out.println("</tr>");
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try{
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
%>
	</table>
</body>
</html>