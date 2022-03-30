package com.javaclass.dao;

import java.util.List;

import com.javaclass.domain.ProductVO;


public interface ProductDAO {

	//----------------------------------------------------
	
	public List<ProductVO> adminGetProductList(ProductVO vo);
	
	public void adminInsertProduct(ProductVO vo);
	
	public void adminUpdateProduct(ProductVO vo);

	public void adminDeleteProduct(ProductVO vo);

	public ProductVO adminGetProduct(ProductVO vo);
	

}	

