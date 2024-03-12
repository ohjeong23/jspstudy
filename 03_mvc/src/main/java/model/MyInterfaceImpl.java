package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import common.ActionForward;
import jakarta.servlet.http.HttpServletRequest;

public class MyInterfaceImpl implements MyInterface {

  @Override
  public ActionForward getDate(HttpServletRequest request) {
    //난 내결과를 어디어디 제이에스피에서 보여주겠다. 반환하는 뷰의 이름 제이에스피 경로 이름을 반환하는 형태로 
    //포워드는 리퀘슽르를 가지고 반환하는  
    //데이트 자체는 리퀘스트에 저장 
    //그리고 어디어디 리퀘스트로 가자고 반환 하고 포워드 시켜버림 리퀘스트에 들어있는걸 가지고 전달 반환 정
    //포워드할때 경로 작성하는 방법 contextPath 제외하고 작성
    request.setAttribute("date", DateTimeFormatter.ofPattern("yyyy.MM.dd.").format(LocalDate.now()));      
    
    return new ActionForward("/view/date.jsp",false) ;// 경로를 반환 시켜줌 
// 리퀘스트에 저장된 정보는 포워드할때 전달된다
   // 리퀘스트 서블릿에 필요한 정보를 저장해놨다 포워드할때 응답으로 전달 
  }

  @Override
  public ActionForward getTime(HttpServletRequest request) {

    request.setAttribute("time", DateTimeFormatter.ofPattern("HH:mm:ss.SSS").format(LocalTime.now()));
    return new ActionForward("/view/time.jsp",false) ;
  }

  @Override
  public ActionForward getDateTime(HttpServletRequest request) {

    request.setAttribute("datetime", DateTimeFormatter.ofPattern("yyyy.MM.ss. HH:mm:ss.SSS").format(LocalDateTime.now()));
    
    return new ActionForward("/view/datetime.jsp",false) ;

   
  }

}
