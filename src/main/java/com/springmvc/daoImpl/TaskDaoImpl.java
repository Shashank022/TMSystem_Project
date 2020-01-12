
package com.springmvc.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.dao.TaskDao;
import com.springmvc.dao.TeamDao;
import com.springmvc.model.Task;
import com.springmvc.rowmapper.TaskMapper;

@Repository
@Transactional
public class TaskDaoImpl extends BaseDaoImpl implements TaskDao {

	@Override
	public List<Task> getallUserList() {
		
		String SQL = "SELECT * FROM TMSystem.users";
		List<Task> tasks = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<Task>(Task.class));
		return tasks;
	}


	@Override
	@Transactional
	public List<Task> getListofTasks() {
		
//		Criteria crit = sessionfactory.getCurrentSession().createCriteria(Task.class);
//		List<Task> tasks = crit.list();
		String SQL = "SELECT * FROM TMSystem.tasks";
		List<Task> tasks = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<Task>(Task.class));
		
		
		return tasks;
	}
	
	@Override
	public Task getTaskbyId(int id) {
		//Task task = em.find(Task.class,id);
		String SQL = "SELECT * FROM TMSystem.tasks where task_id=?";
		Task task = jdbcTemplate.queryForObject(SQL, new  Object[] {id} ,new TaskMapper());
		return task;
	}


 	@Override
 	@Transactional
	public void saveTask(Task task) {
	 		Session session = em.unwrap(Session.class);	
	 		Task taskSingle = new Task();

	 		taskSingle.setTask_name(task.getTask_name());
	 		taskSingle.setTask_created(task.getTask_created());
	 		taskSingle.setTask_updated((task.getTask_updated()));
	 		TeamDao teamDao = (TeamDao) appContext.getBean("teamDao");
	 		System.out.println(teamDao);
	 		//taskSingle.setTeam( teamDao.getTeam());
	 		//eventSample.setTeam_id(event.getTeam_id());
	 		session.saveOrUpdate(taskSingle);
	 		session.close();
	 	}
 	
 	//updateTask
 	

 	@Override
 	@Transactional
	public void updateTask(Task task) {
	 		
 			Task taskSingle = getTaskbyId(task.getTask_id());
 			Session session = em.unwrap(Session.class);	
	 	
	 		taskSingle.setTask_name(task.getTask_name());
	 		taskSingle.setTask_created(task.getTask_created());
	 		taskSingle.setTask_updated((task.getTask_updated()));
	 		TeamDao teamDao = (TeamDao) appContext.getBean("teamDao");
	 		taskSingle.setTeam( teamDao.getTeam(task.getEvent_id()));
	 		//eventSample.setTeam_id(event.getTeam_id());
	 		session.saveOrUpdate(taskSingle);
	 		session.close();
	 	}

	/*
	 * @Override public void saveUser(User user) { jdbcTemplate.
	 * update("INSERT INTO TMSystem.events (event_name, created_by, created_date, updated_by, team_id)"
	 * + " VALUES (?, ?, ?, ? , ?)", user.getEvent_name(), user.getCreated_by(),
	 * user.getCreated_date(), user.getUpdated_by(), user.getTeam_id());
	 * System.out.println("I have reached here"); }
	 */


}
