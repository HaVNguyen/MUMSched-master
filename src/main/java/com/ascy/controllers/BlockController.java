package com.ascy.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ascy.entities.blocks.Block;
import com.ascy.entities.blocks.BlockService;

@RestController
public class BlockController {
	
	@Autowired
	private BlockService blockService;
	
	@RequestMapping("/home33")
	public String index() throws IOException{
		return "home";
	}
	@RequestMapping("/block")
	public List<Block> getAllBlock() throws IOException{
		return blockService.getAllBlock();
	}
	
	@RequestMapping("/block/{blockId}")
	public Block getBlock(@PathVariable("blockId") String blockId){
		return blockService.getBlock(blockId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="block")
	public boolean addBlock(@RequestBody Block block) throws IOException{
		blockService.addBlock(block);
		return true;
	}
	@RequestMapping(method=RequestMethod.PUT, value="block")
	public void updateBlock(@RequestBody Block block){
		blockService.updateBlock(block);
	}

}
