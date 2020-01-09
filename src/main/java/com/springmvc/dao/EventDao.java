
package com.springmvc.dao;
import java.util.List;

import com.springmvc.model.Event;
import com.springmvc.model.Team;


public interface EventDao {

	public List<Event> getallEventsList();
	public void saveEvent(Event event);
	public Event getEventDetails(int id);
	public void updateEvent(Event event);
	public void deleteEvent(int id);
	public List<Team> getTeamDetailsforEvent(int id);
	
}
