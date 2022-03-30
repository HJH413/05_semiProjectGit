package com.javaclass.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaclass.domain.AccountVO;

@Repository("accountDAOImpl")
public class AccountDAOImpl implements AccountDAO{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public void insertAccount(AccountVO vo) {
		sqlSession.insert("accountMapper.insertAccount", vo);
		//"": mapper의 별칭
	}
}
