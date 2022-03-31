package com.javaclass.dao;

import java.util.List;

import com.javaclass.domain.BoardVO;


public interface BoardDAO {
	
	//----------------------------------------------------
	
	public void adminInsertBoard(BoardVO vo);

	public void adminUpdateBoard(BoardVO vo);

	public void adminDeleteBoard(BoardVO vo);

	public BoardVO adminGetBoard(String board_Seq);

	public List<BoardVO> adminGetBoardList(BoardVO vo);
	
	public boolean checkBoard(String board_Seq, String board_Password);
}	

