<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
  request.setCharacterEncoding("UTf-8");
  String title = request.getParameter("title");
%>
<title><%=title%></title>
<!-- custom css 
 header,body,footer css  
 헤더 
 내용이 안바뀔수도
 캐시 메모리에 저장해두고 그걸 불러다 쓰는 방식
 주소가 안바껴서 같은 파일이겠지라고 생각해서 안바뀌는 오류가 생길수도
 
 실행 할 때 마다 주소 바뀌는 법 ?를 붙이기 파라미터 붙이기 -->

<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/header.css?dt=<%=System.currentTimeMillis()%>">
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/body.css?dt=<%=System.currentTimeMillis()%>">
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/footer.css?dt=<%=System.currentTimeMillis()%>">
<link 

</head>
<body>


<div class="header-wrap">
  <div>
    <a href="<%=request.getContextPath() %>/pkg03_include/main1.jsp">main1</a>
    <a href="<%=request.getContextPath() %>/pkg03_include/main2.jsp">main2</a>
  </div>
</div>

<div class="body-wrap">