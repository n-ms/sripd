package com.nms.sandbox.websocket;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@RequestMapping("/foo")
	public String doGet() {
		return "greetigs from Spring Boot";
		
	}

}
