package com.example.serializable.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.example.serializable.model.Employee;

public class Util {

	public String serialize(Employee e) {
	
		
		FileOutputStream outputStream;
		try {
			outputStream = new FileOutputStream("E:\\Spring_Boot\\HandsOn\\Algorithms\\docs\\b.txt");
			ObjectOutputStream out1=new ObjectOutputStream(outputStream);
			out1.writeObject(e);
			out1.close();
			outputStream.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return "SUCCESS";
		
	}
	
	public String deSerialize() {
		
		FileInputStream in;
		Employee e=new Employee();
		try {
			in = new FileInputStream("E:\\Spring_Boot\\HandsOn\\Algorithms\\docs\\b.txt");
			ObjectInputStream inp=new ObjectInputStream(in);
			e=(Employee) inp.readObject();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e.toString();
		
	}
	
}
