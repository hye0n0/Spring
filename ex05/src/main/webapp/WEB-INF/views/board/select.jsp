<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
ul {
	list-style: none;
}
</style>
</head>
<body>
	<h3>사원조회</h3>
	<ul>
		<li>사번: ${emp.employeeId}
		<li>이름: ${emp.firstName} ${emp.lastName}
		<li>이메일: ${emp.email}
		<li>입사일자: ${emp.hireDate}
	</ul>
	<button id="updateBtn">사원수정페이지로 이동</button>
	<form name="frm" method="post" action="delete">
		<input type="hidden" name="id" value="${emp.employeeId}">
		<button id="deleteBtn">사원삭제</button>
	</form>
	<script type="text/javascript">
		updateBtn.addEventListener("click", ev=>{
			location.href='update?id=${emp.employeeId}'
		})
	</script>
</body>
</html>