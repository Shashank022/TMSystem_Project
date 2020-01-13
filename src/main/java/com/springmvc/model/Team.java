package com.springmvc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {
	
	@Id
	@GeneratedValue
	private int team_id;
	private String team_name;
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name = "event_id")
	private Event event; 
	
	@OneToMany(mappedBy = "team")
	private List<Task> task = new ArrayList<>();
	
	private int task_id;
	
	
	public Team() {
		super();
	}


	public Team(int team_id, String team_name, Event event, List<Task> task, int task_id) {
		super();
		this.team_id = team_id;
		this.team_name = team_name;
		this.event = event;
		this.task = task;
		this.task_id = task_id;
	}


	public int getTeam_id() {
		return team_id;
	}


	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}


	public String getTeam_name() {
		return team_name;
	}


	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}


	public Event getEvent() {
		return event;
	}


	public void setEvent(Event event) {
		this.event = event;
	}


	public List<Task> getTask() {
		return task;
	}


	public void setTask(List<Task> task) {
		this.task = task;
	}


	public int getTask_id() {
		return task_id;
	}


	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}


}
