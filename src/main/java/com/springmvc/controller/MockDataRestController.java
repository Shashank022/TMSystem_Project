package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.model.Data;
import com.springmvc.service.EventService;


@RestController
public class MockDataRestController {
	
	@Autowired
	EventService eventService;
	
	
	@GetMapping("/getdatalist")
	public List<Data> getListofData(){
		
		List<Data> dataList =  eventService.getListofData();	
		
		return dataList;
		
	}
	

}
