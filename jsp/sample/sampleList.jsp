<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${sampleList}" var="list">
		${list.nttNo}<br/>
		${list.nttSj}<br/>
		${list.useAt}<br/>
		${list.nttCn}<br/>
		${list.frstRegistPnttm}<br/>
	</c:forEach>
	<br/>
	<a href="sampleRegist.do">게시글 작성</a>
</body>
</html>

