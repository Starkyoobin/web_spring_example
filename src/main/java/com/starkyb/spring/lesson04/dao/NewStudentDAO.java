package com.starkyb.spring.lesson04.dao;

import org.springframework.stereotype.Repository;

import com.starkyb.spring.lesson04.model.NewStudent;

@Repository
public interface NewStudentDAO {
	
	public int insertStudent(NewStudent newStudent);
}
