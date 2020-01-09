package com.springmvc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {
	
	@Id
	@GeneratedValue
	private int id;
	private String team_name;
	
	@ManyToOne(fetch = FetchType.EAGER) 
	private Event event; 
	
	@OneToMany(mappedBy = "team")
	private List<Task> task = new ArrayList<>();
	
	
	public Team() {
		super();
	}

	public Team(int id, String team_name, Event event, List<Task> task) {
		super();
		this.id = id;
		this.team_name = team_name;
		this.event = event;
		this.task = task;
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


	
	

}
