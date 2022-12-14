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
	<h3>도서등록</h3>
	<form action="./insert" method="post">
		<table>
			<tr>
				<td>도서번호</td>
				<td><input name="bookNo" value="${bookNo}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>도서명</td>
				<td><input name="bookName"></td>
			</tr>
			<tr>
				<td>도서표지</td>
				<td><input name="bookCoverimg"></td>
			</tr>
			<tr>
				<td>출판일자</td>
				<td><input name="bookDate"></td>
			</tr>
			<tr>
				<td>금액</td>
				<td><input name="bookPrice"></td>
			</tr>
			<tr>
				<td>출판사</td>
				<td><input name="bookPublisher"></td>
			</tr>
			<tr>
				<td>도서소개</td>
				<td><textarea name="bookInfo"></textarea></td>
			</tr>
		</table>
		<input type="button" value="등록" id="bookInsert">
		<input type="button" value="조회" id="bookList">
	</form>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script type="text/javascript">
		let path = '${pageContext.request.contextPath }';
		let result = '${result}'
		
		if(result != ""){
			alert(result);
		}
		
		$("#bookList").on("click",function(){
			location.href=path + "/book/list"
		})
		
		$("#bookInsert").on("click",function(){
			console.log($("input[name=bookName]").val())
			if(!$("input[name=bookName]").val()){
				alert("도서명을 입력해주세요");
				$("input[name=bookName]").focus
			}else{
				$('form').submit();
			}
		})
	</script>
</body>
</html>