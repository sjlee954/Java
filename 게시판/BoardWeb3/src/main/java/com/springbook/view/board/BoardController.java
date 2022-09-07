package com.springbook.view.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
@SessionAttributes("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/dataTransform.do")
	@ResponseBody
	public List<BoardVO> dataTransform(BoardVO vo) {
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardService.getBoardList(vo);
		return boardList;
	}
	
	//검색 조건 목록 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목","TITLE");
		conditionMap.put("내용","CONTENT");
		return conditionMap;
	}
	
	
//   글 등록
   @RequestMapping("/insertBoard.do")
   public String insertBoard(BoardVO vo) throws IOException {
//      boardDAO.insertBoard(vo);
	   MultipartFile uploadFile = vo.getUploadFile();
	   if(!uploadFile.isEmpty()) {
		   String fileName = uploadFile.getOriginalFilename();
		   uploadFile.transferTo(new File("c:/upload/"+fileName));
	   }
	   boardService.insertBoard(vo);
	   return "getBoardList.do";
   } //end of insertBoard

//   글 수정
   @RequestMapping("/updateBoard.do")
   public String updateBoard(@ModelAttribute("board")BoardVO vo) {
	   System.out.println("번호 : "+vo.getSeq());
	   System.out.println("제목 : "+vo.getTitle());
	   System.out.println("작성자 : "+vo.getWriter());
	   System.out.println("내용 : "+vo.getContent());
	   System.out.println("등록일 : "+vo.getRegDate());
	   System.out.println("조회수 : "+vo.getCnt());
//	   boardDAO.updateBoard(vo);
	   boardService.updateBoard(vo);
	   return "getBoardList.do";
   } //end of updateBoard
   
//   글 삭제
   @RequestMapping("/deleteBoard.do")
   public String deleteBoard(BoardVO vo) {
//      boardDAO.deleteBoard(vo);
	   boardService.deleteBoard(vo);
      return "getBoardList.do";
   } //end of deleteBoard
   
//   글 상세 조회
   @RequestMapping("/getBoard.do")
   public String getBoard(BoardVO vo, Model model) {
//      mav.addObject("board", boardDAO.getBoard(vo)); //Model 정보 저장
//      mav.setViewName("getBoard.jsp"); //View 정보 저장
//       model.addAttribute("board",boardDAO.getBoard(vo));
       model.addAttribute("board",boardService.getBoard(vo));
	   return "getBoard.jsp";
   } //end of getBoard
   
//   글 목록 검색
   @RequestMapping("/getBoardList.do")
   public String getBoardList(BoardVO vo, Model model) {
//      mav.addObject("boardList", boardDAO.getBoardList(vo)); //Model 정보 저장
//      mav.setViewName("getBoardList.jsp"); //View 정보 저장
	  
//	   System.out.println("검색 조건: "+ condition);
//	   System.out.println("검색 단어: "+ keyword);
//	   model.addAttribute("boardList", boardDAO.getBoardList(vo));
	   //model.addAttribute("boardList", boardService.getBoardList(vo));
	   //return "getBoardList.jsp";
	   
	   if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
	   if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
	   
	   model.addAttribute("boardList",boardService.getBoardList(vo));
	   return "getBoardList.jsp";
	   
	   
	   
   } //end of getBoardList
}