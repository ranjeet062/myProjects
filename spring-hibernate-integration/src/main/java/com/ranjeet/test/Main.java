package com.ranjeet.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ranjeet.dao.CircleDao;
import com.ranjeet.dao.CircleDaoImpl;
import com.ranjeet.model.Circle;

public class Main {

	public static void main(String[] args) {

       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		CircleDao circleDAO = context.getBean(CircleDaoImpl.class);
		
		/*Circle circle = new Circle();
		for(int i=1; i<=10; i++){
			circle.setName("TEST_USER"+ i);
			circle.setId(i);
			circleDAO.save(circle);
		}*/
		
		List<Circle> listPerson = circleDAO.listPerson();
		for (Circle circle : listPerson) {
			System.out.println(circle);
		}
		
		
		
	}

}
