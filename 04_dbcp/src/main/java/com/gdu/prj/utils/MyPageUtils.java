package com.gdu.prj.utils;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class MyPageUtils {
  
  
  private int total;   // 전체 게시글 개수                      (DB에서 구한다.)
  private int display; // 한 페이지에 표시할 게시글 개수        (요청 파라미터로 받는다.) 디스플레이는 파라미터로 요청 파라미터로 받아 세팅
  private int page;    // 현재 페이지                           (요청 파라미터로 받는다.)
  private int begin;   // 한 페이지에 표시할 게시글의 시작 번호 (계산한다.)
  private int end;     // 한 페이지에 표시할 게시글의 종료 번호 (계산한다.)
  
  private int pagePerBlock= 10; // 한 블록에 표시할 페이지 링크의 개수(임의로 결정)
  private int totalPage;        //전체 페이지 객수  (계산한다)
  private int beginPage;        //한 블록에 표시할 페이지 링크의 시작 번호(계산한다.)
  private int endPage;          // 한 블록에 표시할 페이지 링크의 종료 번호(계산한다.)
  
  
  
  public void setPaging(int total, int display, int page) {
    
    this.total = total;
    this.display = display;
    this.page = page;   //번호가 게시글의 절대적인 위치가 아니여서 보드 번호를 쓰면 안됨 
    //row num으로 계산 게시글 번호(board no)가 아니라 행 번호로 1~20   
    begin = (page - 1) * display +1;
    end   = begin + display - 1; // 
    //1002 까지 있는데 페이지 51번째에 1001 1020 정확하게 계산하려면 end 값 보정
    
    totalPage = (int)Math.ceil((double) total / display) ;
    beginPage = ((page - 1) / pagePerBlock) * pagePerBlock + 1;    
    endPage   = Math.min(totalPage, beginPage + pagePerBlock - 1); 
    
    
    
    
    
  }
  public String getPaging(String requestURI, String sort, int display) {
    
    StringBuilder builder = new StringBuilder();
    
    
    // <
    if(beginPage == 1) {
      builder.append("<div class=\"dont-click\">&lt;</div>");
    } else { 
      builder.append("<div><a href=\"" + requestURI + "?page=" + (beginPage - 1) + "&sort=" + sort + "&display=" + display + "\">&lt;</a></div>");
    }
      
    // 1 2 3 4 5 6 7 8 9 10
    for(int p = beginPage; p <= endPage; p++) {
      if(p == page) {
        builder.append("<div><a class=\"current-page\" href=\"" + requestURI + "?page=" + p + "&sort=" + sort + "&display=" + display + "\">" + p + "</a></div>");
      } else {
        builder.append("<div><a href=\"" + requestURI + "?page=" + p + "&sort=" + sort + "&display=" + display + "\">" + p + "</a></div>");
      }
    }
    // > end page = total page 일때 안눌림
    
    if(endPage == totalPage) {
      builder.append("<div class=\"dont-click\">&gt;</div>");
    } else {
      builder.append("<div><a href=\"" + requestURI + "?page=" + (endPage + 1) + "&sort=" + sort + "&display=" + display + "\">&gt;</a></div>");
    }
    
    return builder.toString();
    
  }
  
}