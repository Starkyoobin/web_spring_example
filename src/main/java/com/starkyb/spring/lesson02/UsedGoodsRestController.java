package com.starkyb.spring.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starkyb.spring.lesson02.bo.UsedGoodsBO;
import com.starkyb.spring.lesson02.model.UsedGoods;

@RestController
public class UsedGoodsRestController {
	@Autowired
	private UsedGoodsBO usedGoodsBO;
	
	@RequestMapping("/lesson02/ex01")
	//SELECT * FROM `used_goods`
	public List<UsedGoods> ex01() {
		return usedGoodsBO.getUsedGoodsList();
	}
}
