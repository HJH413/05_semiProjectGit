package com.javaclass.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaclass.domain.ProductVO;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public List<ProductVO> adminGetProductList(ProductVO vo) {
		System.out.println("===> Mybatis adminGetProductList() 호출");
		return mybatis.selectList("ProductDAO.adminGetProductList", vo);
	}
	
	@Override
	public void adminInsertProduct(ProductVO vo) {
		System.out.println("===> Mybatis adminInsertProduct() 호출");
		mybatis.insert("ProductDAO.adminInsertProduct", vo);

	}
	
	@Override
	public void adminUpdateProduct(ProductVO vo) {
		System.out.println("===> Mybatis adminUpdateProduct() 호출");
		mybatis.insert("ProductDAO.adminUpdateProduct", vo);

	}

	@Override
	public void adminDeleteProduct(ProductVO vo) {
		System.out.println("===> Mybatis adminDeleteProduct() 호출");
		mybatis.insert("ProductDAO.adminDeleteProduct", vo);

	}

	@Override
	public ProductVO adminGetProduct(ProductVO vo) {
		System.out.println("===> Mybatis adminGetProduct() 호출");
		return (ProductVO) mybatis.selectOne("ProductDAO.adminGetProduct", vo);
	}



}
