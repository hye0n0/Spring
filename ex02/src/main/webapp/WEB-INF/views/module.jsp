<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	
	//즉시실행함수
    (function test(greet){
        console.log(greet)
    })('hello');

    var replyService = function() {
        return { name: 'AAAA'}
    }
})
</script>
</head>
<body>

</body>
</html>