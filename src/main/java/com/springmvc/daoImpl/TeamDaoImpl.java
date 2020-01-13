package com.springmvc.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.dao.TeamDao;
import com.springmvc.model.Team;
import com.springmvc.rowmapper.TeamMapper;

@Repository
@Transactional
public class TeamDaoImpl extends BaseDaoImpl implements TeamDao {
	

	@Override
	public Team getTeam(int id) {
		return new Team();
	}

	@Override
	public List<Team> getListofTeams() {
		List<Team> teams = (List<Team>) jdbcTemplate.query("select * from TMSystem.teams", new TeamMapper());
		logger.info("Getting all the list of Events : getallEventsList {}", teams);
 		return teams;
	}

	@Override
	public Team getDetailsofTeam(int id) {
		
		Team team = em.find(Team.class, id);
		return team;
	}

}
