<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="ch07.*"%>
<!DOCTYPE html>
	<% request.setCharacterEncoding("UTF-8");%>
	
	<jsp:useBean id="addr" class="ch07.AddrBean"/>
	<jsp:setProperty name="addr" property="*"/>
	<jsp:useBean id="am" class="ch07.AddrManager" scope="application"/>
	
	<%
		am.add(addr);
	%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>ch07 : addr_add.jsp</title>
	<style>
		div {text-align: center;}

	</style>
</head>
<body>
	<div>
	<h2>등록내용</h2>
	이름 : <jsp:getProperty name="addr" property="username"/><P>
	전화번호 : <jsp:getProperty name="addr" property="tel"/><P>
	이메일 : <%=addr.getEmail() %> <P>
	성별 : <%=addr.getSex() %> <P>
	그룹 : <jsp:getProperty  name="addr" property="group"/>
	<HR>
	<a href="addr_list.jsp">전체 목록 보기</a>
	<a href="addr_list_group.jsp">그룹별 목록 보기</a>
</div>
</body>
</html>










