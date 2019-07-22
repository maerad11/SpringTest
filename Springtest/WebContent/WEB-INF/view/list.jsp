<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<div align="center">
	<h2>상품 목록</h2>
	</div>
	<c:forEach var="list" items="${list}">
		<div align="center">
			<img src="image/001_mNh15sB.jpg" width="100" height="100">
			<h3><a href="${pageContext.request.contextPath}/defauk">${list.name}</a></h3>
			<h3>${list.price} 원</h3>
		</div>
	</c:forEach>
