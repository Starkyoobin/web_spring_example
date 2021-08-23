package com.starkyb.spring.lesson05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lesson05")
public class Lesson05Controller {
	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
}
