package com.ranjeet.gupta.main;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;

import com.ranjeet.gupta.Address;
import com.ranjeet.gupta.FourWheeler;
import com.ranjeet.gupta.LoginName;
import com.ranjeet.gupta.TwoWheeler;
import com.ranjeet.gupta.User;
import com.ranjeet.gupta.Vehical;

public class AppMain {

	static User userObj;
    static Session sessionObj;
    static SessionFactory sessionFactoryObj;
    
	public static void main(String[] args) {

		System.out.println("Hibernate app started-------");
		try{
			/*userObj = new User();
			userObj.setUsername("test User");*/
		sessionObj = buildSessionFactory().openSession();
		sessionObj.beginTransaction();

		//for(int i=6;i<= 10; i++){
			/*userObj = new User();
			userObj.setUsername("User-1");	
			userObj.setCreatedBy("Admin");
			userObj.setCreatedDate(new Date());
			userObj.setDescription("Hello");*/
			
			/*Vehical vehical = new Vehical();
			vehical.setVehicalName("CAR");*/
			//vehical.getUsers().add(userObj);
			
			/*Vehical vehical2 = new Vehical();
			vehical2.setVehicalName("Zeep");*/
			//vehical2.getUsers().add(userObj);
			
			/*userObj.getVehicals().add(vehical);
			userObj.getVehicals().add(vehical2);*/
			
			/*userObj.setVehical(vehical);*/
/*			Address address= new Address();
			address.setCity("Bangalore");
			address.setPin("560044");
			address.setState("KA");
			address.setStreet("Belandur");
			
			Address address2= new Address();
			address2.setCity("Bangalore-1");
			address2.setPin("560044-1");
			address2.setState("KA-1");
			address2.setStreet("Belandur-1");*/
			
			/*userObj.getAddresses().add(address);
			userObj.getAddresses().add(address2);*/
			/*userObj.setOfficeAddress(address2);*/
		
/*			LoginName loginName = new LoginName();
			loginName.setName("TEST");
			loginName.setEmailId("test@jda.com");
			
			userObj.setUserIdName(loginName);*/
			//sessionObj.persist(userObj);
			/*sessionObj.save(userObj);*/
			/*sessionObj.save(vehical);
			sessionObj.save(vehical2);*/
			
		//}
		
		/*Vehical vehical = new Vehical();
		vehical.setVehicalName("CAR");
		
		TwoWheeler bike = new TwoWheeler();
		bike.setVehicalName("Bike");
		bike.setSteeringWheeal("Bike Steering Handle");
		
		FourWheeler car = new FourWheeler();
		car.setVehicalName("Car");
		car.setSteeringHandle("Car Steering Handle");
		sessionObj.save(vehical);
		sessionObj.save(bike);
		sessionObj.save(car);*/
		
		/*for(int i=0; i< 10;i++){
			userObj = new User();
			userObj.setUsername("User "+i);
			sessionObj.save(userObj);
		}*/
		
		//User user = (User)sessionObj.get(User.class, 2);
		//sessionObj.delete(user);
		//user.setUsername("Updated User");
		
		//sessionObj.update(user);
		//System.out.println(user);
		
		//sessionObj.save(userObj);
		
		/*userObj.setUsername("Updated User");
		userObj.setUsername("Updated User Again");*/
		/*String  minUserId ="5 OR 1 = 1 ";*/
		String  minUserId ="5";
		String userName = "User 9";
		/*Query createQuery = sessionObj.createQuery("from User where userid > ? and username = ?");
		createQuery.setInteger(0, Integer.parseInt(minUserId));
		createQuery.setString(1, userName);*/
		
		/*Query createQuery = sessionObj.createQuery("from User where userid > :userId and username = :userName");
		createQuery.setInteger("userId", Integer.parseInt(minUserId));
		createQuery.setString("userName", userName);*/
		
		/*Query createQuery = sessionObj.getNamedQuery("user.byId");
		createQuery.setInteger("userid", Integer.parseInt(minUserId));*/
		
		/*Query createQuery = sessionObj.getNamedQuery("native.user.byid");
		createQuery.setInteger("userid", Integer.parseInt(minUserId));
		
		createQuery.setFirstResult(5);
		createQuery.setMaxResults(4);
		List<User> list = (List<User>)createQuery.list();
		for (User user : list) {
			System.out.println(user);
		}
		*/
		/*Criteria createCriteria = sessionObj.createCriteria(User.class);
		createCriteria.add(Restrictions.or(Restrictions.lt("userid", Integer.parseInt(minUserId)),
					Restrictions.gt("userid", 3)));
		List<User> list2 = (List<User>)createCriteria.list();
		for (User user : list2) {
			System.out.println(user);
		}*/
		
		/*Criteria createCriteria = sessionObj.createCriteria(User.class)
				.setProjection(Projections.property("userid"));
		List<Integer> list2 = (List<Integer>)createCriteria.list();
		for (Integer user : list2) {
				System.out.println(user);
				}*/

		/*Criteria createCriteria = sessionObj.createCriteria(User.class)
				.setProjection(Projections.property("username"))
				.addOrder(Order.desc("userid"));
		List<String> list2 = (List<String>)createCriteria.list();
		for (String user : list2) {
				System.out.println(user);
				}*/
		
		/*User user = new User();
	//	user.setUserid(6);
		user.setUsername("User%");
		
		Example example = Example.create(user).excludeProperty("userid");
		
		Example example = Example.create(user).enableLike();
		
		Criteria createCriteria = sessionObj.createCriteria(User.class)
				.add(example);
//				.setProjection(Projections.property("username"))
//				.addOrder(Order.desc("userid"));
		List<User> list2 = (List<User>)createCriteria.list();
		for (User user2 : list2) {
				System.out.println(user2);
				}*/
		
		/*User user = (User)sessionObj.get(User.class, 1);
		user.setUsername("updated usr");
		User user2 = (User)sessionObj.get(User.class, 1);
		
		
		sessionObj.getTransaction().commit();
		sessionObj.close();
		
		Session sessionObj2 = buildSessionFactory().openSession();
		sessionObj2.beginTransaction();
		User user2 = (User)sessionObj2.get(User.class, 1);
		
		
		sessionObj2.getTransaction().commit();*/
		
		
		Query query3 = sessionObj.createQuery("from User where userid =5");
		query3.setCacheable(true);
		List <User> user3 = (List <User>)query3.list();
		for (User user2 : user3) {
			System.out.println(user2);
		}
		
		sessionObj.getTransaction().commit();
		sessionObj.close();
		
		Session sessionObj2 = buildSessionFactory().openSession();
		sessionObj2.beginTransaction();
		Query query4 = sessionObj2.createQuery("from User where userid =5");
		query4.setCacheable(true);
		List <User> user4 = (List <User>)query4.list();
		for (User user2 : user4) {
			System.out.println(user2);
		}
		
		sessionObj2.getTransaction().commit();
		sessionObj2.close();
		
		/*user.setUsername("Updated");
		sessionObj = buildSessionFactory().openSession();
		sessionObj.beginTransaction();
		
		sessionObj.update(user);
		sessionObj.getTransaction().commit();*/
		//userObj.setUsername("Updated User after session");
//		sessionObj.close();
		
//		userObj = null;
//		sessionObj = buildSessionFactory().openSession();
//		//sessionObj.beginTransaction();
//		userObj = (User)sessionObj.get(User.class, 1);
//		System.out.println(userObj);
//		//sessionObj.close();
//		System.out.println(userObj.getAddresses());
		
		
		
		
		
		}catch (Exception sqlException) {
			if(null != sessionObj.getTransaction()) {
                System.out.println("\n.......Transaction Is Being Rolled Back.......");
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if(sessionObj != null || sessionObj.isOpen()) {
               //sessionObj.close();
            }
        }
	}
	
	private static SessionFactory buildSessionFactory(){
		Configuration configObj= new Configuration();
		configObj.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 
		 
        // Creating Hibernate SessionFactory Instance
        sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
        
        //sessionFactoryObj = new Configuration().configure().buildSessionFactory();
        return sessionFactoryObj;
	}

}
