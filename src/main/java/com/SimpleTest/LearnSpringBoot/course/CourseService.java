package com.SimpleTest.LearnSpringBoot.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimpleTest.LearnSpringBoot.model.Course;
import com.SimpleTest.LearnSpringBoot.model.Topics;

@Service
public class CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	
	public List<Course> getAllCourses(String topicId){
		
		//List<Course> course = courseDao.findByTopicsid(topicId);
		List<Course> course = new ArrayList<Course>();
		
		return course;
		
	}
	
	public Course getCourse(String id){
		return courseDao.findOne(id);
	}
	
	public void addCourse(Course course) {
		courseDao.save(course);
	}
	
	public void deleteCourse(String id) {
		courseDao.delete(id);
	}
	
	public void updateCorse(Course course,String id) {
		courseDao.save(course);
	}

}
