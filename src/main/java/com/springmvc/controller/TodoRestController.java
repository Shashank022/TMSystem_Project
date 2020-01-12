package com.springmvc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.model.Todo;

@RestController
public class TodoRestController extends BaseController{

	
	@RequestMapping(value = "/todo/", method = RequestMethod.GET)
	public List<Todo> retrieveAllTodos(){
		return todoService.retrieveTodos("in28Minutes");
		
	}

	@RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
	public Todo retrieveTodos(@PathVariable int id){
		return todoService.retrieveTodo(id);
		
	}
	
}
