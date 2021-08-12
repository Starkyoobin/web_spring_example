package com.starkyb.spring.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController		//@Controller + @ResponseBody
public class Ex01RestController {
	//요청URL : http://localhost:8080/lesson01/ex01/3
	@RequestMapping("/3")
	public String printString() {
		return "@RestController를 통한 리턴";
	}
	
	//요청URL : http://localhost:8080/lesson01/ex01/4
	@RequestMapping("/4")
	public Map<String, String> printMap(){
		Map<String, String> map = new HashMap<>();
		map.put("김인규", "강사");
		map.put("유재석", "개그맨");
		map.put("정은지", "가수");
		
		return map;
	}
	
	//요청URL : http://localhost:8080/lesson01/ex01/5
	@RequestMapping("/5")
	public Data printData() {
		Data data = new Data();
		data.setId(1);
		data.setName("김유빈");
		
		return data;
	}
	
	//요청URL : http://localhost:8080/lesson01/ex01/6
	@RequestMapping("/6")
	public ResponseEntity<Data> entity() {
		Data data = new Data();
		data.setId(2);
		data.setName("정은지");
		
		ResponseEntity<Data> entity = new ResponseEntity<>(data, HttpStatus.OK);
		return entity;
	}
}
