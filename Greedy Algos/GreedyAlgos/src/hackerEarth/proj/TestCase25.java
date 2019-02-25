package proj;

import java.util.Scanner;

/**
 * @author VIJAY
 * Counting Frog Paths
 *
 */
public class TestCase25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int s=sc.nextInt();
		int T=sc.nextInt();

		int result=0;
		if(X==0 && Y==0) {
			result=logic(T,s);
		}
		else {
			int sum=T-(X+Y);
			if(sum>=0)
			   result=logic(sum,s);
			else 
			   result=0;
		}
		System.out.println(result);
	}

	private static int logic(int T, int s) {
		System.out.println("T : "+T+" ,s :"+s);
	    int result=0;
		if(T < (2*s)) {
	    	result=compute(T,s);
	    }else {
	    	result=(int) Math.pow((s+1), 2);
	    }
		return result;
	}

	private static int compute(int T, int s) {
	    int mid=s;
	    int total=1;
	    int[] result=new int[mid+1];
	    result[0]=0;
		for(int i=1;i<=T;i++) {
			if(i<=mid) {
				total+=(i+1);
				result[i]=(i+1);
			}else {
				total+=result[(2*s)-i];
			}
			System.out.println("total["+i+"] :"+total);
		}
		
		/*for(int i=0;i<mid+1;i++)
		System.out.println(result[i]+" for  :i="+i);*/
		
		return total;
	}
}
