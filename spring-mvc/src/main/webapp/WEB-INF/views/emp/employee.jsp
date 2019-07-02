<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<p>EMPLOYEE ID : <span>${employee.empId }</span></p>
		<p>FIRST NAME : <span>${employee.firstName }</span></p>
		<p>LAST NAME : <span>${employee.lastName }</span></p>
		<p>EMAIL : <span>${employee.email }</span></p>
		<p>PHONE : <span>${employee.phone }</span></p>
		<p>HIRE_DATE : <span>${employee.hireDate }</span></p>
		<p>JOB ID : <span>${employee.jobId }</span></p>
		<p>SALARY : <span>${employee.salary }</span></p>
		<p>COMMISSION PCT : <span>${employee.commission }</span></p>
		<p>MANAGER ID : <span>${employee.managerId }</span></p>
		<p>DEPARTMENT ID : <span>${employee.deptId }</span></p>
	</div>
</body>
</html>