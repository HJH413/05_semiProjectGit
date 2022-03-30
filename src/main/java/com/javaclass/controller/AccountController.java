package com.javaclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.domain.AccountVO;
import com.javaclass.service.AccountService;

@Controller
public class AccountController {

	
	
	@Autowired
	private AccountService accountServiceImpl;
	
	@RequestMapping("insertAccount.do")
	public void insertAccount(AccountVO vo) {
		accountServiceImpl.insertAccount(vo);
	}
	
}
