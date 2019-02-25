package proj;

import java.util.Arrays;
import java.util.Scanner;

public class TestCase13 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		int[] arr=new int[n];
		String[] split=s.nextLine().split(" ");
		for(int i=0;i<n;i++)
		   arr[i]=Integer.parseInt(split[i]);
		Arrays.sort(arr);
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int cur=0;
		int prev=0;	
		int setSize=0;
		
		for(int i=n-1;i>=0;i--) {
			cur=arr[i]+prev;
			if(cur>prev) {
				setSize++;
				prev=cur;
				continue;
			}
			else
				break;
		}
		if(setSize ==0 )setSize=1;
		System.out.println("");
		System.out.println("result = "+prev+" "+setSize);
	}

}
