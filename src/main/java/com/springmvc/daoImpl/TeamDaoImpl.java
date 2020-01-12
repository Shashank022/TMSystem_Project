package com.springmvc.daoImpl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.springmvc.dao.TeamDao;
import com.springmvc.model.Team;
import com.springmvc.rowmapper.TeamMapper;

@Repository
@Transactional
public class TeamDaoImpl implements TeamDao {
	
	private Logger  logger = LoggerFactory.getLogger(this.getClass());

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@PersistenceContext
	EntityManager em;
	

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

}
