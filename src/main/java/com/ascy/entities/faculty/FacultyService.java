package com.ascy.entities.faculty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FacultyService {
	
	List<Faculty> facultys = new ArrayList<>();
	
	@Autowired
	private FacultyRepository facultyRepository;

	public List<Faculty> getAllFaculty(){
		List<Faculty> faculty = new ArrayList<>();
		facultyRepository.findAll().forEach(faculty::add);
		return faculty;
	}

	public Faculty getFaculty(String facultyId) {
		return facultyRepository.findOne(facultyId);
	}
	
	public void addFaculty(Faculty faculty){
		facultyRepository.save(faculty); 
	}
	
	public void updateFaculty(Faculty faculty){
		facultyRepository.save(faculty); 
	}
	
	public void deleteFaculty(String facultyId){
		facultyRepository.delete(facultyId); 
	}
}
