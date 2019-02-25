package proj;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author VIJay
 *Maximum Sum
 */
public class TestCase27 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long[] arr=new long[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();

		Arrays.sort(arr);
		
		System.out.println();
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}

		long count=arr[n-1];
		long set=1;
		for(int i=(n-2);i>=1;i--) {
			if((count+arr[i])>=count) {
				count+=arr[i];
				set++;
				//System.out.println("count : "+count+" set:"+set);
			}else {
				//System.out.println("count : "+count+" set:"+set);
				break;
			}
		}
		
		int setZero=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count+=arr[i];
				setZero++;
			}
		}
		System.out.println("print Zeros ::"+setZero);

		System.out.println(count+" "+set);
	}
}


/*import java.util.Arrays;
import java.util.Scanner;

public class TestCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		int[] arr=new int[n];
		String[] split=s.nextLine().split(" ");
		for(int i=0;i<n;i++)
		   arr[i]=Integer.parseInt(split[i]);
		Arrays.sort(arr);
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
		if(setSize==0)setSize=1;
		System.out.println(prev+" "+setSize);
	}

}


 */