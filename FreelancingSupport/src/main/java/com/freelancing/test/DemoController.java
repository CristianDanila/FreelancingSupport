package com.freelancing.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/hello")
	public String hello(){
		System.out.println("test");
		return "hello";
	}
	
}
