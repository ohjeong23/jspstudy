package pkg07_Cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;


public class Ex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   Cookie[] cookies = request.getCookies();
	   
	   response.setContentType("text/html; charset=UTF-8");
	   PrintWriter out = response.getWriter();
	   
	   if(cookies != null) {
	     String cookieName = null;
	     String cookieValue = null;
	     String cookiePath = null;
	     int cookieExpire = 0;
	     for(Cookie cookie : cookies) {
	       cookieName = cookie.getName();
	       cookieValue = URLDecoder.decode(cookie.getValue(),"UTF-8");
	       cookiePath = cookie.getPath(); 
	       cookieExpire = cookie.getMaxAge();
	       out.println("<div>쿠키이름 : "+cookieName +"</div>");
	       out.println("<div><button type=\"button\" class=\"btn-delete\"data-cookie-name=\""+cookieName+"\">삭제</button></div>");
	       
	       
	       
	       
	    request.setCharacterEncoding("UTF-8");
	    String cookieName = request.getParameter("cookieName");
	    Cookie cookie = new Cookie(cookieName,"");
	    cookie.setMaxAge(0);
	    response.addCookie(cookie);
	    
	       
	    
	       
	       
	     }
	   }
	   
	  
	  
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
