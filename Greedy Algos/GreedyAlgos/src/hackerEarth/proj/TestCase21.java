/*package proj;

import java.util.Scanner;

public class TestCase21 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int As=s.nextInt();
		int Q=s.nextInt();
		char A[] =s.next().toCharArray();
		char B[] =s.next().toCharArray();
System.out.println();
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
		for(int i=0;i<B.length;i++) {
			System.out.print(B[i]+" ");
		}
System.out.println("hi");
		int[] QA=new int[Q];
		for(int i=0;i<Q;i++) 
			QA[i]=s.nextInt();
		String[] result=new String[Q];
		
		
		//logic
		for(int i=0;i<Q;i++) {
			int temp=QA[i];
			for(int j=0;j<temp;j++) {
				B[j]='1';
			}
			String A1=new String(A);
			String B1=new String(B);
			System.out.println("Query["+i+"] -> "+B1);
			int x=A1.compareTo(B1);
			if(x==0)
				result[i]="YES";
			else
				result[i]="NO";
		}
		
		for(int i=0;i<Q;i++)
			System.out.println(result[i]);
		
	}

}
*/



package proj;

/*import java.util.Scanner;

public class TestCase21 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int As=s.nextInt();
		int Q=s.nextInt();
		char A[] =s.next().toCharArray();
		char B[] =s.next().toCharArray();
		int[] QA=new int[Q];
		for(int i=0;i<Q;i++) 
			QA[i]=s.nextInt();

		System.out.println("Count the number of 1's in A");
		
		
		//logic
		int count=0;
		for(int i=0;i<As;i++) {
			if(A[i]=='1')
				count++;
		}
		
		count=A.length;
		System.out.println(count);
	
		
          for(int i=0;i<Q;i++){
        	  int temp=QA[i];
        	  System.out.print("temp : "+temp+" count : "+count+"  ");
        	  if(temp!=count)
        	      System.out.print(" --> NO");
        	  else
        		  System.out.print("  --> YES");
        	  System.out.println();
          }
          
          System.out.println("count : "+count);

		
	}

}*/



import java.util.Scanner;
public class TestCase21{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int As=s.nextInt();
		int Q=s.nextInt();
		String A =s.next();
		String B =s.next();
		int[] QA=new int[Q];
		int count=A.length();
		for(int i=0;i<Q;i++) {
			QA[i]=s.nextInt();
			if(QA[i]!=count)
        	      System.out.println("NO");
        	  else
        		  System.out.println("YES");
		}
	}
}
