package com.ascy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ascy.entities.courses.Course;
import com.ascy.entities.courses.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/course")
	public List<Course> getAllCourse(){
		return courseService.getAllCourse();
	}
	@RequestMapping("/course/{courseId}")
	public Course getCourse(@PathVariable("courseId") String courseId){
		return courseService.getCourse(courseId);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="course")
	public void addCourse(@RequestBody Course course){
		courseService.addCourse(course);
	}
	@RequestMapping(method=RequestMethod.PUT, value="course")
	public void updateCourse(@RequestBody Course course){
		courseService.updateCourse(course);
	}

}
