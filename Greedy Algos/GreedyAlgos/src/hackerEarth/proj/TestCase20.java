package proj;

import java.util.Arrays;
import java.util.Scanner;

public class TestCase20 {

	static int N;
	static int Q;
	static int[] arr;
	static int[] query;
	static String[] binary;
	static int[] result;
	public static void main(String[] args) {


		Scanner s= new Scanner(System.in);
		N=s.nextInt();
		Q=s.nextInt();
		arr = new int[N];
		binary = new String[N];

		for(int i=0;i<N;i++) {
			arr[i] = s.nextInt();
			binary[i] = Integer.toBinaryString(arr[i]);
		}
		System.out.println();
		System.out.println("binary : ");
		for(int i=0;i<N;i++) {
			System.out.println(binary[i]); 
		}

		computeResult(binary);
		System.out.println("-----------------------------");
		Arrays.sort(result);
		System.out.println("binary  size");
		for(int j=0;j<N;j++)
			System.out.print(result[j]+" ");		 

		System.out.println("----------------------------");
		query =new int[Q];
		int[] queryResults=new int[Q];
		int count;
		int total;
		
		query=new int[Q];
		for(int i=0;i<Q;i++)
			query[i]=s.nextInt();
		
		System.out.println("--------Q---------");
		for(int i=0;i<Q;i++)
			System.out.print(query[i]+" ");
		System.out.println("-----------------");
		
		for(int i=0;i<Q;i++) {
			total=0;
			count=0;
			System.out.println("Query{"+i+"} : "+query[i]+" --> ");
			for(int j=N-1;j>=0;j--) {
				if((total+result[j])>=query[i]) {
					total+=result[j];
					count++;
					System.out.print("1:total : "+total+" count: "+count+" XXX ");
					break;
				}else {
					total+=result[j];
					count++;
					System.out.print("0:total : "+total+" count: "+count+" XXX ");
					if(j==(0))
						total=-1;
				}
			}
			System.out.println();
			if(total>=0)
				queryResults[i]=count;
			else
				queryResults[i]=-1;
		}
System.out.println("-----------------------------------------------+");
		for(int i=0;i<Q;i++)
			System.out.println(queryResults[i]);
	}
	private static void computeResult(String[] binary) {
		int count=0;
		result=new int[N];
		for(int i=0;i<N;i++) {
			char[] a=binary[i].toCharArray();
			for(int j=0;j<a.length;j++) {
				if(a[j]=='1') 
					count++;
			}
			result[i]=count;
			count=0;
		}
	}
}