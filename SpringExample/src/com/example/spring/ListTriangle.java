package com.example.spring;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ListTriangle /*implements InitializingBean,DisposableBean*/ {

	List<Point> list;

	@Override
	public String toString() {
		return "ListTriangle [list=" + list + "]";
	}

	public List<Point> getList() {
		return list;
	}

	public void setList(List<Point> list) {
		this.list = list;
	}

	/*@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("call thhis first");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ended");
	}*/
	
	public void myInit() {
		System.out.println("init");
	}
	
	public void mydestroy() {
		System.out.println("destroy");
	}
	
}
