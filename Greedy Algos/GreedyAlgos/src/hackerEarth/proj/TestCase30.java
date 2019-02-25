package proj;

import java.util.Scanner;

/**
 * @author Vijay
 * SUVO and SUVOJIT
 *  */
public class TestCase30 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int tc=s.nextInt();
		String[] str=new String[tc];
		for(int i=0;i<tc;i++)
			str[i]=s.next();
		for(int i=0;i<tc;i++) {
			getCheck(str[i]);
		}
	}

	private static void getCheck(String string) {
		int SUVOCount=0;
		int SUVOJITCount=0;
		
		string=string.toUpperCase();
		int len=string.length();
		System.out.println();
		System.out.print("Message : "+string+" \n");
		for(int i=0;i<string.length();i++) {
			String substr2="";
			String substr1="";
			/*System.out.println(string.charAt(i));*/
			if(string.charAt(i)=='s' || string.charAt(i)=='S') {
				if((i+4)<=len) 
					substr1=string.substring(i,i+4);
				if(substr1.equalsIgnoreCase("SUVO")) {
					System.out.print(" str1: "+substr1+" ");
					if((i+7)<=len) {
						substr2=string.substring(i,i+7);
					}
					System.out.print(" str2: "+substr2+" ");
					if(substr2.equalsIgnoreCase("SUVOJIT"))
						SUVOJITCount++;
					else
						SUVOCount++;					
					System.out.print(" count:SUVO:"+SUVOCount+" SUVOJIT:"+SUVOJITCount+"] ");
					System.out.println();
				}
			} 
		}
		System.out.println("---------------------------------------");
		System.out.println("SUVO = "+SUVOCount+", SUVOJIT = "+SUVOJITCount);
		System.out.println("--------------------------------------");
	}

}
