package com.SimpleTest.LearnSpringBoot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SimpleTest.LearnSpringBoot.model.Topics;

@Service
public class TopicService {
	
	List<Topics> listOfTopics = new ArrayList<Topics>(Arrays.asList(
			new Topics("1","name","d1"),
			new Topics("2","name2","d2"),
			new Topics("3","name3","d3"),
			new Topics("4","name4","d4")));
	
	
	public List<Topics> getAllToipics(){
		return listOfTopics;
	}
	
	public Topics getTopic(String id){
		return listOfTopics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopics(Topics topic) {
		listOfTopics.add(topic);
	}
	
	public void deleteTopics(String id) {
		int size = listOfTopics.size();
		int i = 0;
		
		while(i <= size) {
			Topics topic = listOfTopics.get(i);
			if( topic.getId().equals(id)) {
				break;
			}
			i++;
		}
		
		if( i < size) {
		listOfTopics.remove(i);
		}
	}
	
	public void updateTopics(Topics topic,String id) {
		
		for(int i=0;i< listOfTopics.size();i++) {
			Topics t = listOfTopics.get(i);
			if(topic.getId().equals(t.getId())) {
				break;
			}
			listOfTopics.set(i, topic);
		}
	}

}
