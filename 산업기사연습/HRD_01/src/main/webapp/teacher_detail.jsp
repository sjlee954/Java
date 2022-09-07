<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.enroll.*,java.util.*"%>
 <jsp:useBean id="dao" class="com.it.enroll.enrollDAO"></jsp:useBean>
<%
	int teacher_seq = Integer.parseInt(request.getParameter("teacher_seq"));
	List<teacherVO> list = dao.teacher_detail(teacher_seq);
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
		<form action="teacher_register_impl.jsp">
			 <table border="1">
         <tr>
            <th>과정명</th>
            <th>캠퍼스명</th>
            <th>교사명</th>
            <th>배정금액</th>
         </tr>      
      <%
         for(teacherVO vo : list){
      %>
         <tr>
            <td><%=vo.getClass_name() %></td>
            <td><%=vo.getClass_area() %></td>
            <td><%=vo.getTeacher_name() %></td>
            <td><%=vo.getClass_price() %></td>
         </tr>      
      <%
         }
      %>
         <tr>
            <td colspan="4">
               <input type="button" value="목록" onclick="location.href='teacher.jsp'">
            </td>
         </tr>      
      </table>

		</form>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>