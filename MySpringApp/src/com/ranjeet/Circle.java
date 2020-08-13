package com.ranjeet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware{

	@Autowired
	private Point center;
	
	@Autowired
	private MessageSource messageSource;
	
	private ApplicationEventPublisher publisher;
	
	public Point getCenter() {
		return center;
	}


	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}


	//@Required
	/*@Autowired
	@Qualifier("CircleRelated")*/
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}


	@Override
	public void draw() {
		
		System.out.println("Drawing Circle: " +center);
		System.out.println(messageSource.getMessage("drawing.point",  new Object[]{center.getX(),center.getY()}, "default drawing.point", null));
		System.out.println(messageSource.getMessage("greeting", null, "default Greeting", null));
		DrawEvent event = new DrawEvent(this);
		publisher.publishEvent(event);
		
	}

	@PostConstruct
	public void init(){
		System.out.println("Init of Circle");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("Destroy of Circle");	
		}


	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher=publisher;
	}
}
