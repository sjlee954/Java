<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.enroll.*,java.util.*"%>
    <jsp:useBean id="dao" class="com.it.enroll.enrollDAO"></jsp:useBean>
<%
	List<memberVO> list = dao.memberList();
	
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
		<table border="1">
			<tr>
				<th>순번</th><th>수강생명</th><th>전화번호</th><th>주소</th><th>과정코드<th>수정/삭제</th>
			</tr>
			<%for(memberVO vo : list) { %>
			<tr>
				<td class="text-center">
					<a href="member_detail.jsp?member_seq=<%=vo.getMember_seq()%>"><%=vo.getMember_seq()%></a>
				</td>
				<td><%=vo.getC_name()%></td>
				<td><%=vo.getPhone()%></td>
				<td><%=vo.getAddress()%></td>
				<td><%=vo.getC_no()%></td>
				<td><a href="member_update.jsp?member_seq=<%=vo.getMember_seq()%>">수정</a>　　<a href="member_delete_impl.jsp?member_seq=<%=vo.getMember_seq()%>">삭제</a></td>
			</tr>
			<% } %>
			<tr>
				<td colspan="6"><a href="member_register.jsp">등록</a></td>
			</tr>
		</table>
	</section>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>