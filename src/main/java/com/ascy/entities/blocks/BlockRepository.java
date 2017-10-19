package com.ascy.entities.blocks;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends CrudRepository<Block, String> {
	public List<Block> findAllByBlockId(String blockId);
}
