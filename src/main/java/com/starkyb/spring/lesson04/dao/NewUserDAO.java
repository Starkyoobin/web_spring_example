package com.starkyb.spring.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.starkyb.spring.lesson04.model.NewUser;

@Repository
public interface NewUserDAO {
	public int insertUser(
			@Param("name") String name
			, @Param("yyyymmdd") String yyyymmdd
			, @Param("introduce") String introduce
			, @Param("email") String email);
	
	public NewUser selectLastUser();
}
