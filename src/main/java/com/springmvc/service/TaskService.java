package com.springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvc.controller.BaseController;
import com.springmvc.model.Task;

@Service
public class TaskService extends BaseController{
	
	public List<Task> getListofTasks() {
		System.out.println("Well we are here");
		return taskDao.getListofTasks();
	}
	
	public void saveTask(Task task) {
		System.out.println("Well we are here");
		taskDao.saveTask(task);
	}
	
	public void updateTask(Task task) {
		System.out.println("Well we are here");
		taskDao.updateTask(task);
	
	}
	
	public Task getTaskbyId(int id) {
		return taskDao.getTaskbyId(id); 
	}
}
