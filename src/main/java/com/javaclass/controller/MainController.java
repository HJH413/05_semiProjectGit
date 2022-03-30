package com.javaclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.domain.MainVO;
import com.javaclass.service.MainService;

@Controller
@RequestMapping("/")
public class MainController {
	
	
	@Autowired
	private MainService mainService;

	// localhost:8080/index.do
	@RequestMapping("index.do")
	public String main() {
		return "index";
	}
	
	@RequestMapping("/{step}.do")
	public String viewPage(@PathVariable String step) {
		return step;
	}
	
	@RequestMapping("admin/adminCustomerList.do")
	public void getCustomerList(MainVO vo, Model model) {
		// 뷰 페이지 지정 (1) ModelAndView (2) void (3) String
		// 뷰로 데이터 전송 (1) ModelAndView (2) /(3) Model
		model.addAttribute("admin_CustomerList", mainService.adminGetCustomerList(vo));
	}

	// -------------------------------------------------
	@RequestMapping("admin/adminOrderList.do")
	public void adminGetOrderList(MainVO vo, Model model) {
		// 뷰 페이지 지정 (1) ModelAndView (2) void (3) String
		// 뷰로 데이터 전송 (1) ModelAndView (2) /(3) Model
		model.addAttribute("admin_OrderList", mainService.adminGetOrderList(vo));
	}

	// -------------------------------------------------
	@RequestMapping("admin/adminPaymentList.do")
	public void adminGetPayList(MainVO vo, Model model) {
		// 뷰 페이지 지정 (1) ModelAndView (2) void (3) String
		// 뷰로 데이터 전송 (1) ModelAndView (2) /(3) Model
		model.addAttribute("admin_PayList", mainService.adminGetPayList(vo));
	}

}
