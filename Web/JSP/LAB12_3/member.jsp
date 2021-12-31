<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>
	table {
		margin: auto; 
		border: 1px solid;
		width: 500px;
		font-size: 15px;
	}
	th { 
		background-color: lightgray; 
		border-bottom: 1px solid gray;
		border-right: 1px solid gray;
	}
	td { border-bottom: 1px solid gray; }
</style>
</head>
<body>
	<img src="images/dd_main.PNG">
	<form method="post" action="LAB12_3.jsp">
		<table>
			<tr>
				<th colspan=2>회원가입</th>
			</tr>
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" name="id">
					<input type="button" value="중복확인" onclick="alert('사용가능한 아이디입니다')" required>
				</td>
			</tr>
			<tr>
				<th>패스워드</th>
				<td>
					<input type="password" name="pw">
				</td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<input type="radio" name="gender" value=0>남
					<input type="radio" name="gender" value=1 checked>여
				</td>
			</tr>
			<tr>
				<th>국적</th>
				<td>
					<input type="text" value="대한민국">
					<input type="button" value="국적변경" onclick="alert('국적변경이 불가합니다')" required>
				</td>
			</tr>
			<tr>
				<th>휴대폰</th>
				<td>
					<select id="tel" name="phone1">
						<option selected value="0">010
						<option value="1">080</option>
						<option value="2">070</option>
						<option value="3">02</option>
					</select>
					-
					<input type="text" name="phone2" maxlength=4 size=3 value="">
					-
					<input type="text" name="phone3" maxlength=4 size=3 value="">
				</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>
					<input type="email" name="email" size=40>
				</td>
			</tr>
			<tr>
				<th>생일</th>
				<td>
					<input type="date" name="birth">
				</td>
			</tr>
			<tr>
				<th>관심분야</th>
				<td>
					<input type="checkbox" name="hobby" value="0">뉴스
					<input type="checkbox" name="hobby" value="1" checked>맛집
					<input type="checkbox" name="hobby" value="2">책
					<input type="checkbox" name="hobby" value="3">영화
					<input type="checkbox" name="hobby" value="4">여행
				</td>
			</tr>
			<tr>
				<th>가입인사</th>
				<td>
					<textarea name="greeting" rows=5 cols=30>회원들에게 간단한 가입인사를 남겨주세요</textarea>
				</td>
			</tr>
			<tr>
				<th>증명사진</th>
				<td>
					<input type="file">
				</td>
			</tr>
			<tr>
				<th colspan=2>
					<input type="submit" value="가입하기">
					<input type="reset" value="다시작성">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>