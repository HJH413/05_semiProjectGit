package com.javaclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaclass.dao.AccountDAO;
import com.javaclass.domain.AccountVO;

@Service("accoutServiceImpl")
public class AccoutServiceImpl implements AccountService{

	@Autowired
	private AccountDAO accountDAOImpl;
	
	
	public void insertAccount(AccountVO vo) {
		accountDAOImpl.insertAccount(vo);
	}
}
