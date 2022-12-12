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
	<h3>글조회</h3>
	<ul>
		<li>글번호: ${board.bno}
		<li>제목: ${board.title}
		<li>내용: ${board.content}
		<li>작성자: ${board.writer}
		<li>작성일자: ${board.regdate}
		<li>수정일자: ${board.updatedate}
	</ul>
	<button id="updateBtn">글수정페이지로 이동</button>
	<form name="frm" method="post" action="delete">
		<input type="hidden" name="id" value="${board.bno}">
		<button id="deleteBtn">글삭제</button>
	</form>
	<script type="text/javascript">
		updateBtn.addEventListener("click", ev=>{
			location.href='update?id=${board.bno}'
		})
	</script>
</body>
</html>