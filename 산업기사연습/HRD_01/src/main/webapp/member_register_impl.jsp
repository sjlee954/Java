<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.it.enroll.*" %>
<jsp:useBean id="dao" class="com.it.enroll.enrollDAO"></jsp:useBean>
<jsp:useBean id="vo" class="com.it.enroll.memberVO">
	<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>
<%	
	request.setCharacterEncoding("utf-8");
	int rs = dao.member_register(vo);
	if(rs==1) {
%>
			<script>
				alert("등록이 완료 되었습니다.");
				location.href="member.jsp";
			</script>
<% 
			}else {
%>
			<script>
				alert("등록이 실패 하였습니다.");
				location.href="member_register.jsp";
			</script>
<%
			}
%>
