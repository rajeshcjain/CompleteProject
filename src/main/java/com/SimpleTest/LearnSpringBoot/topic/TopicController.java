package com.SimpleTest.LearnSpringBoot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SimpleTest.LearnSpringBoot.model.Topics;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	public TopicController() {}

	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		return topicService.getAllToipics();
	}
	
	
	@RequestMapping("/topic/{id}")
	public Topics getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topics topic) {
		topicService.addTopics(topic);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topics topic,@PathVariable String id) {
		topicService.updateTopics(topic,id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopics(id);
	}
}
