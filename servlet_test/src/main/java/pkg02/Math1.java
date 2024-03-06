package pkg02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;


public class Math1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	  Random random = new Random();
	  int num1 = random.nextInt(9) + 2;
	  int num2 = random.nextInt(9) + 1;
	  int result = num1 *num2;
	  
	  request.setAttribute("randomNumbers",num1+"*"+num2);
	  request.setAttribute("result", result);
    request.getRequestDispatcher("/random.jsp").forward(request, response);	  
	  
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
