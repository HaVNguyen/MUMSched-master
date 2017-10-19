package com.ascy.entities.blocks;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.ascy.entities.sections.Section;


@Entity
public class Block {
	
	@Id
	private String blockId;
	private String blockName;
	private String blockStarts;
	private String blockEnds;
	
	
	@OneToMany
	private List<Section> sections;

	public Block(){
		
	}
	
	public Block(String blockId, String blockName, String blockStarts, String blockEnds) {
		super();
		this.blockId = blockId;
		this.blockName = blockName;
		this.blockStarts = blockStarts;
		this.blockEnds = blockEnds;
		this.sections = new ArrayList<>();
	}
	
	public String getBlockStarts() {
		return blockStarts;
	}

	public void setBlockStarts(String blockStarts) {
		this.blockStarts = blockStarts;
	}

	public String getBlockEnds() {
		return blockEnds;
	}

	public void setBlockEnds(String blockEnds) {
		this.blockEnds = blockEnds;
	}

	public String getBlockId() {
		return blockId;
	}
	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	@OneToMany(mappedBy = "block", fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
	
	@Override
	public String toString() {
		return "Block [blockId=" + blockId + ", blockName=" + blockName + ", blockStarts=" + blockStarts
				+ ", blockEnds=" + blockEnds + ", sections=" + sections + "]";
	}

	
	
}
