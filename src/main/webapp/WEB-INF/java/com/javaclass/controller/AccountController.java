package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/include")
public class AccountController {

	@RequestMapping("/{step}.do")
	public String viewPage(@PathVariable String step) {
		return "/include/" + step;
	}
}
