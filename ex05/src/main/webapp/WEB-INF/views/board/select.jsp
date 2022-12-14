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
<script type="text/javascript">
	let path = '${pageContext.request.contextPath }';
	let bno = '${board.bno}';
	$(function name() {
		updateBoard();
		replyList();
		replyInsert();
		replyDelete();
		
		// 글수정으로 이동
		function updateBoard() {
			updateBtn.addEventListener("click", ev=>{
			location.href='update?"bno"=${board.bno}'
			})
		}
		
		//댓글 목록
		function replyList() {
			$.ajax({
				url : path+'/replys/' + bno
			}).then(res => {
				for( reply of res) {
					$("tbody").append(makeTr(reply));		
				}
			})
		}
		
		//댓글 등록
		function replyInsert() {
			$("#btnInsert").on("click", function() {
				let reply = $('[name="reply"]').val();
				let replyer = $('[name="replyer"]').val();
				$.ajax({
					url: path+'/replys',
					method: "post",
					data: {bno,reply,replyer},
					dataType: 'json'
				}).then(res => {
					alert("등록완료")
					$("tbody").append(makeTr(res));
				})
			})
		}
		
		//댓글 삭제
		function replyDelete() {
			$("tbody").on("click", "#btnDelete", function(){
				let rno = $(this).closest("tr").data("id")
				let tr = $(this).closest("tr")
				$.ajax({
					url: path+'/replys/'+ rno,
					method: "delete"
				}).then(res => {
					alert("삭제완료")
					tr.remove();
				})
				
			})
		}
		
		function makeTr(reply){
			let tag = `<tr data-id="\${reply.rno}">
								<td>\${reply.rno}</td>
								<td>\${reply.reply}</td>
								<td>\${reply.replyer}</td>
								<td>\${reply.replyDate}</td>
								<td>\${reply.updateDate}</td>
								<td><button type="button" id="btnDelete">삭제</button></td>
								<td><button type="button" id="btnSelect">조회</button></td>
							</tr>`
			return tag;
		}
		
	})
		
		
</script>
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
		<input type="hidden" name="bno" value="${board.bno}">
		<button id="deleteBtn">글삭제</button>
	</form>
	<div class="container">
		<form id="form1" class="form-horizontal">
			<h2>댓글</h2>
			<div class="form-group">
				<label>내용:</label>
				<textarea class="form-control" name="reply"></textarea>
			</div>
			<div class="form-group">
				<label>작성자:</label> <input type="text" class="form-control"
					name="replyer">
			</div>
			<div class="btn-group">
				<input type="button" class="btn btn-primary" value="등록"
					id="btnInsert" /> <input type="button" class="btn btn-primary"
					value="수정" id="btnUpdate" /> <input type="button"
					class="btn btn-primary" value="초기화" id="btnInit" />
			</div>
		</form>
	</div>
	<hr />
	<div class="container">
		<h2>댓글 목록</h2>
		<table class="table text-center">
			<thead>
				<tr>
					<th class="text-center">NO.</th>
					<th class="text-center">내용</th>
					<th class="text-center">작성자</th>
					<th class="text-center">등록일자</th>
					<th class="text-center">수정일자</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>
</body>
</html>