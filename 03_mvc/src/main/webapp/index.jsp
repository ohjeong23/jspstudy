<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

<div class="wrap">
  <select id="type">
    <option value="date">현재날짜</option>
    <option value="time">현재시간</option>
    <option value="datetime">현재날짜와 시간</option>
  </select>
  <button id="btn" type="button">요청</button>
</div>

<script src="${contextPath}/assets/js/index.js"> //문자열 상수 처리 되어있음 별로 안좋음 변수처리로 바꿈 contextPath(/mvc) 경로는 webapp를 의미한다.
  
</script>


</body>
</html>