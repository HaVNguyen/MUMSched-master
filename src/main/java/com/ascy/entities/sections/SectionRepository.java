package com.ascy.entities.sections;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SectionRepository extends CrudRepository<Section, String> {
	public List<Section> findAllByBlockId(String blockId);
}
