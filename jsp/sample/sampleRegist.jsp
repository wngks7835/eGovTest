<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	글작성 하는 곳 
	
	<form id="regist" name="regist" action="sampleInsert.do" method="post">
	
		<table>
			<tbody>
				<tr>
					<td>제목 : </td>
					<td><input id="nttSj" name="nttSj" type="text"></td>
				<tr>
					<td>내용 : </td>
					<td><textarea id="nttCn" name="nttCn"></textarea></td>
				</tr>
			</tbody>
		</table>
		<button type="submit">전송</button>
	</form>
</body>
</html>