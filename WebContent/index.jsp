<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>메인페이지</title>
</head>
<body>
<jsp:include page="/WEB-INF/template/header.jsp"></jsp:include>
<div class = "container" style="background-color: lightgray; height: 500px">컨텐츠부분</div>
<c:if test="${not empty userInfo }">
	<div>${userInfo.userid }</div>
</c:if>
<jsp:include page="/WEB-INF/template/footer.jsp"></jsp:include>
</body>
</html>