package com.example.demo.springsecurity.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

	@GetMapping("/msg")
	public String getMsg() {
		return "This is Spring Security demo. <br>"
				+ "hello ";
	}
}
