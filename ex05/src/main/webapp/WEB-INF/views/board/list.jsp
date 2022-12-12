<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function name() {
		let result = '${result}';
		if (result != "") {
			$(".modal-body").html(result)
			$('#exampleModal').modal('show')
		}
	})
</script>
</head>
<body>
	결과: ${result }
	<h3>부서목록</h3>

	<a href="./insert">부서등록으로 이동</a>
	<table>
		<tr>
			<th>사번1</th>
			<th>사번2</th>
			<th>이름</th>
		</tr>
		<c:forEach items="${emps }" var="emp">
			<tr>
				<td><a href="select?id=${emp.employeeId}">${emp.employeeId}</a></td>
				<td><a
					href="${pageContext.request.contextPath }/emp/select?id=${emp.employeeId}">${emp.employeeId}</a></td>
				<td>${emp.firstName}${emp.lastName}</td>
			</tr>
		</c:forEach>
	</table>

	<!-- Button trigger modal -->
	<button type="button" class="btn btn-primary" data-toggle="modal"
		data-target="#exampleModal">Launch demo modal</button>

	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">...</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>