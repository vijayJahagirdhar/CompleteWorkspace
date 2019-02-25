package proj;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author VIJAY
 *BooBoo and Upsolving
 */
public class TestCase19 {

	static  long[] a;
	static int N =0;
	static int M = 0;
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		N = s.nextInt();
		M = s.nextInt();
		String[] temp=new String[N];
		//a=new double[N];
		for(int i=0;i<N;i++) {
			temp[i]=s.next();
			a[i]=Integer.parseInt(temp[i]);
		}
		
		System.out.println("--------");
		/*double T=maxArray();
		System.out.println("T : "+T);
		
		int days=0;
		double result=0;
		//logic
		for(double i=T;;i++) {
			System.out.println("For T :"+T);
			days=compute(i);
			if(days<=M) {
			    result=T;
				break;
			}else
				continue;
		}
		//result
		System.out.println(result);*/
	}
	/*private static int compute(double T) {
		int days=0;
		int total=0;
		for(int i=0;i<N;i++) {
			if((total+a[i]<=T) && a[i]<T) {
				if((total+a[i])==T) {
				   days++;
				   System.out.println("***"+days);
				   total=0;
				}
				else {
					total+=a[i];
				}
			}else {
				days++;
				System.out.println("***"+days);
				total=0;
				total+=a[i];
			}
		}
		return days;
	}
	private static double maxArray() {
	    double max=a[0];
		for(int i=1;i<N;i++)
	    	if(max<a[i])
	    		max=a[i];
		return max;
	}*/
}
