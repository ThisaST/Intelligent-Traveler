package edu.uok.se.itraveler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(){
		return "redirect:/index";
	}
	
	@RequestMapping
	public String index(){
		return "index";
	}
}
