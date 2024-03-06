<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate, java.time.LocalTime" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
fucntion showAlert(){
 
	if(id == date){
		alert(currentDate);
	}
	else if(id == time){
		alert(currentTime);
	}
	
}
</script>


</head>
<body>
<form onsubmit="showAlert()">
    <div>
    <label for="selec"></label>
    
        <select id="selec">
        <option id = date>현재날짜</option>
        <option id = time>현재시간</option>
        </select>
    </div>     
    <button type="submit">요청하기</button>
</form>
</body>
</html>
