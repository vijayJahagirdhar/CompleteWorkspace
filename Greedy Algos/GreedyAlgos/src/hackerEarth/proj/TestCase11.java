package proj;

import java.util.Arrays;
import java.util.Scanner;

public class TestCase11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		int[] arr=new int[n];
		String[] split=s.nextLine().split(" ");
		for(int i=0;i<n;i++)
		   arr[i]=Integer.parseInt(split[i]);
		Arrays.sort(arr);
		int max=0;
		int min=0;
		
		for(int i=0;i<n-1;i++) {
		System.out.println(arr[i]+" ");	
			min+=arr[i];
		}
		
		for(int i=n-1;i>0;i--) {
			System.out.println(arr[i]+" ");	
			max+=arr[i];
		}
		
		System.out.println(min+" "+max);
	}

}
