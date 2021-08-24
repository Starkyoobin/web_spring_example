package com.starkyb.spring.lesson05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lesson05")
public class Lesson05Controller {
	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		//과일 이름을 저장하고 있는 리스트
		List<String> fruits = new ArrayList<>();
		fruits.add("수박");
		fruits.add("딸기");
		fruits.add("포도");
		
		model.addAttribute("fruits", fruits);
		
		//List<Map>
		//[ {name:"김유빈", age:21, hobby:"운동"}, ....]
		List<Map<String, Object>> users = new ArrayList<>();
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "김유빈");
		map.put("age", 21);
		map.put("hobby", "댄스");
		users.add(map);
		
		map = new HashMap<>();
		map.put("name", "김바다");
		map.put("age", 3);
		map.put("hobby", "사냥하기");
		users.add(map);
		
		model.addAttribute("users", users);
		
		return "lesson05/ex02";
	}
	
	@GetMapping("/ex03")
	public String ex03(Model model) {
		Date today = new Date();
		model.addAttribute(today);
		
		return "lesson05/ex03";
	}
}
