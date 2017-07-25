package com.SimpleTest.LearnSpringBoot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SimpleTest.LearnSpringBoot.model.Topics;

@Service
public class TopicService {
	
	List<Topics> listOfTopics = Arrays.asList(
			new Topics("1","name","d1"),
			new Topics("2","name2","d2"),
			new Topics("3","name3","d3"),
			new Topics("4","name4","d4"));
	
	
	public List<Topics> getAllToipics(){
		return listOfTopics;
	}

}
