package com.SimpleTest.LearnSpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String discription;
	
	@ManyToOne
	private Topics topics;
	
	

	public void setTopics(Topics topics) {
		this.topics = topics;
	}

	public Course() {
		
	}
	
	public Course(String id, String name, String discription,String topicId) {
		this.id = id;
		this.name = name;
		this.discription = discription;
		this.topics = new Topics(topicId,"","");
	}
	
	public Topics getTopics() {
		return topics;
	}

	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public String getDiscription() {
		return discription;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.name)
				.append(this.discription)
				.append(this.id)
				.append(this.topics)
				.toHashCode();

	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Topics == false) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		
		final Course otherObject = (Course) obj;
		
		return new EqualsBuilder().append(this.id, otherObject.id)
				.append(this.discription, otherObject.discription)
				.append(this.name, otherObject.name)
				.append(this.topics, otherObject.topics)
				.isEquals();
	}

}
