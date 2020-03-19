package com.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exercise.entity.Item;
import com.exercise.service.ItemManager;

@RestController
public class ItemController {
	@Autowired
	ItemManager itemManager;
	@GetMapping("contextpath/v1/viewItems")
	public  List<Item> getItemList() {
		return  itemManager.getAllItems();
		
	}

}
