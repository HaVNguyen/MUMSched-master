package com.ascy.entities.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService {
	
	List<Course> courses = new ArrayList<>();
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourse(){
		List<Course> course = new ArrayList<>();
		courseRepository.findAll().forEach(course::add);
		return course;
	}

	public Course getCourse(String courseId) {
		return courseRepository.findOne(courseId);
	}
	
	public void addCourse(Course course){
		courseRepository.save(course); 
	}
	
	public void updateCourse(Course course){
		courseRepository.save(course); 
	}
	
	public void deleteCourse(String courseId){
		courseRepository.delete(courseId); 
	}
}
