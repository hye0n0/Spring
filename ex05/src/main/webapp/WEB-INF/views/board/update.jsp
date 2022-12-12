<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>글수정</h3>
		<form action="./update" method="post">
		글번호: <input name="bno" readonly="readonly" value="${board.bno}"><br>
		제목: <input name="title" value="${board.title}"><br>
		내용: <input name="content" value="${board.content}"><br>
		작성자: <input name="writer" value="${board.writer}"><br>
		<button>수정</button>
	</form>
</body>
</html>