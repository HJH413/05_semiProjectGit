package com.javaclass.service;

import java.util.List;

import com.javaclass.domain.BoardVO;

public interface BoardService {

	// 글 등록
	void adminInsertBoard(BoardVO vo);

	// 글 수정
	void adminUpdateBoard(BoardVO vo);

	// 글 삭제
	void adminDeleteBoard(BoardVO vo);

	// 글 상세 조회
	BoardVO adminGetBoard(BoardVO vo);

	// 글 목록 조회
	List<BoardVO> adminGetBoardList(BoardVO vo);

}
