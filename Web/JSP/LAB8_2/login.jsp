<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이클래스 로그인</title>
<style>
	div { text-align: center; }
	table { margin: auto;}
	select { 
		width: 90px; 
		height: 20px;
		font-size: 15px;
	}
</style>
</head>
<body>
	<div>
		<img src="images/dd_main.PNG"/>
		<h2>로그인</h2>
		<hr>
		<form action="result.jsp">
			<table>
				<tr>
					<td rowspan="5"><img src="images/dd_login.PNG"/></td>
					<td>회원님의 아이디와 비밀번호를 정확히 입력하세요.</td>
				</tr>
				<tr>
					<td>
						<select name="type">
							<option selected value="학부생">학부생</option>
							<option value="대학원생">대학원생</option>
							<option value="교직원">교직원</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>아이디&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="strID"></td>
				</tr>
				<tr>
					<td>비밀번호&nbsp;&nbsp;&nbsp;<input type="password" name="strPwd"></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="로그인">
						<input type="reset" value="가입하기">
					</td>
				</tr>
			</table>
		</form>
		
		
	</div>
</body>
</html>