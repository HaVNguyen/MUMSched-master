package com.ascy.entities.courses;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private String courseId;
	private String courseName;
	private boolean hasPreeiquisites;
//	private List<String> courses;
	
	

	public Course(){
		
	}
	
	public Course(String courseId, String courseName, boolean hasPreeiquisites) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.hasPreeiquisites = hasPreeiquisites;
	}
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
//	public String getEntry() {
//		return entry;
//	}
//	public void setEntry(String entry) {
//		this.entry = entry;
//	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}

	public boolean isHasPreeiquisites() {
		return hasPreeiquisites;
	}

	public void setHasPreeiquisites(boolean hasPreeiquisites) {
		this.hasPreeiquisites = hasPreeiquisites;
	}
	
}
