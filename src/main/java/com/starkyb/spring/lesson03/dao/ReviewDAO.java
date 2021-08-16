package com.starkyb.spring.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.starkyb.spring.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	public Review selectReview(@Param("id") int id);
}
