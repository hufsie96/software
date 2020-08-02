package com.example.demo.thymeaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	@GetMapping("/default")
	public String getDefault() {		
		
		return "defaultLayout";
	}
	
	@GetMapping("/example")
	public String getExample() {
		
		return "exampleLayout";
	}
	
	
}
