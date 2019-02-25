/*package proj;

import java.util.Scanner;

 */
/**
 * @author Vijay
 * Monk and Search
 *//*
public class TestCase32 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] arr=new int[] {1,2,3,4};
		int x=s.nextInt();
		int y=s.nextInt();
		int count=0;
		if(x==0) {
			for(int i=0;i<arr.length;i++) {
                     if(arr[i]>=y) {
                    	 count++;
                     }
			}
		}else if(x==1) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>y) {
               	 count++;
                }
			}
		}
		System.out.println(count);

	}
}
  */

/*package proj;
import java.util.Arrays;
import java.util.Scanner;
 *//**
 * @author Vijay
 * Monk and Search
 *//*
public class TestCase32 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=s.nextInt();
		Arrays.sort(arr);
		int query=s.nextInt();
		int[] result=new int[query];
		for(int i=0;i<query;i++) {
			int x=s.nextInt();
			int y=s.nextInt();
		//	System.out.println("Query "+i+" x:"+x+" y:"+y);
			int count=0;
			count=binarySearch(y,arr);
			if(x==0) {
				if(count==-1) {
					count=0;	
				}else {
					count=arr.length-count;
				}
			}if(x==1) {
				if(count==-1) {
					count=0;	
				}else {
					count=arr.length-(count+1);
				}
			}
			result[i]=count;
		}
		for(int i=0;i<query;i++)
			System.out.println(result[i]);
	}
	private static int binarySearch(int y, int[] arr) {
		int low=0;
		int high=arr.length-1;
		int count=0;	
		while(low<=high) {
			int mid=(int)Math.floor((low+high)/2);
		  if(arr[mid]>=y) {
				if(mid==low)
					return mid;
				high=mid;
			}else {
				if(mid==high)
					return -1;
				low=mid+1;
			}
		}	
		return count;
	}
}
  */






package proj;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Vijay
 * Monk and Search
 */
public class TestCase32 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=s.nextInt();
		
		Arrays.sort(arr);
         
		int query=s.nextInt();
		int[] result=new int[query];
		for(int j=0;j<query;j++) {
			int x=s.nextInt();
			int y=s.nextInt();
			System.out.print("Query["+(j+1)+"] "+" x:"+x+" y:"+y);
            result[j]=logic(x,y,arr);
            System.out.println();
		}
	/*	
		for(int j=0;j<arr.length;j++)
			System.out.println(result[j]);*/
	}

	private static int logic(int x, int y, int[] arr) {
		int count=0;
		if(x==0) {
			for(int i=0;i<arr.length;i++) {
	                 if(arr[i]>=y) {
	                	 count++;
	                 }
			}
		}else if(x==1) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>y) {
	           	 count++;
	            }
			}
		}
		System.out.print(" count:"+count);
		return count;
	}
	
	
	
}