<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


 <%
   // 업로드 된 파일 목록을 가져오기 경로 //realpath 안씀 외부경로 잡아서 씀 
   String uploadPath = application.getRealPath("upload");
   File uploadDir = new File(uploadPath);
   File[] uploadFiles = uploadDir.listFiles();
   
   // 가장 최근에 업로드한 파일명 출력하기 session에 업로드 네임으로 되어있음
   out.println("<div>최근 업로드 파일명 :"+session.getAttribute("uploadName")+"</div>");
   
   //기록 저장 서버는 세션 클라리언트는 쿠키에 저장
   //결과 화면 만들기
   for (File uploadFile : uploadFiles) {
     out.println("<div>");
     out.println("<a href=\""+uploadFile.getPath()+"\">"+uploadFile.getName()+"</a>");
     out.println("</div>");
   }
 %>

<hr>
<div>
   <a href ="<%=request.getContextPath()%>/pkg02_builtin_object/write.jsp">작성화면</a> 

</div>


</body>                                                 
</html>