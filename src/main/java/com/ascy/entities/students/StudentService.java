package com.ascy.entities.students;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
	
	List<Student> students = new ArrayList<>();
	
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents(){
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}

	public Student getStudent(String studentId) {
		return studentRepository.findOne(studentId);
	}
	
	public void addStudent(Student student){
		studentRepository.save(student); 
	}
	
	public void updateStudent(String studentId, Student student){
		studentRepository.save(student); 
	}
	
	public void deleteStudent(String studentId){
		studentRepository.delete(studentId); 
	}
}
