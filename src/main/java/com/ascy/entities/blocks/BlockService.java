package com.ascy.entities.blocks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlockService {

	@Autowired
	private BlockRepository blockRepository;


	public List<Block> getAllBlock() throws IOException {
		List<Block> blocks = new ArrayList<>();
		blockRepository.findAll().forEach(blocks::add);
		return blocks;
	}

	public Block getBlock(String blockId) {
		return blockRepository.findOne(blockId);
	}

	public void addBlock(Block block) {
		blockRepository.save(block);
	}

	public void updateBlock(Block block) {
		blockRepository.save(block);
	}

	public void deleteBlock(String blockId) {
		blockRepository.delete(blockId);
	}
}
