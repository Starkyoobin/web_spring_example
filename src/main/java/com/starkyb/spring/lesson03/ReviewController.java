package com.starkyb.spring.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.starkyb.spring.lesson03.bo.ReviewBO;
import com.starkyb.spring.lesson03.model.Review;

@Controller
public class ReviewController {
	@Autowired
	private ReviewBO reviewBO;
	
	@ResponseBody
	@RequestMapping("/lesson03/ex01")
	public Review ex01(
			@RequestParam("id") int id
			//@RequestParam(value="id", required=true) int id	//필수 파라미터 id
			//@RequestParam(value="id", required=false) Integer id	//비필수 파라미터 id
			//@RequestParam(value="id" , defaultValue="1") int id
			) {	
		return reviewBO.getReview(id);
	}
}
