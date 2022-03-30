package com.javaclass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaclass.dao.MainDAOImpl;
import com.javaclass.domain.MainVO;

@Service("mainService")
public class MainServiceImpl implements MainService {
	@Autowired
	private MainDAOImpl mainDAO;
		
	public List<MainVO> adminGetCustomerList(MainVO vo) {
		return mainDAO.adminGetCustomerList(vo);
	}
	//---------------------------------------------------------------
	public List<MainVO> adminGetOrderList(MainVO vo) {
		return mainDAO.adminGetOrderList(vo);
	}
	//---------------------------------------------------------------
	public List<MainVO> adminGetPayList(MainVO vo) {
		return mainDAO.adminGetPayList(vo);
	}
}
