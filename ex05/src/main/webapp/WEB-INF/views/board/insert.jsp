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
	<h3>사원등록</h3>
	<form action="./insert" method="post">
		firstName: <input name="firstName"><br> lastName: <input
			name="lastName"><br> email: <input name="email"><br>
		hireDate: <input type="date" name="hireDate"><br>
		<!-- 참조키 : select, radio, checkbox -->
		jobId: <select name="jobId">
			<c:forEach items="${jobs}" var="job">
				<option value="${job.jobId }">${job.jobTitle}</option>
			</c:forEach>
		</select><br>
		<button>등록</button>
	</form>
</body>
</html>