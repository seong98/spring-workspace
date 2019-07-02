<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 등록 폼</h1>
	<form method="post" action="add.do">
		<p>성: <input type="text" name="firstName"/></p>
		<p>이름: <input type="text" name="lastName"/></p>
		<p>이메일: <input type="text" name="email"/></p>
		<p>전화번호: <input type="text" name="phone"/></p>
		<p>급여: <input type="text" name="salary"/></p>
		<p><button type="submit">등록</button></p>
	</form>
</body>
</html>