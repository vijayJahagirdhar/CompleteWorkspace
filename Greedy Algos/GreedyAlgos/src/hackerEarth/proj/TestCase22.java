package proj;

import java.util.Scanner;

/**
 * @author VIJAY
 * Sumit and Chocolates
 */
public class TestCase22 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int noOfBoxes=s.nextInt();
		int[] chocs =new int[noOfBoxes];
		for(int i=0;i<noOfBoxes;i++) 
			chocs[i]=s.nextInt();

		//summing
		int count=0;
		int[] sum=new int[noOfBoxes];
		for(int i=0;i<noOfBoxes;i++) {
			sum[i]=count+chocs[i];
			count=sum[i];
		}

		System.out.println();
		System.out.println("chocs array : ");
		for(int i=0;i<noOfBoxes;i++)
			System.out.print(chocs[i]+" ");

		System.out.println();
		System.out.println("sum array:");
		for(int i=0;i<noOfBoxes;i++)
			System.out.print(sum[i]+" ");

		int q=s.nextInt();
		int[] qa=new int[q];

		for(int i=0;i<q;i++)
			qa[i]=s.nextInt();

		int[] result=new int[q];
		for(int i=0;i<q;i++) {
			result[i]=binary(sum,qa[i]);	       
		}
		System.out.println();
		for(int i=0;i<q;i++)
			System.out.println("Result = "+result[i]);

	}


	static int binary(int[] sum,int temp) {
		int low=0;
		int high=sum.length-1;
		System.out.println("low : "+low+"high: "+high);
		int result=0;
		//binary search
		while(low<=high) {
			int mid=(int) Math.floor((low+high)/2);
			System.out.println("mid : "+mid+" value["+mid+"] : "+sum[mid]);
			if(temp==sum[mid]) {
				System.out.println("temp==sum : temp : "+temp+" sum["+mid+"]"+sum[mid]);
				result=mid+1;
				break;
			}else if(temp>sum[mid]) {
				System.out.println("temp>sum : temp : "+temp+" sum["+mid+"]"+sum[mid]);
				if(mid==high) {
					result=-1;
					break;
				}else
					low=(mid+1);

			}else {
				System.out.println("temp<sum : temp : "+temp+" sum["+mid+"]"+sum[mid]);
				if(mid==low) {
					result=mid+1;
					break;
				}else
					high=mid;
			}
		}
		return result;
	}

}

