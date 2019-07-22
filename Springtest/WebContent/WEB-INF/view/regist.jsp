<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fieldset>
	<form action="regist" method="post">
		<input type="radio" name="type" value="keyboard">키보드
		<input type="radio" name="type" value="mouse">마우스
		<br><br>
		<input type="text" name="name" placeholder="상품 이름 입력" required>
		<br><br>
		<input type="number" name="price" placeholder="상품 가격 입력" required>
		<br><br>
		<input type="submit" value="등록">
	</form>

</fieldset>

</body>
</html>