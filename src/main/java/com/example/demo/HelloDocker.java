package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDocker {
	
	@GetMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }
	@GetMapping("/docker")
	public String docker() {
		return "<h1>Welcome TO Containerization!</h1>";
	}
}
