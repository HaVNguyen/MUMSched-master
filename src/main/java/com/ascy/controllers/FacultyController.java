package com.ascy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ascy.entities.faculty.Faculty;
import com.ascy.entities.faculty.FacultyService;

@RestController
public class FacultyController {
	
	@Autowired
	private FacultyService facultyService;
	
	@RequestMapping("/faculty")
	public List<Faculty> getAllFaculty(){
		return facultyService.getAllFaculty();
	}
	@RequestMapping("/faculty/{facultyId}")
	public Faculty getFaculty(@PathVariable("facultyId") String facultyId){
		return facultyService.getFaculty(facultyId);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="faculty")
	public void addFaculty(@RequestBody Faculty faculty){
		facultyService.addFaculty(faculty);
	}
	@RequestMapping(method=RequestMethod.PUT, value="faculty")
	public void updateFaculty(@RequestBody Faculty faculty){
		facultyService.updateFaculty(faculty);
	}

}
