package dynamicAlgos.ex;

public class SubsetSumProblem {
	static int[] arr= new int[] {1,2,4,5,6,7,9};
	static int sum = 9;
	static boolean[][] resArr = new boolean[arr.length+1][sum+1];
	public static void main(String[] args) {

		//initialize  resArr for i=0 and j=0;
		for(int i=0;i<resArr.length;i++) 
			for(int j=0;j<resArr[i].length;j++) {
				if(i==0) {
					if(i==0 && j==0) 
						resArr[i][j]=true;
					else
						resArr[i][j]=false;
				}
				if(j==0)
					resArr[i][j]=true;
			}


		//printSubSetSumArr();
		//System.out.println("====================");

		boolean res =  subsetSum();
		System.out.println("-----------------------------------------");
		if(res)
			System.out.println("There exist a subset which sums upto "+sum);
		else
			System.out.println("No subset can sum upto "+sum);
		System.out.println("-----------------------------------------");
		//Find the subsets which can form the sum
		resArrCrawler();
	}
	private static void resArrCrawler() {
		System.out.println("SUBSETS are ..");
		int i=resArr.length-1,j=resArr[0].length-1;
		while(i>=0){
			if(resArr[i][j]!=false) {	
				if(arr[i-1]<=j){
					if(arr[i-1]==j){
						//add(i-1);
						System.out.println(arr[i-1]);
					}else if(arr[i-1]<j){
						System.out.print("{ "+arr[i-1]+" ");
						int temp=j;
						int k = i;
						while(temp > arr[k-1]) {
							temp = temp - arr[k-1];
							if(resArr[k-1][temp] && temp > arr[k-2]) {
								System.out.print(arr[k-2]+" ");
								k--;
							}else {
								System.out.print(temp+" ");
								break;
							}
						}
						System.out.print(" }");
						System.out.println();
					}
				}
			}
			i--;	
		}
	}
	private static boolean subsetSum() {

		for(int i=1;i<resArr.length;i++) {
			for(int j=1;j<resArr[i].length;j++) {
				if(arr[i-1]<=j) {
					if(arr[i-1]==j)
						resArr[i][j] = true;
					else {
						if(resArr[i-1][j-arr[i-1]])
							resArr[i][j] = true;
						else
							resArr[i][j]=false;
					}	
				}else{
					if(resArr[i-1][j])
						resArr[i][j] = true;
					else
						resArr[i][j] = false;
				}
			}
		}
		System.out.println("The final subset Array after processing...");
		printSubSetSumArr();
		return resArr[resArr.length-1][resArr[0].length-1];
	}
	private static void printSubSetSumArr() {

		System.out.print("      "/*"("+i+","+j+") "*/);
		for(int j=0;j<resArr[0].length;j++) {
			System.out.print(j+"    "/*"("+i+","+j+") "*/);
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		for(int i=0;i<resArr.length;i++) { 
			for(int j=0;j<resArr[i].length;j++) {
				if(i==0 && j==0)
					System.out.print(0+"   | ");
				else if(j==0)
					System.out.print(arr[i-1]+"   | ");
				System.out.print(get(resArr[i][j])+"    "/*"("+i+","+j+") "*/);
			}
			System.out.println();
		}
	}
	private static String get(boolean b) {
		if(b)
			return "T";
		else
			return "F";
	}
}
