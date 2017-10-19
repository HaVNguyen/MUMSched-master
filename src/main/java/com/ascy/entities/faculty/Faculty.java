package com.ascy.entities.faculty;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.ascy.entities.courses.Course;

@Entity
public class Faculty {
	
	@Id
	private String facultyId;
	private String facultyName;
	
//	private List<Course> courses;
//	private Course course;
	
	public Faculty(){
		
	}
	
	public Faculty(String facultyId, String facultyName) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
//		this.course = new Course();
//		courses.add(course);
	}
	
	public String getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
//	public String getEntry() {
//		return entry;
//	}
//	public void setEntry(String entry) {
//		this.entry = entry;
//	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + "]";
	}
	
}
