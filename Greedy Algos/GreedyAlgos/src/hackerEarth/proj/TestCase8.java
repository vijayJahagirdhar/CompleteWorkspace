package proj;

import java.util.Arrays;
import java.util.Scanner;

public class TestCase8 {

	
	static int[] item; 
	static int key;
	
	
	public static void main(String[] args) {
		
		
		Scanner s =new Scanner(System.in);
	    int size=Integer.parseInt(s.nextLine());
	    
	    
	    	 String arr= s.nextLine();
	    	 String[] str = arr.split(" ");
	    	 int len=str.length;
	    	 item=new int[len];
	    	 for(int i=0;i<len;i++) {
	    		 item[i]=Integer.parseInt(str[i]);
	    	 }
	    	 Arrays.sort(item);
	    	 
	    key=Integer.parseInt(s.nextLine());
       
	    int res=binarySearch( 0, size);
	    System.out.println("res : "+res);
	    
	}
	
     static int binarySearch(double start,double end) {
    	 int mid=(int) Math.floor((start+end)/2);
    	 System.out.println("start : "+start+" end : "+end+" middle : "+mid);
        int result;
		
		if(item[mid]==key) {
			
		    result= mid;
		}
		else if(key>item[mid]) {
			System.out.println("key>item[mid] : "+key+" "+item[mid]);
			result=binarySearch(mid+1,end);
		}
		else {
			 result=binarySearch(start,mid-1);
		}
		return result;
	}
	
}




