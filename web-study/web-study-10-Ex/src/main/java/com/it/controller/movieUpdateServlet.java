package com.it.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.dao.memberDAO;
import com.it.dto.memberVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/movieUpdate.do")
public class movieUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int code = Integer.parseInt(request.getParameter("code"));
		
		memberDAO mDao = memberDAO.getInstance();
		memberVO mVo = mDao.selectMovieBycode(code);
		
		request.setAttribute("movie", mVo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("movie/movieUpdate.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		ServletContext context = getServletContext();
		String path = context.getRealPath("movie");
		String encType = "utf-8";
		int sizeLimit = 20*1024*1024;
		
		MultipartRequest multi = new MultipartRequest(request, path, sizeLimit, encType, new DefaultFileRenamePolicy());
		
		int code = Integer.parseInt(multi.getParameter("code"));
		String title = multi.getParameter("title");
		int price = Integer.parseInt(multi.getParameter("price"));
		String director = multi.getParameter("director");
		String actor = multi.getParameter("actor");
		String poster = multi.getFilesystemName("poster");
		String synopsis = multi.getParameter("synopsis");
		if(poster == null) {
			poster = multi.getParameter("nonmakeImg");
		}
		memberVO mVo = new memberVO();
		mVo.setCode(code);
		mVo.setTitle(title);
		mVo.setPrice(price);
		mVo.setDirector(director);
		mVo.setActor(actor);
		mVo.setPoster(poster);
		mVo.setSynopsis(synopsis);
		
		memberDAO mDao = memberDAO.getInstance();
		mDao.updateMovie(mVo);
		
		response.sendRedirect("movieList.do");
		
		
	}

}
