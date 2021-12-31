<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	request.setCharacterEncoding("UTF-8");
    %>
    <jsp:useBean id="login" class="labhw11.LoginBean" scope="page"/>
    <jsp:setProperty name="login" property="*"/>
    
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>LAB11_2</title>
<style>
	div {text-align: center;}
</style>
</head>
<body>
	<div>
		<h2>등록내용</h2>
		이름 : <jsp:getProperty name="login" property="id"/><P>
		패스워드 : <jsp:getProperty name="login" property="pw"/><P>
		이메일 : <jsp:getProperty name="login" property="email"/><P>
		성별 : <jsp:getProperty name="login" property="gender"/><P>
		생일 : <jsp:getProperty name="login" property="birth"/>
		<HR>
		<%
			if(login.isGrownUp()){
				if(login.getGender().equals("0")){
					out.print(login.getId() + "씨는 남성이고,");
				}else{
					out.print(login.getId() + "씨는 여성이고,");
				}
				
				out.println("성인입니다.");				
			}
			else{
				if(login.getGender().equals("0")){
					out.print(login.getId() + "씨는 남성이고,");
				}else{
					out.print(login.getId() + "씨는 여성이고,");
				}
				out.println(" 성인이 아닙니다.");
			}
		%>
	</div>
</body>
</html>