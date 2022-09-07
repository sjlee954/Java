package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.EmployeeDAO;
import com.saeyan.dto.EmployeeVO;

public class EmployeeViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/employee/employeeView.jsp";
		
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		
		EmployeeDAO eDao = EmployeeDAO.getInstance();
		EmployeeVO eVo = eDao.selectOneEmployeeByID(id);

		request.setAttribute("employee", eVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
