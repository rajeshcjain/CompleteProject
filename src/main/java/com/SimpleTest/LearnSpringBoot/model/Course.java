package com.SimpleTest.LearnSpringBoot.model;

import javax.persistence.Id;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Course {
	
	@Id
	private String id;
	private String name;
	private String discription;
	
	public Course() {
		
	}
	
	public Course(String id, String name, String discription) {
		this.id = id;
		this.name = name;
		this.discription = discription;
	}

	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.name)
				.append(this.discription)
				.append(this.id)
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
				.isEquals();
	}

}
