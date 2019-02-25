package dynamicAlgos.ex;

import java.awt.print.Printable;
import java.lang.reflect.Array;

//Doing it with Linear Search
//This algo fails
/*public class LongestIncreasingSubSequenceProblem {
	public static int[] arr = new int[] {3,10,1,2,20};
	public static int[] lisArr  = new int[arr.length];
	public static int res=0;  

	public static void main(String[] args) {
		int count = LIS();
		System.out.println("count : "+count);
	}
	private static int LIS() {
		lisArr[0]=arr[0];
		int k = 0;
		int count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > lisArr[k]) { 
				lisArr[++k]=arr[i];
				count++;
			}
		}
		return count;
	}
}*/

//Using Dynamic programming 
//Time Complexity :  O(n^2)
public class LongestIncreasingSubSequenceProblem {
	public static int[] arr = new int[] {3,4,-1,0,6,2,3};
	public static int[] resArr  = new int[arr.length];  

	public static void main(String[] args) {
		//initialize result Array
		for(int i=0;i<arr.length;i++)
			resArr[i]=1;
		int count = LIS();
		System.out.println("count : "+count);
	}
	
	private static int LIS() {	
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					if(resArr[i]<resArr[j]+1)
						resArr[i]=resArr[j]+1;
				}
			}
		}
		/*print();*/
		return max();
	}

	/*private static void print() {
		for(int i=0;i<resArr.length;i++)
			System.out.println((i+1)+" - "+resArr[i]);
		System.out.println();
		
	}*/

	private static int max() {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<resArr.length;i++)
			if(resArr[i]>max)
				max=resArr[i];
		return max;
	}
	
//Using time complexity O(nlogn)
	
}