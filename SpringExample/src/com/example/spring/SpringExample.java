package com.example.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringExample {

	public static void main(String[] args) {
		
		//Using Bean Factory
		/*BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle=(Triangle) beanFactory.getBean("triangle");*/
		
		//Using Application Context
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
	//	ListTriangle triangle=(ListTriangle) app.getBean("listTriangle");
		
		//ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Shape shape= (Shape) context.getBean("circle");
		Messageproperties ms=(Messageproperties) context.getBean("messageproperties");
	//	Shape shape= (Shape) context.getBean("triangle");
		shape.draw(ms);
		
		
	}

	
}
