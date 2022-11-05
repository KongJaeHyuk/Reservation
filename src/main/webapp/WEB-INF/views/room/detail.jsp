<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객실 추가 | 민수네 리조트</title>
<script src="/room/resources/js/room/datail.js"></script>
</head>
<body>
<div id="addForm">
	객실명 : <input type="text" id="name" value="${roomDTO.name }"><br>
	금액 : <input type="text" id="price" value="${roomDTO.price }"><br>
	상세 : <input type="text" id="description" value="${roomDTO.description }"><br>
	썸네일 : <input type="text" id="thumbnail_path" value="${roomDTO.thumbnail_path }"><br>
	기본인원 : <input type="text" id="default_head" value="${roomDTO.default_head }"><br>
	<hr>
	<input type="button" id="btn_update" value="수정" data-room_id="${roomDTO.room_id }">
</div>
</body>
</html>