package com.csi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class ApplicationController {
	
	@RequestMapping("/")
	public String sayHello() {
		
		return"WELCOME TO CSI PUNE";
	}
	@RequestMapping("/services")
	public String sayServices() {
		
		return"APPLICATION DEVELOPMENT";
	}


}
