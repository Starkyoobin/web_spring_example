package com.starkyb.spring.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.starkyb.spring.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	//select
	public Review selectReview(@Param("id") int id);
	//insert
	public int insertReview(
			@Param("storeId") int storeId
			, @Param("menu") String menu
			, @Param("userName") String userName
			, @Param("point") double point
			, @Param("review") String review
			);
	
	public int insertReviewAsObject(Review review);
	
	//update
	public int updateReviewById(@Param("id") int id, @Param("review") String review);
	
	//delete
	public int deleteReview(@Param("id") int id);
}
