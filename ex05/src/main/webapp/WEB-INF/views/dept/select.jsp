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
	<h3>부서조회</h3>
	<ul>
		<li>departmentId: ${dept.departmentId}
		<li>departmentName: ${dept.departmentName}
		<li>managerId: ${dept.managerId}
		<li>locationId: ${dept.locationId}
	</ul>
	<button id="updateBtn">사원수정페이지로 이동</button>
	<form name="frm" method="post" action="delete">
		<input type="hidden" name="id" value="${dept.departmentId}">
		<button id="deleteBtn">사원삭제</button>
	</form>
	<script type="text/javascript">
		updateBtn.addEventListener("click", ev=>{
			location.href='update?id=${dept.departmentId}'
		})
	</script>
</body>
</html>