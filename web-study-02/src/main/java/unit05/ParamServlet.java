package unit05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		String id = request.getParameter("id");
//		String age = request.getParameter("age"); //null값 받아옴.
		
		int age = Integer.parseInt(request.getParameter("age")); 
		//나이를 입력안하면 null값이 날라오는데 null값은 Integer.parseInt메소드를 쓸 수 없어서 에러남.
		
		PrintWriter out = response.getWriter();
		out.print("<html><bofy>");
		out.println("당신이 입력한 정보입니다.<br>");
		out.println("id = " );
		out.println(id);
		out.println("<br>age: " );
		out.println(age);
		out.println("<br><a href = 'javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		out.close();
	}

}
