package com.ranjeet;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*public class Triangle implements ApplicationContextAware, BeanNameAware{*/
/*public class Triangle implements InitializingBean, DisposableBean{*/
public class Triangle implements Shape{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;
	public Triangle() {
	// System.out.println("In Triangle constructor");
	}
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	/*
	public void draw(){
		for (Point point : points) {
			System.out.println(point);
		}
	}*/
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw(){
		
		System.out.print("Drawing Triangle : ");
		System.out.print(this.pointA);
		System.out.print(this.pointB);
		System.out.print(this.pointC);
		System.out.print(this.points);
	}

	/*@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		System.out.println("In ApplicationContextAware");
		this.context= context;
	}
	@Override
	public void setBeanName(String beanName) {
		
		System.out.println("Bean Name: "+ beanName);
		
	}*/

	/*@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("InitializingBean Init method called ");
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("DisposableBean destroy method called ");
		
	}*/
	
	/*private String type;
	private int height;
	public Triangle(){
		super();
	}
	public Triangle(String type){
		super();
		this.type= type;
	}
	public Triangle(int height){
		super();
		this.height=height;
	}
	public Triangle(String type, int height){
		super();
		this.type= type;
		this.height=height;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw(){
		System.out.println("Triangle drawn : Type: "+ type+ ", height: "+ height) ;
	}*/
	
	public void myInit(){
		System.out.println("MyInit called");
	}
	public void myDestroy(){
		System.out.println("MyDestroy called");
	}
}
