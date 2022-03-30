package com.javaclass.dao;

import java.util.List;

import com.javaclass.domain.MainVO;
import com.javaclass.domain.ProductVO;


public interface MainDAO {

	//----------------------------------------------------
	
		public List<MainVO> adminGetCustomerList(MainVO vo);
		//----------------------------------------------------
		
		public List<MainVO> adminGetOrderList(MainVO vo);
		//----------------------------------------------------
			
		public List<MainVO> adminGetPayList(MainVO vo);

	

}	

