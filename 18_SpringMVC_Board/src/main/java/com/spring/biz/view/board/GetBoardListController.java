package com.spring.biz.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.spring.biz.board.BoardVO;
import com.spring.biz.board.impl.BoardDAO;

public class GetBoardListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(">> 게시글 목록 보여주기");
		//1. 게시글 목록 조회(SELECT)
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> list = boardDAO.getBoardList();
				
		//2. 검색 결과 데이터를 세션에 저장
		//request.getSession().setAttribute("boardList", list);
		
		//3. 목록 화면 이동
		//response.sendRedirect("getBoardList.jsp");
		
		//return "getBoardList";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", list); // Model에 데이터 저장
		mav.setViewName("getBoardList.jsp"); // View 명칭 저장
		
		return mav;
	}
	
	
}
