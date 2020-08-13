package com.ranjeet.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ranjeet.model.Circle;

@Repository
public class CircleDaoImpl implements CircleDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Circle p) {
	
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(p);
		transaction.commit();
		session.close();
		
	}

	public List<Circle> listPerson() {
		Session session = this.sessionFactory.openSession();
		List<Circle> personList = session.createQuery("from Circle").list();
		session.close();
		return personList;
	}

}
