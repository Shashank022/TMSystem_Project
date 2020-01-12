package com.springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvc.model.Team;

@Service
public interface TeamService {
	
	public List<Team> getListofTeams();

}
