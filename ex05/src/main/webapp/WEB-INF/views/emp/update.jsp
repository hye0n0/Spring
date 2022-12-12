<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>사원수정</h3>
		<form action="./update" method="post">
		employeeId: <input name="employeeId" readonly="readonly" value="${emp.employeeId}"><br>
		firstName: <input name="firstName" value="${emp.firstName}"><br>
		lastName: <input name="lastName" value="${emp.lastName}"><br>
		email: <input name="email" value="${emp.email}"><br>
		hireDate: <input type="date" name="hireDate" value="${emp.hireDate}"><br>
		jobId: <input name="jobId" value="${emp.jobId}"><br>
		<button>수정</button>
	</form>
</body>
</html>