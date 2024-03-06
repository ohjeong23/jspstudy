package pkg01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


public class Id_admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
    request.setCharacterEncoding("UTF-8");
    //2.요청 파라미터
    // 1)name 속성이 파라미터이다.
    // 2) 동일한 name 속성을 가진 입력 요소들은 다음과 같이 처리한다.
    //    (1) type="radio": 변수 처리한다.
    //    (2) 이외의 경우 : 배열 처리한다.
    String name = request.getParameter("id");
    if(name.isEmpty()) {
      
    }
    
    String id = request.getParameter("아이디:"+"id");
    String password = request.getParameter("비밀번호:"+"password");
    String email = request.getParameter("이름:"+"name");
    String email = request.getParameter("생년월일:"+"");
    String email = request.getParameter("성별:"+"id");
    String email = request.getParameter("이메일:"+"id");
    String email = request.getParameter("휴대전화:"+"id");
    
    String email = request.getParameter("email");
    String gender = request.getParameter("gender");
    String[] hobbies = request.getParameterValues("hobbies");
    String[] mobile = request.getParameterValues("mobile");
    
    System.out.println(name); // 빈 문자열
    System.out.println(email); //빈 문자열
    System.out.println(gender); //선택이 없으면 전달이 안되니 null
    System.out.println(Arrays.toString(hobbies));// null
    System.out.println(Arrays.toString(mobile));//빈 문자열
    
	  
	  

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
