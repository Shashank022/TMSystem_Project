package com.springmvc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvc.model.Team;

public class TeamMapper implements RowMapper<Team> {
	public Team mapRow(ResultSet rs, int rowNum) throws SQLException {
		Team team = new Team();
		team.setId(rs.getInt("team_id"));
		team.setTeam_name(rs.getString("team_name"));
		team.setEvent_id(rs.getInt(("event_id")));
		team.setTask_id(rs.getInt("task_id"));

		return team;
	}
}
