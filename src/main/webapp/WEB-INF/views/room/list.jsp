<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객실 목록 | 민수네 리조트</title>
<script src="/room/resources/js/room/add.js"></script>
</head>
<table border=1>
	<thead>
		<tr>
			<th>썸네일</th>
			<th>객실명</th>
			<th>금액</th>
			<th>상세</th>
			<th>기본인원</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="dto" items="${list}">
		<tr>
			<td><img src='${dto.thumbnail_path }' width=200></td>
			<td><a href="/room/room/detail.view?room_id=${dto.room_id }">${dto.name }</a></td>
			<td>${dto.price }</td>
			<td>${dto.description }</td>
			<td>${dto.default_head }</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

</body>
</html>