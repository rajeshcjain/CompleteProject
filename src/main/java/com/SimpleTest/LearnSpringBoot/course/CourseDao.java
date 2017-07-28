package com.SimpleTest.LearnSpringBoot.course;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.SimpleTest.LearnSpringBoot.model.Course;

@Service
public interface CourseDao extends CrudRepository<Course, String>{
	
	//public List<Course> findByTopicsid(String topicsId);

}
