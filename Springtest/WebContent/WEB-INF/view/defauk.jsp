<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach var="list" items="${list}">
	<div align="center">
		<h2>${list.name}</h2>
	</div>
</c:forEach>
<img src="/image/001_mNh15sB.jpg">
<c:forEach var="list" items="${list}">
	<div align="center">
		<h3>${list.type}</h3>
		<h3>${list.name}</h3>
		<h3>${list.price}원</h3>
	</div>
</c:forEach>