package com.example.ai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {
//http://localhost:8064/
	@GetMapping("/")
	public String start(){
		System.out.println("안녕하세요 하이");
		return "start"; 
	}
}
