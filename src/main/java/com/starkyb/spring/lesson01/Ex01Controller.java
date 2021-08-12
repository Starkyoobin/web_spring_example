package com.starkyb.spring.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/ex01")
public class Ex01Controller {
	//String 출력하기
	//요청URL : http://localhost:8080/lesson01/ex01/1
	@ResponseBody
	@RequestMapping("/1")
	public String printString() {
		String htmlString = "예제 1번 <br>문자열을 response body로 전달합니다.";
		return htmlString;
	}
	
	//Map 출력하기
	//요청URL : http://localhost:8080/lesson01/ex01/2
	@RequestMapping("/2")
	public @ResponseBody Map<String, Integer> printMap(){
		Map<String, Integer> map = new HashMap<>();
		//과일과 가격
		map.put("apple", 1500);
		map.put("banana", 5000);
		map.put("orange", 1000);
		map.put("grape", 3000);
		
		return map;
	}
}
