package proj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestCase7{

	static int[] count=new int[31];

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfLines=Integer.parseInt(sc.nextLine());
		//Map<Integer,String> m =new HashMap<Integer,String>();
		String[] lines=new String[noOfLines];
		for(int i=0;i<noOfLines;i++) {
			lines[i]=sc.nextLine();           
		}

		for(int i=0;i<noOfLines;i++) {
			String process=lines[i] ;
			String[] words = process.split(" ");
			for(int j=0;j<words.length;j++) {
				String gender = words[0].substring(0,1);
				if(isNumericOne(words[j])) {
					compute(gender,words[j]);
				}
			}
		}

		List<Integer> list=new ArrayList<>();
		for(int i=0;i<31;i++)
			if(count[i]!=0)list.add(count[i]);

		int Bigger=0;
		if(list.size()!=0) {
		Collections.sort(list);
		Bigger=list.get(list.size()-1);
		
		if(count[19]==Bigger || count[20] == Bigger)
			System.out.println("Date");
		else
			System.out.println("No Date");
		}else
			System.out.println("No Date");

	}
	private static void compute(String gender, String dat) {
		int date = Integer.parseInt(dat);
		count[0]=0;
		if(gender.equalsIgnoreCase("g"))count[date] +=2;
		if(gender.equalsIgnoreCase("m"))count[date] ++;
	}


	public static boolean isNumericOne(String s) {
		return s.matches("\\d+");      
	}

}




