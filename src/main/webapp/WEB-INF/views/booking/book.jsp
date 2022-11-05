<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
<form action="/room/book/booking" method="post">
<img src="${map.roomDTO.thumbnail_path}" width=300><br>
방이름 : ${map.roomDTO.name }<br>
결제금액 : ${map.roomDTO.price }<br>
상세 : ${map.roomDTO.description }<br>
이름 : <input type="text" name="name"><br>
연락처 : <input type="text" name="tel"><br>
입실일 : <input type="text" name="str_date_in" value='${map.year}-${map.month}-${map.date}'><br>
퇴실일 : <input type="text" name="str_date_out" value="${map.year}-${map.month}-${map.date+1}"><br>
예약인원 : <input type="text" name="head_count"><br>

메모 : <textarea cols=30 rows=5 name="memo"></textarea><br>
<input type="hidden" name="room_id" value="${map.roomDTO.room_id }">
<input type="submit" value="예약하기">
</form>
</div>


</body>
</html>