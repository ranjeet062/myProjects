package com.ranjeet;

import java.applet.AppletContext;
import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.ranjeet.factory.FactoryService;

public class DrawingApp {

	public static void main(String[] args) {

		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");*/
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		//Triangle triangle = (Triangle) context.getBean("triangle-alias");
		/*Triangle triangle = (Triangle) context.getBean("triangle1");
		triangle.draw();*/
		/*triangle = (Triangle) context.getBean("triangle");
		triangle.draw();*/
		
		/*Triangle triangle = (Triangle) context.getBean("triangle3");
		triangle.draw();*/
		/*Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();*/
		
		/*AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		context1.registerShutdownHook();
		Triangle triangle = (Triangle) context1.getBean("triangle");
		triangle.draw();*/
		
		AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		context1.registerShutdownHook();
		/*Shape shape = (Shape) context1.getBean("circle");
		shape.draw();
		System.out.println(context1.getMessage("greeting", null, "default Greeting", null));
		*/
		/*ShapeService shapeBean = context1.getBean("shapeService", ShapeService.class);
		Circle circle = shapeBean.getCircle();
		System.out.println("Print Circle's center: "+circle.getCenter());*/
		
		/*AnimalService animalBean = context1.getBean("animalService", AnimalService.class);
		System.out.println("Animal Object: " +animalBean);
		Animal animal = animalBean.getAnimal();
		animal.getName();
		HumanBeing human = animalBean.getHuman();
		//human.getName();
		human.setName("Human");
		human.setName1("Human1");*/
		
		FactoryService factory = new FactoryService();
		AnimalService service=  (AnimalService)factory.getBean("animalService");
		service.getAnimal();
	}

}
