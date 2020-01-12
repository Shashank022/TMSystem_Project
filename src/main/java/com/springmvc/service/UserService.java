package com.springmvc.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springmvc.controller.BaseController;
import com.springmvc.model.User;

@Component
public class UserService extends BaseController{
 
	public List<User> getallUserList() {
		return userDao.getallUserList();
	}
	
	public User findBySSO(String sso) {
		return userDao.findBySSO(sso);
	}

}
