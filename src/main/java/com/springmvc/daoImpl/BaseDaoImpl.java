package com.springmvc.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDaoImpl {
	
	protected Logger  logger = LoggerFactory.getLogger(this.getClass());

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@PersistenceContext
	EntityManager em;

}
