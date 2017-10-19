package com.ascy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ascy.entities.blocks.BlockRepository;
import com.ascy.entities.sections.Section;
import com.ascy.entities.sections.SectionService;

@RestController
public class SectionController {
	
	@Autowired
	private SectionService sectionService;
	
	@Autowired
	private BlockRepository blockRepository; 
	
	@RequestMapping("/section")
	public List<Section> getAllSections(){
		return sectionService.getAllSection();
	}
	@RequestMapping("/section/{sectionId}")
	public Section getSection(@PathVariable("sectionId") String sectionId){
		return sectionService.getSection(sectionId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="section")
	public void addSection(@RequestBody Section section){
//		section.setBlock(blockRepository.findAllByBlockId(section.).get(0));
		sectionService.addSection(section);
	}
	@RequestMapping(method=RequestMethod.PUT, value="section")
	public void updateSection(@RequestBody Section section){
		sectionService.updateSection(section);
	}

}
