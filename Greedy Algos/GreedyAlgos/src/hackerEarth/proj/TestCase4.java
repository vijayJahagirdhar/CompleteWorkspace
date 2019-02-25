package proj;

import java.util.*;


public class TestCase4 {

	public static long getResult(long N,long A,long B) {
		long result=0;
		long count=0;
		
		
		//raw
		long cur=0;
		long prev=0;
		/*for(long i=N,j=0; i>=0 && j<N ;i--,j++) {
			count++;
			cur=(long) (A*Math.pow(i, 2)+B*Math.pow(j, 2));
			System.out.prlongln("i : "+i+" j : "+j+" cur : "+cur+" prev :"+prev);
			if(j==0)
				prev=cur+1;

				if(cur>prev)
					break;
				prev=cur;
		}*/



		if(A>B) {
			for(long i=0,j=N; i<N && j>=0 ;i++,j--) {
				count++;
				cur=(long) (A*Math.pow(i, 2)+B*Math.pow(j, 2));
				System.out.println("i : "+i+" j : "+j+" cur : "+cur+" prev :"+prev);
				if(i==0)prev=cur+1;
				if(cur>prev)break;
				prev=cur;
			}
		}else if(B>A){
			for(long i=N,j=0; i>=0 && j<N ;i--,j++) {
				count++;
				cur=(long) (A*Math.pow(i, 2)+B*Math.pow(j, 2));
				System.out.println("i : "+i+" j : "+j+" cur : "+cur+" prev :"+prev);
				if(j==0)prev=cur+1;
				if(cur>prev)break;
				prev=cur;
			}
		}else {
			if(N%2==0)
				prev=(long) (A*Math.pow(N/2, 2)+B*Math.pow(N/2, 2));
			else
				prev=(long) (A*Math.pow(N/2+1, 2)+B*Math.pow(N/2, 2));
		}

		result=prev;
		System.out.println("result: count : "+count);
		return result;
	}


	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		long[]  finalResult= new long[tc];

		for(int i=0;i<tc;i++) {
			long N= sc.nextInt();
			long A=sc.nextInt();
			long B=sc.nextInt();
			if(N!=0)
				finalResult[i]=getResult(N, A, B);
			else
				finalResult[i]=0;	
		}

		for(long i:finalResult) {
			System.out.println(i);
		}
	}
}
