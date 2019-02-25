package proj;

import java.util.Scanner;

public class TestCase12 {


	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		String[] result= new String[n];
		int[] input=new int[n];
		for(int i=0;i<n;i++) 
			input[i]=Integer.parseInt(s.nextLine());
		for(int i=0;i<n;i++) {
			int num=input[i];
			String str=input[i]+"";
			if(num%21==0 || str.contains("21"))
				result[i]="The streak is broken!";
			else
				result[i]="The streak lives still in our heart!";
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(result[i]);
		}

	}
}
