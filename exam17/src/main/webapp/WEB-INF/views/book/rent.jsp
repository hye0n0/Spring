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
	<h3>도서별 대여매출현황</h3>

	<table border="1">
		<tr>
			<th>도서번호</th>
			<th>도서명</th>
			<th>대여총계</th>
			<th>대여횟수</th>
		</tr>
		<c:forEach items="${rents }" var="rent">
			<tr>
				<td>${rent.bookNo}</td>
				<td>${rent.bookName}</td>
				<td>${rent.rentSum}</td>
				<td>${rent.bookCount}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>