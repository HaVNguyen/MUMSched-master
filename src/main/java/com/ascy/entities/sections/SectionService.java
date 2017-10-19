package com.ascy.entities.sections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SectionService {
	
	List<Section> sections = new ArrayList<>();
	
	@Autowired
	private SectionRepository sectionRepository;

	public List<Section> getAllSection(){
		List<Section> sections = new ArrayList<>();
		
//		sectionRepository.findAll().forEach(sections::add);
		sectionRepository.findAll().forEach(sections::add);
		
//		for(Section section: sections){
//			System.out.println("--------------"+section.);
//		}
		return sections;
	}

	public Section getSection(String sectionId) {
		return sectionRepository.findOne(sectionId);
	}
	
	public void addSection(Section section){
		sectionRepository.save(section); 
	}
	
	public void updateSection(Section section){
		sectionRepository.save(section); 
	}
	
	public void deleteSection(String sectionId){
		sectionRepository.delete(sectionId); 
	}
}
