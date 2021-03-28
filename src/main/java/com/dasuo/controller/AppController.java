package com.dasuo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dasuo")
public class AppController {
	@RequestMapping("")
	public String viewHome() {
		return "index";
	}

}
