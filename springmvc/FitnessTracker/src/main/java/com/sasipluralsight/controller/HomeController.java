package com.sasipluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/greeting")
	public String Hello(Model model) {
		
		model.addAttribute("greeting","Hello World");
		return	"hello";
	}
}
