package proj;

import java.util.Scanner;

public class TestCase9{

	
	static int[] item; 
	static int key;
	
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
	    int size=Integer.parseInt(s.nextLine());
	    item=new int[size];
	    for(int i=0;i<size;i++)
	    	 item[i]= s.nextInt();
	    key=s.nextInt();
	    for(int i=0;i<size;i++)
	    	if(key==item[i])
	    		System.out.println();
	    
	}
	
   
	
}


