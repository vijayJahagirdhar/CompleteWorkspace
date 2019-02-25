package com.example.serializable;
import com.example.serializable.model.Employee;
import com.example.serializable.service.Util;

public class Serializable {

	public static void main(String args[]) {
	Util util=new Util();
	Employee e=new Employee();
	e.setAge("10");
	e.setName("vijay");
	System.out.println("SERIALIZE: "+util.serialize(e));
	System.out.println("DESERIALIZE: "+util.deSerialize());
	}

}
