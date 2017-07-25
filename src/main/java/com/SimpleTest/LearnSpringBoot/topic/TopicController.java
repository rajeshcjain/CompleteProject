package com.SimpleTest.LearnSpringBoot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SimpleTest.LearnSpringBoot.model.Topics;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		return Arrays.asList(
			new Topics("1","name","d1"),
			new Topics("2","name2","d2"),
			new Topics("3","name3","d3"),
			new Topics("4","name4","d4")
		);
	}
}
