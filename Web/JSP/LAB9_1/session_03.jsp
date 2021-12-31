<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session_03.jsp</title>
</head>
<body>
<%
	long lastAccessedTime = session.getLastAccessedTime();
	long creationTime = session.getCreationTime();
	
	long t = (lastAccessedTime - creationTime)/1000;
%>
	세션이 생성된 후 <%=t %>초가 지났습니다.
</body>
</html>