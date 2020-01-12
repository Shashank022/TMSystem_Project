
package com.springmvc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.controller.BaseController;
import com.springmvc.dao.EventDao;
import com.springmvc.model.Event;
import com.springmvc.model.Team;

@Service
public class EventService extends BaseController{
	

	public List<Event> getListofEvents() {
		return eventDao.getallEventsList();
	}
	
	public void saveEvent(Event event) {
		eventDao.saveEvent(event);
	}
	
	public Event getEventDetails(int id) {
		return eventDao.getEventDetails(id);
	}
	
	public void updateEvent(Event event) {
		eventDao.updateEvent(event);
	}
	
	public void deleteEvent(int id) {
		eventDao.deleteEvent(id);
	}
	
	public List<Team> getTeamDetailsforEvent(int id) {
		return eventDao.getTeamDetailsforEvent(id);
		
	}
}
