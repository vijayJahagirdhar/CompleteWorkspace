package proj;

import java.util.Scanner;

public class TestCase16 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[] stones=new int[n]; 
		for(int i=0;i<n;i++)
			stones[i]=s.nextInt();
		int query = s.nextInt();
		int[] queries=new  int[query];
		for(int i=0;i<query;i++)
			queries[i]=s.nextInt();
		System.out.println("\narr : ");
		for(int i=0;i<n;i++)
			System.out.print(stones[i]+" ");
		System.out.println();
		int[] stones1=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			count+=stones[i];
			stones1[i]=count;
		}
		System.out.println("sum : ");
		for(int i=0;i<n;i++)
			System.out.print(stones1[i]+" ");
		String[] result=new String[query];
		int max=stones1[n-1];
		System.out.println();
		for(int i=0;i<query;i++) {
			int temp=(max-queries[i])+1;
			System.out.print("{temp: "+temp+" ==> \n");
			result[i]=binarySearch(temp,stones1);
			System.out.println();
		}
		System.out.println("result : ----");
		for(int i=0;i<query;i++) 
			System.out.println(result[i]);
 	}

	private static String binarySearch(int temp, int[] stones1) {
		String result="X";
		int low =0;
		int high=stones1.length-1;
		int mid=0;
		System.out.println("low : "+low+" high : "+high+"  mid : "+mid);
		while(low<high){
			print(low,high,stones1);
			        	if(low==high-1) {
				                           if(temp<=stones1[low]) {
				                        	   System.out.println(temp+"<"+stones1[low]+"   low:"+low);
					                                if(low%2==0)return "A";
					                                else return "B";
				                           }
				                           if(temp<stones1[high]) {
				                        	        System.out.println(temp+">"+stones1[high]+"  high:"+high);
					                                if(high%2==0)return "A";
					                                else return "B";
				  
				                           }
			                             }
			        	
			            mid= (int) Math.floor((low+high)/2);
			            if(temp<stones1[mid]){
                                    high=mid;
		            	}else if(temp>stones1[mid]) {
                                    low=mid+1;
		            	}else {
				              if(mid%2==0) {
					                 return "A";
				              }else {
					                 return "B";
				              }
		            	}
		}
		return result;
	}
 
	public  static void print(int low ,int high,int[] stones1) {
		
		System.out.print("(");
		for(int i=low;i<=high;i++) {
			System.out.print(" "+stones1[i]+" ");
		}
		System.out.print(")");
		
	}
	
}




//Using linear search...
/*import java.util.Scanner;
public class TestCase{

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[] stones=new int[n]; 
		for(int i=0;i<n;i++)
			stones[i]=s.nextInt();
		int query = s.nextInt();
		int[] queries=new  int[query];
		for(int i=0;i<query;i++)
			queries[i]=s.nextInt();
		int[] stones1=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			count+=stones[i];
			stones1[i]=count;
		}
		String[] result=new String[query];
        int max=stones1[n-1];
		for(int i=0;i<query;i++) {
			int temp=(max-queries[i])+1;
			for(int j=0;j<n;j++) {
				if(temp<=stones1[j]) {
					if(j%2==0) {
						result[i]="A";
						break;
					}else {
						result[i]="B";
						break;
					}
				}	
			}
		}
		for(int i=0;i<query;i++) 
			System.out.println(result[i]);
	}
}*/

