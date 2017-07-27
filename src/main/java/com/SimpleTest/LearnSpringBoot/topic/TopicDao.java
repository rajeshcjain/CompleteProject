package com.SimpleTest.LearnSpringBoot.topic;

import java.io.Serializable;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Service;

import com.SimpleTest.LearnSpringBoot.model.Topics;

@Service
public interface TopicDao extends CrudRepository<Topics, String>{

}
