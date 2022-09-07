<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.it.lecture.*" %>
<jsp:useBean id="dao" class="com.it.lecture.lecturerDAO"></jsp:useBean>
<jsp:useBean id="vo" class="com.it.lecture.lectureVO">
	<jsp:setProperty property="*" name="vo" />
</jsp:useBean>

<%

 request.setCharacterEncoding("utf-8");
 int rs = dao.teacher_regist(vo);
 
 if(rs == 1) {
%>
	 <script>
	 	alert("등록이 완료되었습니다.");
	 	location.href="teacher.jsp";
	 </script>
<% 
	}else { 
%>
	 <script>
	 	alert("등록이 실패하였습니다.");
	 	location.href="regist.jsp";
	 </script>
<% 
	} 
 %>


