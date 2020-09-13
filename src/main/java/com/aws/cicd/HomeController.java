package com.aws.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HomeController {
	
	@GetMapping
	public String hello() {
		return "Hello Nonu";
	}
}
