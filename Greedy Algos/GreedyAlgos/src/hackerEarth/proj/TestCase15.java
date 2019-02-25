package proj;

import java.util.Scanner;

public class TestCase15 {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		String str=s.nextLine();		
		int count=0;
		String[] arr= new String[n];
		for(int i=0;i<n;i++) {
			char ch=  str.charAt(i);
			arr[i]=ch+"";		
		}

		for(int i=0;i<n-3;i++)
			if(arr[i].equalsIgnoreCase(arr[i+2]) && arr[i+1].equalsIgnoreCase(arr[i+3]))count++;
		System.out.println(count);
	}
}
