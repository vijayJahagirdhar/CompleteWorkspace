package proj;

import java.util.Arrays;
import java.util.Scanner;

public class TestCase23 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);	
		int N= s.nextInt();
		int Q=s.nextInt();
		int[] arr= new int[N];
		for(int i=0;i<N;i++)
			arr[i]=s.nextInt();
		int[] q=new int[Q];
		for(int i=0;i<Q;i++)
			q[i]=s.nextInt();
		
		String[] result= new String[Q];
		Arrays.sort(arr);
		for(int i=0;i<Q;i++)
		    result[i]=binarySearch(arr,q[i]);
		
		/*for(int i=0;i<Q;i++)
		System.out.println(result[i]);*/

	}

	private static String binarySearch(int[] arr, int temp) {
		int low=0;
		int high=arr.length-1;
		String result="NO";
		System.out.println("-----------------");
		while(low<=high) {
			int mid=(int) Math.floor((low+high)/2);
			System.out.print("{Mid:"+mid+",temp:"+temp+" ");
			if(temp==arr[mid]) {
				result="YES";
				System.out.print("temp==arr["+mid+"] }");
				break;
			}else if(temp>arr[mid]) {
				System.out.print("temp>arr["+mid+"] }");
				if(high==mid) {
					result="NO";
				}
				low=mid+1;
			}else {
				System.out.print("temp<arr["+mid+"] }");
				if(mid==low) {
					result="NO";
					break;
				}
				high=mid-1;
			}				
		}
		System.out.print(" -->result = "+result);
		System.out.println("---------------");
		System.out.println();
		return result;
	}
}
