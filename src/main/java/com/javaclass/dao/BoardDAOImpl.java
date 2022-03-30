package com.javaclass.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaclass.domain.BoardVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	// ----------------------------------------------------------------------
	@Override
	public void adminInsertBoard(BoardVO vo) {
		System.out.println("===> Mybatis adminInsertBoard() 호출");
		mybatis.insert("BoardDAO.adminInsertBoard", vo);

	}

	@Override
	public void adminUpdateBoard(BoardVO vo) {
		System.out.println("===> Mybatis adminInsertBoard() 호출");
		mybatis.insert("BoardDAO.adminUpdateBoard", vo);

	}

	@Override
	public void adminDeleteBoard(BoardVO vo) {
		System.out.println("===> Mybatis adminInsertBoard() 호출");
		mybatis.insert("BoardDAO.adminDeleteBoard", vo);

	}

	@Override
	public BoardVO adminGetBoard(BoardVO vo) {
		System.out.println("===> Mybatis adminGetBoard() 호출");
		return (BoardVO) mybatis.selectOne("BoardDAO.adminGetBoard", vo);
	}

	@Override
	public List<BoardVO> adminGetBoardList(BoardVO vo) {
		System.out.println("===> Mybatis getBoardList() 호출");
		return mybatis.selectList("BoardDAO.adminGetBoardList", vo);
	}

}
