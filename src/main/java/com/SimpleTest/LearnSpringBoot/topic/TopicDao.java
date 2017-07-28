package com.SimpleTest.LearnSpringBoot.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.SimpleTest.LearnSpringBoot.model.Topics;

@Service
public interface TopicDao extends CrudRepository<Topics, String>{

}
