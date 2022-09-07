package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  request.setCharacterEncoding("utf-8");
		  
		  String name = request.getParameter("name"); 
		  String pass = request.getParameter("pass"); 
		  String email = request.getParameter("email");
		  String title = request.getParameter("title"); 
		  String content = request.getParameter("content");
		  
		  BoardVO bVo = new BoardVO(); 
		  bVo.setName(name); 
		  bVo.setPass(pass);
		  bVo.setEmail(email); 
		  bVo.setTitle(title); 
		  bVo.setContent(content);
		  
		  BoardDAO bDao = BoardDAO.getInstance(); 
		  bDao.insertBoard(bVo);
		 
		  //DB저장 후 후속조치 ->게시물 리스트 화면으로 이동시킨다.
		  new BoardListAction().execute(request, response);
	}

}
