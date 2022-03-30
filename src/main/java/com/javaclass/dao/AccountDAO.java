package com.javaclass.dao;

import com.javaclass.domain.AccountVO;

public interface AccountDAO {
	
	//id 중복체크 기능 구현
	
	//회원가입 기능 구현
	public void insertAccount(AccountVO vo);
	
	//로그인 확인 기능 구현
	
}
