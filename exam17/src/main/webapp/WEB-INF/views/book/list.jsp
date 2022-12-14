<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>도서 조회/수정</h3>

	<table border="1">
		<tr>
			<th>도서번호</th>
			<th>도서명</th>
			<th>도서표지</th>
			<th>출판일자</th>
			<th>금액</th>
			<th>출판사</th>
			<th>도서소개</th>
		</tr>
		<c:forEach items="${books }" var="book">
			<tr>
				<td>${book.bookNo}</td>
				<td>${book.bookName}</td>
				<td>${book.bookCoverimg}</td>
				<fmt:parseDate value="${book.bookDate}" var="dateValue" pattern="yyyy-MM-dd"/>
				<td><fmt:formatDate value="${dateValue}" pattern="yyyy/MM/dd"/></td>
				<td><fmt:formatNumber value="${book.bookPrice}" pattern="#,###"/> </td>
				<td>${book.bookPublisher}</td>
				<td>${book.bookInfo}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>