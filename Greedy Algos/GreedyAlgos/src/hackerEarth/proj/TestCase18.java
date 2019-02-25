package proj;
import java.util.Arrays;
import java.util.Scanner;
public class TestCase18 {
	static int[] arr;
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		int n= s.nextInt();
		arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		Arrays.sort(arr);
		int query=s.nextInt();
		int[] queries=new int[query];
		for(int i=0;i<query;i++)
			queries[i]=s.nextInt();
        for(int i=0;i<query;i++){
        	int count=0;
    		int index=0;
        	int temp=queries[i];
        	for(int j=0;j<n;j++) {
        		if(temp>=arr[j]) {
        			count+=arr[j];
        			if(j==(n-1))
        			  index=j+1;
        		}else {
                    index=j;        		
        			break;
        		}
        	}
        	System.out.println(index+" "+count);
        }
	}
	/*private static void binarySearch(int temp) {
		int low=0;
		int high=arr.length;
		int mid=(int) Math.floor((low+high)/2);
		while(low<=high) {
			if(temp<arr[mid]) {
				high
			}else if(temp>arr[mid]) {
				
			}else {
				
			}
		}
	}*/
}
