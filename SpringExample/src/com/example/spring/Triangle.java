package com.example.spring;

import org.springframework.beans.factory.InitializingBean;

public class Triangle  implements /*InitializingBean,*/Shape{

    	private Point pointA;
    	private Point pointB;
    	private Point pointC;
    	
    	

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



	



	/*@Override
	public void afterPropertiesSet() throws Exception {
	System.out.println("initializing bean  when init method iss called for triangle");
	}*/



	@Override
	public void draw(Messageproperties ms) {
	System.out.println("Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]");
		
	}


}
