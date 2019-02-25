package proj;

import java.util.Scanner;

public class TestCase24 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int tc=s.nextInt();
		int[] result=new int[tc];
		for(int i=0;i<tc;i++) {
			int n=s.nextInt();
			long[] A=new long[n]; 
			long[] B=new long[n]; 

			for(int j=0;j<n;j++) 
				A[j]=s.nextLong();	
			for(int j=0;j<n;j++) 
				B[j]=s.nextLong();	

			result[i]=compute(A,B);
		}

		for(int i=0;i<tc;i++)
			System.out.println(result[i]);
	}

	private static int compute(long[] A, long[] B) {
		int max=0;
		int res=0;
		for(int i=0;i<A.length;i++) {
			long temp=A[i];
			for(int j=i;j<B.length;j++) {
				if(B[j]>=temp) {
					res=j-i;
					max=Math.max(res, max);
				}
				else {
					break;
				}
			}
		}
		return max;
	}

}
