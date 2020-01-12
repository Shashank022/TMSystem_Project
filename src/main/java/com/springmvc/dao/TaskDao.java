package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.Task;

public interface TaskDao {
	
		public List<Task> getallUserList();
		public List<Task> getListofTasks();
		public void saveTask(Task task);
		public void updateTask(Task task);
		public Task getTaskbyId(int id);

}
