package proj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Vijay
 * The Normal Type
 * Brute Force
 */
public class TestCase29 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) 
			arr[i]=s.nextInt();
		int unique=0;
		unique=getUnique(arr,0,arr.length);
		System.out.println("unique elements : "+unique);
		int result=0;
		result=getSubArrayCount(arr,unique);
		System.out.println(result);
	}

	private static int getSubArrayCount(int[] arr,int unique) {
		List<Integer> list=new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		int itr=0;
		int result=0;
		int num=0;
		int prev=0;
		for(int i=0;i<arr.length;i++) {
			int a2=Integer.parseInt((i-1)+""+arr.length);
			System.out.print("arr["+i+"]  : "+list1.contains(a2)+" : ==> ");
			if(list1.contains(a2) || i==0) { 
			for(int j=i+(unique-1);j<arr.length;j++) {
				//System.out.print("arr["+i+","+j+"]  : ");
				int count=0;
				if(i==j) {
					if(unique==1)
						result++;
				}else{
					if(((j-i)+1)>=unique) {
						int a1=Integer.parseInt((i-1)+""+j);
						//System.out.print(" -->"+list.isEmpty()+" "+list.contains(a1)+"  ");
						if(list.contains(a1) || i==0) {
							itr++;
							count=getUnique(arr,i,(j+1));
					//		System.out.print(" count: "+count+" ");
							if(count==unique) {
								String a = i+"";
								String b = j+"";
								num = Integer.parseInt(a+b);
								list.add(num);
								result++;
							}
						}
					}
				}
			
				//System.out.println();
				
			}
			}
			System.out.print("prev : "+prev+" result :  "+result);
			if(prev==0) {
			    prev=result;
			    //System.out.println(">>>>>>>>>>>>>>>>prev:"+prev);
			    int a3=Integer.parseInt(i+""+arr.length);
				list1.add(a3);
			}
			else if(result>prev) {
				prev=result;
				int a3=Integer.parseInt(i+""+arr.length);
				list1.add(a3);
			}else if(prev==result) {
				//System.out.println("shouldnot come here");
				break;
			}else {
				
			}
				System.out.println();
			
		}

		System.out.println();
		/*System.out.println("List : ");
		list.iterator().forEachRemaining(action -> System.out.println(action));*/
		System.out.println();
		System.out.println("Total itr : "+itr);
		System.out.println();
		return result;
	}

	private static int getUnique(int[] arr,int low,int high) {
		int unique=0;
		List<Integer> arrList=new ArrayList<Integer>();
		for(int i=low;i<high;i++){
			if(arrList.size()==0) {
				arrList.add(arr[i]);
				unique++;
			}else {
				if(arrList.contains(arr[i])) {
					arrList.add(arr[i]);	
				}else {
					arrList.add(arr[i]);
					unique++;
				}
			}
		}
		return unique;
	}
}
