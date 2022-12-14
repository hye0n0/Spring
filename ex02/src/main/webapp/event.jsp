<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>event.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
	
	// javascript
	window.addEventListener("load",function () {
		//버튼 클릭 : 텍스트필드 입력값 li태그 생성해서 추가
		btnadd.addEventListener("click", function(){
			li = document.createElement("li");
			li.innerHTML = inTxt.value;
			list.append(li);
		})

		//li 태그 클릭하면 배경색 변경 css('','')
		list.addEventListener("click", function(ev){
			//event.target == this
			if( event.target.nodeName == "LI") {
				event.target.style.backgroundColor ="aquamarine";
			}
		})
	})

	// jquery
	// $(function() {
	// 	//버튼 클릭 : 텍스트필드 입력값 li태그 생성해서 추가
	// 	$('#btnadd').on('click',function(){
	// 		$('#list').append($('<li>').text($('#inTxt').val()))
	// 	})

	// 	// 그룹이벤트 (위임)
	// 	//li 태그 클릭하면 배경색 변경 css('','')
	// 	$('ul').on('click', 'li',function(){
	// 		$(this).css('background-color','aquamarine')
	// 	})
	// })

</script>
<style>
</style>
</head>
<body>
<input id="inTxt"><button type="button" id="btnadd">등록</button>
<ul id="list">
	<li> 사과
	<li> 바나나
</ul>
</body>
</html>