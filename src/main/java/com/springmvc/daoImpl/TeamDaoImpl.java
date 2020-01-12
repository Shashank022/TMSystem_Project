package com.springmvc.daoImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.dao.TeamDao;
import com.springmvc.model.Team;

@Repository
@Transactional
public class TeamDaoImpl implements TeamDao {

	@Override
	public Team getTeam(int id) {
		// TODO Auto-generated method stub
		return new Team();
	}

}
