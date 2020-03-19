package com.exercise.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.exercise.entity.Item;
import com.exercise.repository.ItemRepository;

@Service
public class ItemManager {
	
@Autowired
ItemRepository itemRepository;
	
private static  List<Item> getSortedList(List<Item> itemList) {
			
			int listSize = itemList.size();
			Item itemTemp = new Item();
			try {
			for(int i =0; i<listSize;i++) {
				for(int j =i+1;j<listSize;j++) {
					if((itemList.get(i).getPrice()) < (itemList.get(j).getPrice()))
					{
						itemTemp = itemList.get(i);
						itemList.set(i,itemList.get(j)) ;
						itemList.set(j, itemTemp);
					}
				}
			}
			}catch (Exception e) {
				System.out.println(HttpStatus.NOT_FOUND);
			}
		return itemList;
	}


public List<Item> getAllItems() {
	List<Item> itemList = new ArrayList<Item>();
	itemList = itemRepository.findAll();
	itemList = getSortedList(itemList);
	return itemList;
}

 



}
	
