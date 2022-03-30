package com.javaclass.service;

import java.util.List;

import com.javaclass.domain.ProductVO;

public interface ProductService {

	
	// ------------------------------------------------
	
	List<ProductVO> adminGetProductList(ProductVO avo);

	void adminInsertProduct(ProductVO avo);

	
	void adminUpdateProduct(ProductVO avo);

	
	void adminDeleteProduct(ProductVO avo);

	
	ProductVO adminGetProduct(ProductVO avo);

	

}
