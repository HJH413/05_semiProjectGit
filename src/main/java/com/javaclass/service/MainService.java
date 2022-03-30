package com.javaclass.service;

import java.util.List;

import com.javaclass.domain.MainVO;

public interface MainService {
	List<MainVO> adminGetCustomerList(MainVO vo);
	// ------------------------------------------------

	List<MainVO> adminGetOrderList(MainVO vo);
	// ------------------------------------------------
	
	List<MainVO> adminGetPayList(MainVO vo);
}

