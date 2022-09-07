<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.enroll.*"%>
    <jsp:useBean id="dao" class="com.it.enroll.enrollDAO"/>
    <jsp:useBean id="vo" class="com.it.enroll.memberVO">
    	<jsp:setProperty property="*" name="vo"/>
    </jsp:useBean>
<%
	request.setCharacterEncoding("utf-8");

	int result = dao.member_update(vo);
	
	if(result==1){
%>
		<script>
			alert("데이터가 수정되었습니다.")
			location.href="member.jsp";
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