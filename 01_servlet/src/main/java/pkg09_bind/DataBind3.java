package pkg09_bind;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class DataBind3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	  /*
     * 데이터 저장 영역
     * 
     *  1. ServletContext      : 컨텍스트 종료(애플리케이션 실행 종료) 전까지 데이터를 유지한다.
     *  2. HttpSession         : 세션 종료(웹 브라우저 종료) 전까지 데이터를 유지한다.
     *  3. HttpServletRequest  : 요청 종료(응답) 전까지 데이터를 유지한다. 젤 많이 씀
     */
    /*
     * 데이터 처리 메소드
     * 1. setAttribute(속성, 값) : Object 타입의 값을 저장한다.
     * 2. getAttribute(속성)     : Object 타입의 값을 반환한다.(캐스팅이 필요할 수 있다.)
     * 3. removeAttribute(속성)  : 제거한다.
     */
    
    //HttpServletRequest에 데이터 저장하기
    request.setAttribute("c", "일반데이터");    
    
    //데이터 확인 페이지로 이동하기                
    //response.sendRedirect("/servlet/dataConfirm"); //응답이 끝난거라 안되고 밑에 리퀘스트로 해야함
    request.getRequestDispatcher("/dataConfirm").forward(request,response); //이제 데이터 컨펌가능 일반데이터 
    //포워드는 요청 하나 요청했을때 해주는거고 이동방법은 
    //포워드 데이터ㅣ를 리퀘스트에 저장을해서 셀렉트 결괄ㄹ 가지고 다른 페이지로 전달을할때 리퀘스트의 데이터를 셀렉트 결과로 저장시키고 ㅣ포워드하게되면 해당 데이터가 원하는 페이지로 잘 전달됨 
    //포워드 리퀘스트 리스판스로 전달하면 하나도 전달안됨 저장시켜봤자임
    //포워드 데이터는 리퀘스트에 담아서 셋에트리뷰트 형태로 저장해서 이동하는것 기본 
    //리퀘스트에 저장시키고 포워드로 이동 리퀘스트에 저장하고 포워드하는것 리퀘스트의 정보를 유지해서 전달함 에트리뷰트값을 확인할 수 있음
    //세션 로그인 구현 세션을 쓰고 저장시키고 넘기면 됨 리퀘스트하고 세션 두개 공부
    //리퀘스트 써서 데이터 저장하고나서 포워드로 이동
    //쿠키 세션 1회용데이터 리퀘스트, 공동 데이터 세션서버,  클라이언트쿠키 
    //1번 저장하면 끝나는 70~80프로 리퀘스트
    //데이터  
    
    
    
    
    //redirect 는 여러개
	  
    
    
    
    
	  
	  
	  
	  
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
