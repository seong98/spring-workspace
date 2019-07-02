<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>모든 부서정보</h1>
	
	<div>
		<ul>
		<c:forEach var="dept" items="${department }">
			<li><a href="employees.do?deptid=${dept.deptId }">${dept.deptName }</a></li>
		</c:forEach>
		</ul>
	</div>
	<p><a href="form.do">사원등록</a></p>
</body>
</html>