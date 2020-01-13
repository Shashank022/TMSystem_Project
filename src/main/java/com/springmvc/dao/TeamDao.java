package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.Team;

public interface TeamDao {

	public Team getTeam(int event_id);
	public List<Team> getListofTeams();
	public Team getDetailsofTeam(int id);

}
