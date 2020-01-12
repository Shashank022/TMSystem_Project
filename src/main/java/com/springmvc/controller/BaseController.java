package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springmvc.dao.EventDao;
import com.springmvc.dao.TaskDao;
import com.springmvc.dao.TeamDao;
import com.springmvc.dao.UserDao;
import com.springmvc.service.TaskService;
import com.springmvc.service.TeamService;
import com.springmvc.service.TodoService;
import com.springmvc.service.UserService;

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
	UserService userService;
	
	@Autowired
	protected TeamService teamService;
	
	@Autowired
	protected TaskService taskService;
	
	@Autowired
	TodoService service;

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	TodoService todoService;
	
	@Autowired
	ApplicationContext appContext;

}
