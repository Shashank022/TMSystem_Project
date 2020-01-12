package com.springmvc.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.springmvc.daoImpl.EventDaoImpl;
import com.springmvc.daoImpl.TaskDaoImpl;
import com.springmvc.daoImpl.TeamDaoImpl;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.springmvc.*","com.springmvc.*.*"})
public class PersistenceConfig {
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://172.17.0.2:3306/TMSystem");
		dataSource.setUsername("root");
		dataSource.setPassword("mypass");
		return dataSource;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.scanPackages("com.springmvc.model");
		sessionBuilder.addProperties(getHibernateProperties());
		return sessionBuilder.buildSessionFactory();
	}
	
	@Autowired
	@Bean(name = "entityManager")
   public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
      LocalContainerEntityManagerFactoryBean em 
        = new LocalContainerEntityManagerFactoryBean();
      em.setDataSource(dataSource());
      em.setPackagesToScan(new String[] {"com.springmvc.model"});

      JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
      em.setJpaVendorAdapter(vendorAdapter);
      em.setJpaProperties(getHibernateProperties());
      return em;
   }

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		transactionManager.setDataSource(dataSource()); 
		return transactionManager;
	}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		properties.put("hibernate.format_sql", "false");
		properties.put("hibernate.default_schema", "TMSystem");
		return properties;
	}

	@Bean
	public HibernateTemplate hibernateTemplate() {
		return new HibernateTemplate(getSessionFactory(dataSource()));
	}
	
	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
		return new NamedParameterJdbcTemplate(dataSource());
	}
	
	@Autowired
	@Bean(name = "eventDao")
	public EventDaoImpl EventDao() {
		return new EventDaoImpl();
	}
	
	@Autowired
	@Bean(name = "teamDao")
	public TeamDaoImpl TeamDao() {
		return new TeamDaoImpl();
	}
	
	@Autowired
	@Bean(name = "taskDao")
	public TaskDaoImpl TaskDao() {
		return new TaskDaoImpl();
	}
	
}