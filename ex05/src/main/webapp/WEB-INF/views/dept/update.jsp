<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>부서수정</h3>
		<form action="./update" method="post">
		departmentId: <input name="departmentId" readonly="readonly" value="${dept.departmentId}"><br>
		departmentName: <input name="departmentName" value="${dept.departmentName}"><br>
		managerId: <input name="managerId" value="${dept.managerId}"><br>
		locationId: <input name="locationId" value="${dept.locationId}"><br>
		<button>수정</button>
	</form>
</body>
</html>