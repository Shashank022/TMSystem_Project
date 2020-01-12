package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.dao.EventDao;
import com.springmvc.dao.TaskDao;
import com.springmvc.dao.TeamDao;
import com.springmvc.dao.UserDao;
import com.springmvc.service.TaskService;
import com.springmvc.service.TeamService;

public class BaseController {
	
	@Autowired
	protected TeamDao teamDao;
	
	@Autowired
	protected EventDao eventDao;
	
	@Autowired
	protected TaskDao taskDao;
	
	@Autowired
	protected UserDao userDao;
	
	@Autowired
	protected TeamService teamService;
	
	@Autowired
	protected TaskService taskService;

}
