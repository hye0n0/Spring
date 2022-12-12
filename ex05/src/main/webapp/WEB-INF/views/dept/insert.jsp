<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>부서등록</h3>
	<form action="./insert" method="post">
		departmentName: <input name="email"><br>
		managerId: <select name="managerId">
			<c:forEach items="${managers}" var="manager">
				<option value="${manager.employeeId }">${manager.firstName} ${manager.lastName}</option>
			</c:forEach>
		</select><br>
		<button>등록</button>
	</form>
</body>
</html>