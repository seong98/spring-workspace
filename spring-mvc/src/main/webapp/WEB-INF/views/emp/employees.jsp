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

	<h1>사원 목록</h1>
	
	<div>
		<ul>
		<c:forEach var="emp" items="${employee }">
			<li><a href="employee.do?empid=${emp.empId }">${emp.firstName} ${emp.lastName }</a></li>
		</c:forEach>
		</ul>
	</div>
</body>
</html>