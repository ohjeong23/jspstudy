<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

  <%--
    jsp로 시작하는 태그 -> jsp action 태그
    <jsp:include> 액션 태그
    내용이 변하는 동적 페이지를 포함할 때 사용한다.(파라미터 전달이 가능하다.) 
  
   --%>
   <jsp:include page="header.jsp">
     <jsp:param value="메인1" name="title"/>
   </jsp:include>
  
  
  <h1>main1</h1>
  
  <%--
  <%@ include %> 지시어
  내용이 변하지 않는 정적 페이지를 포함할 때 사용한다.
  같은 폴더에 있으면 그냥 파일 이름만 써도 된다.
  상대경로 필요없이
  get context path 
  
   --%>
  <%@ include file="footer.jsp" %>
 