package com.javaclass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaclass.dao.BoardDAOImpl;
import com.javaclass.domain.BoardVO;



@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAOImpl boardDAO;

	public void adminInsertBoard(BoardVO vo) {
		boardDAO.adminInsertBoard(vo);
	}

	public void adminUpdateBoard(BoardVO vo) {
		boardDAO.adminUpdateBoard(vo);
	}

	public void adminDeleteBoard(BoardVO vo) {
		boardDAO.adminDeleteBoard(vo);
	}

	public BoardVO adminGetBoard(String board_Seq) {
		return boardDAO.adminGetBoard(board_Seq);
	}

	public List<BoardVO> adminGetBoardList(BoardVO vo) {
		return boardDAO.adminGetBoardList(vo);
	}
	
    public boolean checkBoard(String board_Seq, String board_Password) {
        return boardDAO.checkBoard(board_Seq, board_Password);
    }
}
