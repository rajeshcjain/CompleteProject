package com.SimpleTest.LearnSpringBoot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SimpleTest.LearnSpringBoot.model.Topics;

@Service
public class TopicService {
	
	@Autowired
	private TopicDao topicDao;
	
	
	public List<Topics> getAllToipics(){
		
		Iterable<Topics> itr = topicDao.findAll();
		List<Topics> topic = new ArrayList<Topics>();
		itr.forEach(topic::add);
		return topic;
		
	}
	
	public Topics getTopic(String id){
		return topicDao.findOne(id);
	}
	
	public void addTopics(Topics topic) {
		topicDao.save(topic);
	}
	
	public void deleteTopics(String id) {
		topicDao.delete(id);
	}
	
	public void updateTopics(Topics topic,String id) {
		topicDao.save(topic);
	}

}
