package com.javaclass.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.domain.AccountVO;
import com.javaclass.domain.ProductVO;
import com.javaclass.service.AccountService;
import com.javaclass.service.ProductService;

@Controller
@RequestMapping("/admin")
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
	// -------------------------------------------------
		//상품 작성
		@RequestMapping("/adminProductRegister.do")
		public void registerProduct(){
		}
		
		// 상품 저장
		@RequestMapping(value = "/adminProductSave.do")
		public String insertProduct(ProductVO vo) throws IOException {
			productService.adminInsertProduct(vo);
			return "redirect:adminProductList.do";
		}
		// 상품 목록
		@RequestMapping("/adminProductList.do")
		public void GetProductList(ProductVO vo, Model model) {
			// 뷰 페이지 지정 (1) ModelAndView (2) void (3) String
			// 뷰로 데이터 전송 (1) ModelAndView (2) /(3) Model
			model.addAttribute("admin_ProductList", productService.adminGetProductList(vo));
		}

		// 상품 상세 조회
		@RequestMapping("/adminProductChange.do")
		public void getProduct(ProductVO vo, Model m) {
			m.addAttribute("admin_Product", productService.adminGetProduct(vo));
		}

		// 상품 삭제
		@RequestMapping("/adminProductDelete.do")
		public String deleteProduct(ProductVO vo) {
			productService.adminDeleteProduct(vo);
			return "redirect:adminProductList.do";
		}

		// 상품 수정
		@RequestMapping("/adminProductUpdate.do")
		public String updateProduct(ProductVO vo) {
			productService.adminUpdateProduct(vo);
			return "redirect:adminProductList.do";
		}

	
}
