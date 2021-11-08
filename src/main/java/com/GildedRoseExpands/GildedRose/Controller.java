package com.GildedRoseExpands.GildedRose;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/ItemList")
	public List <Item> ItemList (){
		
		ArrayList<Item> Items = new ArrayList<Item>();
//		Items.add("name: Rose");
//		Items.add("Description: Lady perfume");
//		Items.add("Price : 200 EGP");
		return Items;
	}
	
	
	

}
