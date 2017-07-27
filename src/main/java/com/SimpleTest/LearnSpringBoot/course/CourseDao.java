package com.SimpleTest.LearnSpringBoot.course;

import java.io.Serializable;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Service;

import com.SimpleTest.LearnSpringBoot.model.Course;

@Service
public interface CourseDao extends CrudRepository<Course, String>{

}
