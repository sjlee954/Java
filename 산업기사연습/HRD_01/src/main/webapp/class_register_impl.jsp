<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.enroll.classVO"%>
<jsp:useBean id="dao" class="com.it.enroll.enrollDAO"/>    
<jsp:useBean id="vo" class="com.it.enroll.classVO">
	<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>    
<%
	request.setCharacterEncoding("utf-8");
	int rs = dao.class_register(vo);
	
	if(rs==1) {
%>
	<script>
		alert("등록이 완료 되었습니다.");
		location.href="class.jsp";
	</script>
<% 
	}else {
%>
	<script>
		alert("등록이 실패 하였습니다.");
		location.href="class_register.jsp";
	</script>
<%
	}
%>