package com.cogent.Batch65_SpringBoottwo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     //Http Methods get defined
public class Controller {
	
	//End Points URL for REST API
	
	@GetMapping("/hello")  //url endpoint for API
	public String hello() {
		return "<h1>Hello World</h1>";
	}

	@GetMapping("/hi")  //url endpoint for API
	public String hi() {
		return "<h1>Hello World</h1>";
	}
	
	@GetMapping("/add")  //url endpoint for API
	public int add() {
		int a = 50;
		int b = 60;
		int c = a + b;
		return c;
	}
	
}
