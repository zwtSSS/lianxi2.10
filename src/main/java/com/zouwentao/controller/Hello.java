package com.zouwentao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	
	@RequestMapping("hello")
	public String hell() {
		
		return "hellos";
	}
}
