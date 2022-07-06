package com.it.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.dao.memberDAO;
import com.it.dto.memberVO;

@WebServlet("/movieList.do")
public class movieListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		memberDAO mDao = memberDAO.getInstance();
		
		List<memberVO> movieList = mDao.selectAllMovie();
		request.setAttribute("movieList", movieList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("movie/movieList.jsp");
		
		dispatcher.forward(request, response);
		
	}
}
