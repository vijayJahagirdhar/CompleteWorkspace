package proj;
import java.util.Scanner;
public class test {

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
			result[i]=binarySearch(temp,stones1);
		}
		for(int i=0;i<query;i++) 
			System.out.println(result[i]);
	}

	private static String binarySearch(int temp, int[] stones1) {
		int low =0;
		int high=stones1.length-1;
		int mid=0;
		String result="X";
		while(low<=high){
			if(low==(high-1)) {
				if(temp<=stones1[low]) {
					if(low%2==0)return "A";
					else return "B";
				}
				if(temp<stones1[high]) {
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
}
