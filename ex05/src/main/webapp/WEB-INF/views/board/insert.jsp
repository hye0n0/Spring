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
	<h3>글등록</h3>
	<form action="./insert" method="post">
		title: <input name="title"><br> 
		content: <input name="content"><br> 
		writer: <input name="writer"><br>
		<button>등록</button>
	</form>
</body>
</html>