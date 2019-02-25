/*package proj;

import java.util.Scanner;

public class TestCase10 {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int len=Integer.parseInt(s.nextLine());
		String temp=s.nextLine();
		String[] split = temp.split(" ");
		int[] worth=new int[len];
		for(int i=0;i<len;i++) {
			worth[i]=Integer.parseInt(split[i]);
		}

		int[] dailyWorth=new int[len];
		dailyWorth[0]=worth[0];
		for(int i=1;i<len;i++) {
			int sum=0;
			int count=1;
			for(int j=0;j<=i;j++) {
				sum= sum + worth[j];
			}
			dailyWorth[i]=sum;
		}

		int query=Integer.parseInt(s.nextLine());
		int[] res=new int[query];

		System.out.println("daily Worth:");
		for(int i:dailyWorth)
			System.out.print(i +" ");
		System.out.println();
		for(int i=0;i<query;i++) {
			int temp1=Integer.parseInt(s.nextLine());
			System.out.println("temp1 : "+temp1);
			for(int j=0;j<dailyWorth.length;j++) {
				System.out.println("j = "+j+ " -----> "+temp1+" && "+dailyWorth[j]);
				if(temp1<=dailyWorth[j]) {
					res[i]=j+1;
					System.out.println("Ans: res["+i+"]"+res[i]);
					break;
				}
			}
			if(res[i]==0)
				res[i]=-1;
		}

		//result:

		System.out.println("result : ");
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}

	}

}


 */



// modified COde
package proj;

import java.util.Scanner;

public class TestCase10 {

	static long count;

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		int len=Integer.parseInt(s.nextLine());
		String temp=s.nextLine();
		
		String[] split = temp.split(" ");
		long[] worth=new long[len];

		
		
		for(int i=0;i<len;i++) {
			worth[i]=Integer.parseInt(split[i]);
		}
		
		
		/*System.out.println("\nWorth : ");
		for(int i=0;i<len;i++)  {
			System.out.print(worth[i]+" ");
		}*/

//System.out.println();
		int query=Integer.parseInt(s.nextLine());
		long[] res=new long[query];

		long[] noOfQuery=new long[query]; 
		for(int i=0;i<query;i++) {
			noOfQuery[i]=Integer.parseInt(s.nextLine());
		}
		
		/*System.out.println("\nqueries are : ");
		for(int i=0;i<query;i++) {
			System.out.print(noOfQuery[i]+" ");
		}
		System.out.println();*/

		for(int i=0;i<query;i++) {
	//		System.out.println("-------------------------");
     //       System.out.println("Iteration : "+(i+1));
            count=0;
			long temp1=noOfQuery[i];
	//		System.out.println("Query "+(i+1)+" : "+temp1);
			res[i]=getCheck(temp1,worth,0);
			
			
		}

		//result:
	//	System.out.println("--------------------------");
	//	System.out.println("result : ");
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	//	System.out.println("---------------------------");

	}

	static int getCheck(long temp,long[] worth,int index){
		count+=worth[index];
		int result=-1;
		//System.out.println("Index : "+index+" count : "+count);
		if(temp<=count) {
		  //  System.out.println("Result : "+(index+1));	
			result=(index+1);
           // System.out.println("if -> g("+index+") : result : "+result);
		}
		else if((index+1)<worth.length) {
			result=getCheck(temp, worth, ++index);
		//	 System.out.println("else if -> g("+index+") : result : "+result);
	    }
	//	System.out.println("final result for "+temp+" is : "+result);
		return result;
	}
}





