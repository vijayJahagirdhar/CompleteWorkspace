package proj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestCase6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfLines=Integer.parseInt(sc.nextLine());
		//Map<Integer,String> m =new HashMap<Integer,String>();
		String[] lines=new String[noOfLines];
		for(int i=0;i<noOfLines;i++) {
			lines[i]=sc.nextLine();           
		}

		List<Message> list=new ArrayList<Message>();
		for(int i=0;i<noOfLines;i++) {
			String process=lines[i] ;
			String[] words = process.split(" ");
			for(int j=0;j<words.length;j++) {
				String gender = words[0].substring(0,1);
				if(isNumericOne(words[j])) {
					Message m=new Message();
					m.setDate(Integer.parseInt(words[j]));
					m.setGender(gender);
					list.add(m);
				}
			}
		}


		System.out.println("-------Messages----------");
		for(Message m:list) {
			System.out.println(m.getDate()+" "+m.getGender());
		}

		int count19=0;
		int count20=0;
		System.out.println("-----------------Map values-------------------");
		for(Message m:list){
			//System.out.println(m.getDate()+" "+m.getGender());
			if(m.getDate()==19){
				if(m.getGender().equalsIgnoreCase("g"))count19 += 2;
				if(m.getGender().equalsIgnoreCase("m"))count19 += 1; 
			}
			if(m.getDate()==20){
				if(m.getGender().equalsIgnoreCase("g"))count20 += 2;
				if(m.getGender().equalsIgnoreCase("m"))count20 += 1; 
			}

		}


		System.out.println("-----------------Results-----------------------");

		System.out.println("count19 = "+count19+" count20 ="+count20);
		
		if(count19 >0 || count20 >0) {
			if(count19==count20)
				System.out.println("No Date");
			else
				System.out.println("Date");
		}
		else
			System.out.println("No Date");

	}

	public static boolean isNumericOne(String s) {
		return s.matches("\\d+");      
	}

}

class Message {
	private int date;
	private String gender;

	@Override
	public String toString() {
		return "Message [date=" + date + ", gender=" + gender + "]";
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}

