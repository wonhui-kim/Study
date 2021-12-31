<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>ch07 : 주소록</title>
	<style>
		div {text-align: center;}
		table{
			margin: 0px auto;
		}
		table, td {
			border:1px solid gray;
			border-collapse: collapse;
		}
	</style>
</head>
<body>
	<div>
	<h2>주소록 등록</h2>
	<hr>
	<form name=form1 method="post" action=addr_add.jsp>
		<table>
			<tr>
				<td>이 름</td>
				<td><input type=text size=20 name=username></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type=text size=20 name=tel></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type=text size=20 name=email></td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
				<select name=sex >
					<option selected>남</option>
					<option>여</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>그룹</td>
				<td>
					<select name=group>
						<option selected>가족</option>
						<option>친구</option>
						<option>직장</option>
					</select>
				</td>
			</tr>
			<tr><td colspan=2 align=center>
				<input type=submit value="확인">
				<input type=reset value="취소"></td></tr>	
		</table>
	
	</form>
</div>
</BODY>
</HTML>