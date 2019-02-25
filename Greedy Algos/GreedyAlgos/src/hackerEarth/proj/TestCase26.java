package proj;

import java.util.Scanner;

/**
 * @author VIJAY
 *Square Transaction
 */
public class TestCase26 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=s.nextInt();
		int q= s.nextInt();
		int[] qa=new int[q];
		for(int i=0;i<q;i++)
			qa[i]=s.nextInt();
		int[] sum=new int[N];
	    int count=0;
		for(int i=0;i<N;i++) {
			count+=arr[i];
			sum[i]=count;
		}
	
		int[] result=new int[q];
		//logic 
		for(int i=0;i<q;i++) {
			int temp=qa[i];
			result[i]=binarySearch(temp,sum);
		}
		
		System.out.println();
		for(int i=0;i<q;i++) {
			System.out.println(result[i]);
		}
	}
	private static int binarySearch(int temp, int[] sum) {
	    int result=0;
		int low=0;
	    int high=sum.length-1;
	    System.out.println();
	    System.out.print("{ For  Temp : "+temp+" ==> ");
	    while(low<=high) {
	    	int mid=(int) Math.floor((low+high)/2);
	    	System.out.print("low:"+low+"  high:"+high+" mid:"+mid+" --> ");
	    	if(sum[mid]==temp) {
	    		result=(mid+1);
	    		System.out.print(temp+" == "+sum[mid]+" result :"+result+"}");
	    		break;
	    	}else if(temp<sum[mid]) {
	    		System.out.print(temp+" < "+sum[mid]+" ");
	    		if(high==(low+1) || high==low) {
		    		if(temp<=sum[low]) {
		    			result=(low+1);
		    			System.out.print("result : "+result+" }");
		    			break;
		    		}else if(temp<=sum[high]){
		    			result=(high+1);
		    			System.out.print("result : "+result+" }");
		    			break;	
		    		}else {
		    			result=-1;
		    			System.out.print("result : "+result+" }");
		    			break;
		    		}
		    	}
	    		high=mid;
	    	}else{
	    		System.out.print(temp+" > "+sum[mid]+" ");
	    		if(high==(low+1) || high==low) {
		    		if(temp<=sum[low]) {
		    			result=(low+1);
		    			System.out.print("result : "+result+" }");
		    			break;
		    		}else if(temp<=sum[high]){
		    			result=(high+1);
		    			System.out.print("result : "+result+" }");
		    			break;	
		    		}else {
		    			result=-1;
		    			System.out.print("result : "+result+" }");
		    			break;
		    		}
		    	}
	    		low=mid+1;
	    	}
	    	System.out.println();
	    }
		return result;
	}

}







/*

import java.util.Scanner;

public class TestCase {

	static int count;

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		int len=Integer.parseInt(s.nextLine());
		String temp=s.nextLine();
		
		String[] split = temp.split(" ");
		int[] worth=new int[len];
		for(int i=0;i<len;i++) {
			worth[i]=Integer.parseInt(split[i]);
		}
		int query=Integer.parseInt(s.nextLine());
		int[] res=new int[query];
		int[] noOfQuery=new int[query]; 
		for(int i=0;i<query;i++) {
			noOfQuery[i]=Integer.parseInt(s.nextLine());
		}
		for(int i=0;i<query;i++) {
            count=0;
			int temp1=noOfQuery[i];
			res[i]=getCheck(temp1,worth,0);
		}
		for(int i=0;i<res.length;i++) 
			System.out.println(res[i]);
	}

	static int getCheck(int temp,int[] worth,int index){
		count+=worth[index];
		int result=-1;
		if(temp<=count) 
			result=(index+1);
		else if((index+1)<worth.length) 
			result=getCheck(temp, worth, ++index);
		return result;
	}
}
*/




