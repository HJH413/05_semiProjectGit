package com.javaclass.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.domain.BoardVO;
import com.javaclass.service.BoardService;

@Controller
@RequestMapping("/admin")
public class BoardController {

	@Autowired
	private BoardService boardService;

	// -------------------------------------------------
	// 게시글 작성
		@RequestMapping("/adminBoardRegister.do")
		public void registerBoard(){
		}
	
	// 게시글 저장
	@RequestMapping(value = "/adminBoardSave.do")
	public String insertBoard(BoardVO vo) throws IOException {
		boardService.adminInsertBoard(vo);
		return "redirect:adminBoardList.do";
	}

	// 게시글 목록 출력
	@RequestMapping("/adminBoardList.do")
	public void getBoardList(BoardVO vo, Model model) {
		// 뷰 페이지 지정 (1) ModelAndView (2) void (3) String
		// 뷰로 데이터 전송 (1) ModelAndView (2) /(3) Model
		model.addAttribute("admin_BoardList", boardService.adminGetBoardList(vo));
	}

	// 게시글 상세 조회
	@RequestMapping("/adminBoardChange.do")
	public void getBoard(BoardVO vo, Model m) {
		m.addAttribute("admin_Board", boardService.adminGetBoard(vo));
	}

	// 게시글 삭제
	@RequestMapping("/adminBoardDelete.do")
	public String deleteBoard(BoardVO vo) {
		boardService.adminDeleteBoard(vo);
		return "redirect:adminBoardList.do";
	}

	// 게글 수정
	@RequestMapping("/adminBoardUpdate.do")
	public String updateBoard(BoardVO vo) {
		boardService.adminUpdateBoard(vo);
		return "redirect:adminBoardList.do";
	}
	// -------------------------------------------------

}
