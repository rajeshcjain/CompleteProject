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
	
	
	public List<Course> getAllCourses(){
		
		Iterable<Course> itr = courseDao.findAll();
		List<Course> course = new ArrayList<Course>();
		itr.forEach(course::add);
		return course;
		
	}
	
	public Course getCourse(String id){
		return courseDao.findOne(id);
	}
	
	public void addCourse(Course course) {
		courseDao.save(course);
	}
	
	public void deleteTopics(String id) {
		courseDao.delete(id);
	}
	
	public void updateCorse(Course course,String id) {
		courseDao.save(course);
	}

}
