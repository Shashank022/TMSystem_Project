package com.springmvc.dao;

import java.util.List;

import com.mysql.fabric.xmlrpc.base.Data;
import com.springmvc.model.Event;
import com.springmvc.model.Team;


public interface EventDao {

	public List<Event> getallEventsList();
	public void saveEvent(Event event);
	public Event getEventDetails(int id);
	public void updateEvent(Event event);
	public void deleteEvent(int id);
	public List<Team> getTeamDetailsforEvent(int id);
	public int getEventStatsData();
	public List<Data> getListofData();
	
}
