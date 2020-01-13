package com.springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvc.controller.BaseController;
import com.springmvc.model.Team;

@Service
public class TeamService extends BaseController{
	
	public List<Team> getListofTeams(){
		return teamDao.getListofTeams();
	}

	public Team getDetailsofTeam(int id) {
		return teamDao.getDetailsofTeam(id);
	}

}
