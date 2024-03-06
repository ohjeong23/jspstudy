package pkg06_upload;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;

public class Ex1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String uploadPath = request.getServletContext().getRealPath("upload");
	File uploadDir = new File(uploadPath);
	if(!uploadDir.exists()) {
	  uploadDir.mkdirs();
	}
	String originalFilename = null;
	String filesystemName = null;
	
	Collection<Part> parts = request.getParts();
	for(JPart part : parts) {
	  if(part.getHeader("Content-Disposition").contains("filename")) {
	    if(part.getSize()>0) {
	      originalFilename=part.getSubmitttedFileName();
	      
	    }
	  }
    if(originalFilename!= null) {
      int point =originalFilename.lastIndexOf(".");
      String extName = originalFilename.substring(point);
      String fileName = originalFilename.substring(0,point);
      filesystemName = fileName+"_"
    }
	  
	  
	}
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
