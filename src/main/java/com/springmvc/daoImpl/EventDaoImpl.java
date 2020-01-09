
package com.springmvc.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.dao.EventDao;
import com.springmvc.model.Event;

@Repository
public class EventDaoImpl implements EventDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@PersistenceContext
	EntityManager em;
	
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
 	public List<Event> getallEventsList() {
		Session session = em.unwrap(Session.class);
 		return session.createCriteria(Event.class).list();
 	}
 
 	@Override
 	@Transactional
 	public void saveEvent(Event event) {
 		Session session = em.unwrap(Session.class);
 		Event eventSample = new Event();
 		eventSample.setEvent_name(event.getEvent_name());
 		eventSample.setCreated_by(event.getCreated_by());
 		eventSample.setUpdated_by(event.getUpdated_by());
 		eventSample.setTeam_id(event.getTeam_id());
 		session.saveOrUpdate(eventSample);
 		session.close();
 	}
 
 	@Override
 	@Transactional
 		public Event getEventDetails(int id) {
 		return (Event) em.unwrap(Session.class).createCriteria(Event.class).add(Restrictions.idEq(id)).uniqueResult();
 	}
 
 	@Override
 	public void updateEvent(Event event) {
 		String updateSql = "update TMSystem.events set event= ? where id = ?";
 		jdbcTemplate.update(updateSql, new Object[]{event, event.getId()}); 
 		
 	}
 
 	@Override
 	@Transactional
 	public void deleteEvent(int id) {
 		Session session = em.unwrap(Session.class);
 		Event event = em.find(Event.class, id); 
 		session.delete(event);
 		session.flush();
 	}

}
