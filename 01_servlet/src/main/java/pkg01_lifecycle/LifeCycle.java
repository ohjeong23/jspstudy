package pkg01_lifecycle;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
 * Servlet
 * 
 *  1. 웹 브라우저를 통해서 실행되는 Java 클래스이다.
 *  2. 클라이언트의 요청을 받는 Java 클래스이다.
 *  3. jakarta.servlet.http.Httpservlet 클래스를 상속 받는다.
 *     (Tomcat 이 지원하는 클래스이므로 Tomcat 이 없으면 실행할 수 없다.)
 *  4. 동일한 프로젝트(컨텍스트)에서는 동일한 이름의 Servlet이 존재할 수 없다.
 *     (Servlet이 저장되는 장소가 JSP/Servlet Container(톰캣)이기 때문이다.)
 */


/*
 * 실행 주소(URL)
 * 
 *  1. 형식
 *     protocol://host:port/contextPath/URLMapping
 *  2. contextPath
 *    1) 프로젝트 경로를 의미한다.
 *    2) 프로젝트를 생성할 때 결정한다.
 *    3) 프로젝트 속성(properties)에서 변경할 수 있다
 *      프로젝트 우클릭 - 속성 - WebProject settings
 *  3.URLMapping
 *     1) 프로젝트 내부 경로를 의미한다.
 *     2) Servlet을 생성할 때 결정한다.
 *     3) 변경 방법
 *        (1) @WebServlet Annotation
 *        (2) WEB-INF/web.xml 
 *        
 */

@WebServlet("/life")  /*http://localhost:8080/servlet/life 주소를 입력하면 현재 Servlet 이 실행된다.*/
public class LifeCycle extends HttpServlet {
  
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()w
     * 
     * 생성자
     * 1. Servlet 생성할 때 호출된다. 
     * 2. 생성자 호출 이후에는 자동으로 init()메소드가 호출된다.
     */
    public LifeCycle() {
        super();
        System.out.println("LifeCycle 생성자 호출");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 * 
	 * init()메소드
	 * 1.Servlet 환경 설정을 담당하는 메소드이다.
	 * 2.init()메소드 호출 뒤 자동으로 service() 메소드가 호출된다.
	 * 
	 */
	public void init(ServletConfig config) throws ServletException {
	  System.out.println("init()메소드 호출");
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * service(
	 * 1.클라이언트로부터 요청을 받을 수 있다.(매개변수 HttpServletRequest request)
	 * 2.클라이언트에게 응답할 수 있다..(매개변수 HttpServletResponse response)
	 * 3.service() 메소드가 있으면 여기서 요청과 응답을 해결한다.
	 * 4.service() 메소드가 없으면 doGet()또는doPost() 메소드가 요청에 따라 호출된다.
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service()메소드 호출");
    switch(request.getMethod()){ //요청 정보가 담긴 객체 리퀘스트 
      case "GET":
        doGet(request,response);
        break;
      case "POST":
        doPost(request,response);
        break;
    }
	}

	/** dopost에서 불러도 코드 작업은 doget에서 한다. 처리코드는 어차피 두겟에서만 한다.
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)\
	 * 
	 * doGet()
	 * 1. GET 방식의 요청이 발생하면 자동으로 호출되는 메소드이다. 
	 * 2. GET 방식의 요청
	 *   1)<a href ="http://8080/servlet/life">
	 *   2) <from method="GET" action ="servlet/life">
	 *   3)location.href='/servlet/life'
	 *   4)window.open('/servlet/life')
	 *   5) #$.ajax({
	 *   type:'GET'
	 *  ,url :'/servlet/life',
	 *  ...
	 * })
	 * 
	 * 
	 */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("doGet() 메소드 호출");
    response.getWriter().append("Served at: ").append(request.getContextPath());
  }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 *  doPost()
   * 1. POST 방식의 요청이 발생하면 자동으로 호출되는 메소드이다. 
   * 2. POST 방식의 요청
   *   
   *   1) <from method="POST" action ="servlet/life">
   *   5) #$.ajax({
   *   type:'POSt'
   *  ,url :'/servlet/life',
   *  ...
   * })
	 * 
	 */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("doPost() 메소드 호출");
    doGet(request, response);
  }

}