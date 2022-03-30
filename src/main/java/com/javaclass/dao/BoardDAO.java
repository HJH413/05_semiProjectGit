package com.javaclass.dao;

import java.util.List;

import com.javaclass.domain.BoardVO;


public interface BoardDAO {
	
	//----------------------------------------------------
	
	public void adminInsertBoard(BoardVO vo);

	public void adminUpdateBoard(BoardVO vo);

	public void adminDeleteBoard(BoardVO vo);

	public BoardVO adminGetBoard(BoardVO vo);

	public List<BoardVO> adminGetBoardList(BoardVO vo);
}	

