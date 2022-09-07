<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.it.enroll.*"%>
<jsp:useBean id="dao" class="com.it.enroll.enrollDAO"></jsp:useBean>
<jsp:useBean id="vo" class="com.it.enroll.teacherVO">
	<jsp:setProperty property="*" name="vo"></jsp:setProperty>
</jsp:useBean>

<%
	request.setCharacterEncoding("utf-8");
	int rs = dao.teacher_update(vo);
	
	if(rs==1){
%>
				<script>
					alert("데이터가 수정되었습니다.")
					location.href="teacher.jsp";
				</script>
<%
	}else{
%>
				<script>
					alert("데이터 수정 실패")
					history.back();
				</script>
<%
			}
%>