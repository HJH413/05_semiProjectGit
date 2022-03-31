package com.javaclass.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public void getBoard(String board_Seq, Model m) {
		m.addAttribute("admin_Board", boardService.adminGetBoard(board_Seq));
	}
	
	// 게시글 삭제
//	@RequestMapping("/adminBoardDelete.do")
//	public String deleteBoard(BoardVO vo) {
//		boardService.adminDeleteBoard(vo);
//		return "redirect:adminBoardList.do";
//	}
	
	// 게시글 수정
    @RequestMapping("/adminBoardUpdate.do")
    public String updateBoard(@ModelAttribute BoardVO vo, Model model, String board_Seq){
        // 비밀번호 체크
        boolean result = boardService.checkBoard(vo.getBoard_Seq(), vo.getBoard_Password());
        if(result){ // 비밀번호가 일치하면 수정 처리후, 전체 회원 목록으로 리다이렉트
        	boardService.adminUpdateBoard(vo);
            return "redirect:adminBoardList.do";
        } else { // 비밀번호가 일치하지 않는다면, div에 불일치 문구 출력, viwe.jsp로 포워드
            // 가입일자, 수정일자 저장
        	model.addAttribute("message", "비밀번호 불일치");
            model.addAttribute("admin_Board", boardService.adminGetBoard(board_Seq));
            return "redirect:adminBoardChange.do?board_Seq="+board_Seq;
        }    
    }
    // 게시글 삭제
    // @RequestMapping : url mapping
    // @RequestParam : get or post방식으로 전달된 변수값
    @RequestMapping("/adminBoardDelete.do")
    public String deleteBoard(@ModelAttribute BoardVO vo, Model model, String board_Seq){
        // 비밀번호 체크
        boolean result = boardService.checkBoard(vo.getBoard_Seq(), vo.getBoard_Password());
        if(result){ // 비밀번호가 맞다면 삭제 처리후, 전체 회원 목록으로 리다이렉트
        	boardService.adminDeleteBoard(vo);
            return "redirect:adminBoardList.do";
        } else { // 비밀번호가 일치하지 않는다면, div에 불일치 문구 출력, viwe.jsp로 포워드
        	model.addAttribute("message", "비밀번호 불일치");
            model.addAttribute("admin_Board", boardService.adminGetBoard(board_Seq));
            return "redirect:adminBoardChange.do?board_Seq="+board_Seq;
        }
    }
    
}
