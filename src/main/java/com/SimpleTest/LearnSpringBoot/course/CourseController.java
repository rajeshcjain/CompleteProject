package com.SimpleTest.LearnSpringBoot.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SimpleTest.LearnSpringBoot.model.Course;
import com.SimpleTest.LearnSpringBoot.model.Topics;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	public CourseController() {}

	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourse(@PathVariable String topicId) {
		return courseService.getAllCourses();
	}
	
	@RequestMapping("/topic/{topicId}/course/{courseId}")
	public Course getCourse(@PathVariable String topicId,@PathVariable String courseId){
		return courseService.getCourse(courseId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/course")
	public void addCourse(@PathVariable String topicId, @RequestBody Course course) {
		Topics topic = new Topics(topicId,"","");
		course.setTopics(topic);
		courseService.addCourse(course);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/course/{courseId}")
	public void updateCourse(@RequestBody Course course,@PathVariable String courseId,@PathVariable String topicId) {
		Topics topic = new Topics(topicId,"","");
		course.setTopics(topic);
		courseService.updateCorse(course,courseId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId}/course/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		courseService.deleteCourse(courseId);
	}
}
