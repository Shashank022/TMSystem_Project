package com.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {
	
	@Id
	@GeneratedValue
	private int id;
	private String team_name;
	
	private int event_id;
	private int task_id;
	
	
	public Team(int id, String team_name, int event_id, int task_id) {
		super();
		this.id = id;
		this.team_name = team_name;
		this.event_id = event_id;
		this.task_id = task_id;
	}


	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTeam_name() {
		return team_name;
	}


	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}


	public int getEvent_id() {
		return event_id;
	}


	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}


	public int getTask_id() {
		return task_id;
	}


	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}



}
