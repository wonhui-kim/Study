<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- LAB8_2_1: POST 방식으로 전달 
	1. 주소창 표시 내용: 폴더와 파일 이름 외에는 보이지 않는다.
	2. 아이디에 한글 입력: 깨져서 보이는 경우 <% request.setCharacterEncoding("UTF-8"); %>를 추가해준다.
	3. 패스워드에 한글 입력: 한글로 입력해도 영어로 출력된다. -->
	
	<!-- LAB8_2_2: GET 방식으로 전달
	1. 주소창 표시 내용: 파라미터 이름과 값이 모두 주소창에 노출된다.
	2. 아이디에 한글 입력: 위와 동일
	3. 패스워드에 한글 입력: 위와 동일 -->
	
	<!-- LAB8_2_3: FORM 태그에서 method 속성을 지정하지 않고 전달
	GET 방식이 default로 사용된다. 주소창에 파라미터 이름과 값이 노출되었다. -->
</body>
</html>