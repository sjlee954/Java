<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, javax.sql.*"%>
<%
   request.setCharacterEncoding("utf-8");
   Connection conn = null;
   PreparedStatement pstmt = null;
   ResultSet rs = null;
   String custno = request.getParameter("custno");
   String url = "jdbc:oracle:thin:@localhost:1521:xe";
   String id = "system";
   String pwd = "1234";
   String sql = "select  D.custno, D.custname, D.grade, sum(price) from MONEY_TBL_02 N , MEMBER_TBL_02 D where N.custno = D.custno group by D.CUSTNO, D.custname, D.grade order by custno";
   String grade = "";
   try{
      Class.forName("oracle.jdbc.driver.OracleDriver");
      conn = DriverManager.getConnection(url,id,pwd);
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css.css"/>
</head>
<body>

   <%@ include file="header.jsp" %>
   
   <section>
        <h3>회원매출조회</h3>
       
       <table border="1" style="margin-left: auto; margin-right: auto; width: 800px">
               <tr>
                   <th>회원번호</th>
                   <th>회원성명</th>
                   <th>고객등급</th>
                   <th>매출</th>
               </tr>
       <%
      while(rs.next()){
         if(rs.getString(3).equals("A")) grade = "VIP";
         else if(rs.getString(3).equals("B")) grade = "일반";
             
      
      %>
               <tr>
                   <td><%=rs.getString(1) %><br></td>
                   <td><%=rs.getString(2) %></td>
                   <td><%=grade %></td>
                   <td><%=rs.getString(4) %></td>
               </tr>
      <%
       }
      %>   
           </table>
   </section>
    
     <%@ include file="footer.jsp" %>
</body>
</html>
<%      
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if( rs != null) rs.close();
         if( pstmt != null) pstmt.close();
         if( conn != null) conn.close();
      }catch(Exception e){
         e.printStackTrace();
      }
   }
%>