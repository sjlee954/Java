package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdditionServlet01")
public class AdditionServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = 20;
		int num2 = 10;
		int add = num1+num2;
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Addition</title></head>");
		out.println("<bobdy>");
		out.println(num1+"+"+num2+"="+add);
		out.println("</bobdy>");
		out.println("</html>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
