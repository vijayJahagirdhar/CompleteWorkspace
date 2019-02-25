package com.example.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}

//	@Resource(name="pointC")
   	@Autowired
	//@Qualifier("center")
	/*@Required*/
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw(Messageproperties ms) {
		// TODO Auto-generated method stub
	
		ms.execute();
		System.out.println("Circle is drawn");
		System.out.println("center"+center.toString());
	}

	
	//AS intialize and Destroy interface as we used to initize and destroy method to be called 
	//wen spring intializes and destroys the bean we can also use 
	//following annotations to perform same activity...

	@PostConstruct
	public void myinit() {
		System.out.println("init circle");
	}
	
	@PreDestroy
	public void mydestroy() {
		System.out.println("delete circle");
	}
	
	
}
