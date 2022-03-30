package com.javaclass.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaclass.domain.MainVO;
import com.javaclass.domain.ProductVO;

@Repository("mainDAO")
public class MainDAOImpl implements MainDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	// ----------------------------------------------------------------------

	@Override
	public List<MainVO> adminGetCustomerList(MainVO avo) {
		System.out.println("===> Mybatis adminGetCustomerList() 호출");
		return mybatis.selectList("MainDAO.adminGetCustomerList", avo);
	}

	// ----------------------------------------------------------------------

	@Override
	public List<MainVO> adminGetOrderList(MainVO avo) {
		System.out.println("===> Mybatis adminGetOrderList() 호출");
		return mybatis.selectList("MainDAO.adminGetOrderList", avo);
	}

	// ----------------------------------------------------------------------

	@Override
	public List<MainVO> adminGetPayList(MainVO avo) {
		System.out.println("===> Mybatis adminGetPayList() 호출");
		return mybatis.selectList("MainDAO.adminGetPayList", avo);
	}

	// ----------------------------------------------------------------------
	


}
