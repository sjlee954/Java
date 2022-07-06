package unit06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ParamServlet2")
public class ParamServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		int A = Integer.parseInt(request.getParameter("A"));
		int B = Integer.parseInt(request.getParameter("B")); 		

		PrintWriter out = response.getWriter();
		
		out.println("덧셈 = "+ (A+B));
		out.println("<br>");
		out.println("곱셈 = " + (A*B));
		out.println("<br>");
		out.println("뺄셈 = " + (A-B));
		out.println("<br>");
		out.println("나눗셈 = " + (double)(A/B));
	
	}

}
