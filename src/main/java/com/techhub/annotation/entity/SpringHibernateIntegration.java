package com.techhub.annotation.entity;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@EnableTransactionManagement
@ComponentScan({"com.techhub.annotation.entity"})// scan configuration package
@PropertySource(value = { "classpath:hibernate.properties" })
public class SpringHibernateIntegration {
	  @Autowired
	    private Environment environment; 
	/*@Bean
	    public DataSource dataSource() {
	    	   
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/student_info");
	        dataSource.setUsername("root");
	        dataSource.setPassword("root");
	        return dataSource;
	    }*/
	
	 @Bean
	    public DataSource dataSource() {
	    	   
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
	        dataSource.setUrl(environment.getProperty("jdbc.url"));
	        dataSource.setUsername(environment.getProperty("jdbc.username"));
	        dataSource.setPassword(environment.getProperty("jdbc.password"));
	        
	    	
	        
	        return dataSource;
	    }

	 
	 public  Properties hibernateProperties() {
		 Properties pobj=new Properties();
		 pobj.put("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl"));
		 pobj.put("hibernate.show_sql", environment.getProperty("hibernate.show_sql") );
		 pobj.put("hibernate.dialect", environment.getProperty("hibernate.dialect"));  
		 return pobj;
		  
	 }
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		sf.setDataSource(dataSource());
		sf.setHibernateProperties(hibernateProperties());
		sf.setPackagesToScan(new String[] {"com.techhub.annotation.entity"});// scan entity classes
		return sf;
	}
	
	@Bean
	HibernateTransactionManager hibernateTransactionManager(SessionFactory s) {
		HibernateTransactionManager tobj=new HibernateTransactionManager();
		tobj.setSessionFactory(sessionFactory().getObject());
		return tobj;
	}
}
