package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Messageproperties {

	@Autowired
	MessageSource messageSource;
	
	@Autowired
	Point a;
	

	public Point getA() {
		return a;
	}

	
	public void setA(Point a) {
		this.a = a;
	}


	public MessageSource getMessageSource() {
		return messageSource;
	}

	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void execute() { 
		System.out.println("execute :");
		String message = this.messageSource.getMessage("vijay",null, null );
		System.out.println(message);
	}
  }
