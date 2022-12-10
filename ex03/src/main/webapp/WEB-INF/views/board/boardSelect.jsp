<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="table table-striped table-hover">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일자</th>
		</tr>
		<c:forEach items="${boards}" var="board">
		<tr>
			<td>${board.bno}</td>
			<td>${board.title}</td>
			<td>${board.writer}</td>
			<td>${board.regdate}</td>
		</tr>
		</c:forEach>
	</table>
	<my:paging paging="${paging}" jsFunc="gopage"></my:paging>
</body>
</html>