package com.ranjeet.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.ranjeet.dao.HibernateDaoImpl;
import com.ranjeet.dao.JdbcDaoImpl;
import com.ranjeet.dao.SimpleJdbcDao;
import com.ranjeet.model.Circle;
import com.ranjeet.model.User;

public class Main {

	public static void main(String [] args){
		/*Circle circle = new JdbcDaoImpl().getCircle(1);
		System.out.println(circle.getName());*/
		
		/*User user = new JdbcDaoImpl().getUser(1);
		System.out.println(user.getUserName());*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl dao= ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		/*User user = dao.getUser(1);
		System.out.println(user.getUserName());*/
		 
		/*System.out.println("get User by Id: "+dao.getUserById(1));
		System.out.println("get useList: "+dao.getListUser());
		System.out.println("get userName: "+dao.getUserName(1));*/
		
		/*dao.insertUser(new User(100, "TETS_USER"));*/
		
		/*dao.createCircleTable();*/
		
		/*dao.insertToCircleTable(new Circle(2, "circle-1"));*/
		
		/*SimpleJdbcDao simpleJdbcDao =ctx.getBean("simpleJdbcDao", SimpleJdbcDao.class);
		System.out.println(simpleJdbcDao.getCircleCount());*/
		
		HibernateDaoImpl hDao= ctx.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		//System.out.println(hDao.getCircleCount());
		
		
		
	}
}
