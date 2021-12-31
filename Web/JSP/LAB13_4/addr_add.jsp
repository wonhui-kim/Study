<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="lab13.*"%>
<!DOCTYPE html>
	<% request.setCharacterEncoding("UTF-8");%>
	
	<jsp:useBean id="addr" class="lab13.AddrBean"/>
	<jsp:setProperty name="addr" property="*"/>
	<jsp:useBean id="am" class="lab13.AddrManager" scope="application"/>
	
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<%
		am.add(addr);
	%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>LAB13_4 : addr_add.jsp</title>
	<style>
		div {text-align: center;}

	</style>
</head>
<body>
	<div>
	<h2>등록내용</h2>
	이름 : ${addr.username}<P>
	전화번호 : ${addr.tel}<P>
	이메일 : ${addr.email}<P>
	성별 : ${addr.sex}<P>
	그룹 : ${addr.group}
	<HR>
	
	<c:url value="addr_list.jsp" var="target1"/>
	<c:url value="addr_list_group.jsp" var="target2"/>
	<a href="${target1}">전체 목록 보기</a>
	<a href="${target2}">그룹별 목록 보기</a>
</div>
</body>
</html>










