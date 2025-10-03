package com.jenkis.test.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/init")  
public class InitController {
	
	
	@GetMapping("/fruits")
	public String getFruitsName() {
		
		ArrayList<String> fruitsList=new ArrayList<>();
		fruitsList.add("Apple");
		fruitsList.add("Banana");
		fruitsList.add("Papaya");
		fruitsList.add("Grapes");
		fruitsList.add("Pineapple");
		
		return fruitsList.toString();
	}
	

}
