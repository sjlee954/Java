<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.it.lecture.*" %>
<jsp:useBean id="dao" class="com.it.lecture.lecturerDAO"></jsp:useBean>
<jsp:useBean id="vo" class="com.it.lecture.lectureVO">
	<jsp:setProperty property="*" name="vo" />
</jsp:useBean>
<% 
request.setCharacterEncoding("utf-8");
int idx = Integer.parseInt(request.getParameter("idx"));
int rs = dao.teacher_delete(idx);
 if(rs == 1) {
%>
	 <script>
	 	alert("삭제가 완료되었습니다.");
	 	location.href="index.jsp";
	 </script>
<% 
	}else { 
%>
	 <script>
	 	alert("삭제가 실패하였습니다.");
	 	history.back();
	 </script>
<% 
	} 
 %>