
package com.springmvc.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.dao.EventDao;
import com.springmvc.model.Event;
import com.springmvc.model.Team;
import com.springmvc.rowmapper.EventMapper;
import com.springmvc.rowmapper.TeamMapper;

@Repository
public class EventDaoImpl implements EventDao{

	
	private Logger  logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@PersistenceContext
	EntityManager em;
	
		
	@Override
	@Transactional
 	public List<Event> getallEventsList() {
		//TypedQuery<Event> createNamedQuery = em.createNamedQuery("for_events_list", Event.class); 
		//jdbcTemplate.query("select * from TMSystem.events", new EventMapper());
		
		List<Event> Event = (List<Event>) jdbcTemplate.query("select * from TMSystem.events", new EventMapper());
		
		logger.info("Getting all the list of Events : getallEventsList {}", Event);
 		return Event;
 	}
 
 	@Override
 	@Transactional
 	public void saveEvent(Event event) {
 		Session session = em.unwrap(Session.class);	
 		Event eventSample = new Event();
 		eventSample.setEvent_name(event.getEvent_name());
 		eventSample.setCreated_by(event.getCreated_by());
 		eventSample.setUpdated_by(event.getUpdated_by());
 		//eventSample.setTeam_id(event.getTeam_id());
 		session.saveOrUpdate(eventSample);
 		session.close();
 	}
 
 	@Override
 	@Transactional
 		public Event getEventDetails(int id) {
 		
 		Event event = em.find(Event.class, id);
 		event.getTeam();
 		return event;
 	}
 
 	@Override
 	@Transactional
 	public void updateEvent(Event event) {
 		Session session = em.unwrap(Session.class);
 		if(event.getId() != 0) {
 	 		session.saveOrUpdate(event); 			
 	 		session.flush();
 		} 
 	}
 
 	@Override
 	@Transactional
 	public void deleteEvent(int id) {
//		Event event = em.find(Event.class, id); 
// 		em.remove(event);
// 		//em.flush();
 		Event event = em.find(Event.class, id); 
 		Session session = em.unwrap(Session.class);
 		session.delete(event);
 		session.flush();
 	}

	@Override
	@Transactional
	public List<Team> getTeamDetailsforEvent(int id) {
 		//Team event = em.find(Event.class, id); 
		
		//logger.info(""{}, );
		
//		List<Team> teamsList = em.createQuery("select e from TMSystem.Team e where e.event_id = :id",
//			    Team.class).setParameter("id", id).getResultList();
		
		//List<Team> teamsList = sessionFactory.getCurrentSession().createCriteria(Team.class).list();
		//.add(Restrictions.eq("event_id", event_id)).list();
		List<Team> teamList =  jdbcTemplate.query("select * from TMSystem.teams where event_id =? ", new Object[] {id},new TeamMapper()); 
		return teamList;
	}

}
