<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="/WEB-INF/template/header.jsp"></jsp:include>
	<div class="d-flex container justify-content-center align-items-center"
		style="background-color: lightgray; height: 500px">
		<form class="w-50" action="loginuser.shop" method="post">
			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text">ID</span>
				</div>
				<input type="text" class="form-control" placeholder="id" name="id" id="id">
			</div>
			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text">PASSWORD</span>
				</div>
				<input type="password" class="form-control" placeholder="password" name="pwd" id="pwd">
			</div>
			
			<div class="input-group mt-3 float-right">
				<input type="submit" class="btn btn-dark mr-3" value="로그인">
				<input type="button" class="btn btn-danger mr-3" value="취소">
			</div>
			
		</form>
	</div>
	<jsp:include page="/WEB-INF/template/footer.jsp"></jsp:include>
</body>
</html>