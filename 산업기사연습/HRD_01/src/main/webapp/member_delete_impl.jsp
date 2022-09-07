<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.it.enroll.*" %>
   <jsp:useBean id="dao" class="com.it.enroll.enrollDAO"/>
   <jsp:useBean id="vo" class="com.it.enroll.classVO">
    	<jsp:setProperty property="*" name="vo"/>
   </jsp:useBean>
<%
	request.setCharacterEncoding("utf-8");
	int member_seq = Integer.parseInt(request.getParameter("member_seq"));
	int result = dao.member_delete(member_seq);

	if(result==1){
%>
				<script>
					alert("데이터가 삭제되었습니다.")
					location.href="member.jsp";
				</script>
<%
			}else{
%>
				<script>
					alert("데이터 삭제 실패")
					history.back();
				</script>
<%
			}
%>
