package com.springmvc.daoImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springmvc.configuration.WebApplicationInitializer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebApplicationInitializer.class)
public class EventDaoImplTests {
	
	private Logger  logger = LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void contextLoads() {
		logger.info("The Test is Running now.......}");

	}

}
