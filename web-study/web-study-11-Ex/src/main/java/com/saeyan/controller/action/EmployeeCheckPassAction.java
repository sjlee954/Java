package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.EmployeeDAO;
import com.saeyan.dto.EmployeeVO;

public class EmployeeCheckPassAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url =null;
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		EmployeeDAO eDao = EmployeeDAO.getInstance();
		EmployeeVO eVo = eDao.selectOneEmployeeByID(id);
		
		if(eVo.getPass().equals(pass)) {
			url = "employee/success.jsp";
		}else {
			url = "employee/employeeCheckPass.jsp";
			request.setAttribute("message", "비밀번호가 틀렸습니다.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
