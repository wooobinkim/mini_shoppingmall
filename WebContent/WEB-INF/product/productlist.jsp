<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<title>상품 리스트</title>
</head>
<body>
	<jsp:include page="/WEB-INF/template/header.jsp"></jsp:include>
	<div class = "container" style="background-color: lightgray; height: 500px">
		<div class = "container">
			<form>
				<table class="table table-hover" style="text-align: center;">
					<thead style="font-weight: bold;">
						<tr >
							<td>선택</td>
							<td>상품번호</td>
							<td>상품이름</td>
							<td>상품가격</td>
							<td>상품재고</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list }" var="item">
						<tr>
							<td><input type="checkbox" name="prdcheck"></td>
							<td>${item.prdid }</td>
							<td>${item.prdname }</td>
							<td>${item.prdprice }</td>
							<td>${item.prdstack }</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				<input type="submit" value="구매" style="float: right;">
			</form>
		</div>
	</div>
	<jsp:include page="/WEB-INF/template/footer.jsp"></jsp:include>
</body>
</html>