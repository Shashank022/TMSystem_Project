package com.springmvc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvc.model.Task;

public class TaskMapper implements RowMapper<Task> {
	public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
		Task task = new Task();
		task.setTask_id(rs.getInt("task_id"));
		task.setTask_name(rs.getString("task_name"));
		task.setTask_created(rs.getDate("task_created"));
		task.setTask_updated(rs.getString("task_updated"));
		task.setEvent_id(rs.getInt("event_id"));
		return task;
	}
}
