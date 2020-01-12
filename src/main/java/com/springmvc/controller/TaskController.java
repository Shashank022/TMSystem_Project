package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.Event;
import com.springmvc.model.Task;
import com.springmvc.service.TaskService;

@Controller
public class TaskController {
	
	
	@Autowired
	TaskService taskService;
	

	@RequestMapping(value = "/tasklist", method = RequestMethod.GET)
	public String getAlllistofEvents(ModelMap model) {
		model.addAttribute("tasks", taskService.getListofTasks());
		return "tasks";
	}

	@RequestMapping(value = "/addtask", method = RequestMethod.GET)
	public String addaNewTask(ModelMap model) {
		 model.addAttribute("task", new Task()); 
		return "addtask";
	}

	@RequestMapping(value = "/addtask", method = RequestMethod.POST)
	public String addaNewTask(ModelMap model, @Valid Task task, BindingResult result) {
		taskService.saveTask(task);
		return "redirect:tasklist";
	}
	
	@RequestMapping(value = "/updatetask", method = RequestMethod.GET)
	public String updateTask(@RequestParam int id, ModelMap model, @Valid Task task, BindingResult result) {
		 model.addAttribute("task", taskService.getTaskbyId(id));
		 return "addtask";
	}
	
	
	@RequestMapping(value = "/updatetask", method = RequestMethod.POST)
	public String updateTask(@Valid Task task, BindingResult result) {
		taskService.updateTask(task);
		return "redirect:tasklist";
	}
	
}
