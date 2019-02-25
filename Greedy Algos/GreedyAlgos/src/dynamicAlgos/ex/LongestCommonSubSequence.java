package dynamicAlgos.ex;
//Using dynamic approach
public class LongestCommonSubSequence {
	static char[] arr1 = new char[] {'a','b','c','d','e','g'};
	static char[] arr2 = new char[] {'a','c','f','d','g'};
	static int[][] resArr = new int[arr1.length+1][arr2.length+1];
	public static void main(String[] args) {
		/*	System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(resArr.length+" - "+resArr[0].length);
		for(int i=0;i<resArr.length;i++) 
			for(int j=0;j<resArr[i].length;j++) {
				if(i==0 && j==0)
					resArr[i][j]=0;
			}
		printResMatrix();*/
		
		//initialize resArr;
		for(int i=0;i<resArr.length;i++) 
			for(int j=0;j<resArr[i].length;j++)
				if(i==0 && j==0)
					resArr[i][j]=0;

		int count = LCS();
		System.out.println("The longest Subsequence length is  : "+count);

		//Find result from resArr array....
		resArrCrawler();
	}
	static char[] res = new char[(arr1.length+arr2.length)];
	
	private static void resArrCrawler() {
		int temp = resArr[resArr.length-1][resArr[0].length-1];
		int i=resArr.length-1,j=resArr[0].length-1;
		int k=0;
		while(temp!=0) {
			/*System.out.println(" i="+i+",j="+j+", temp = "+temp);*/
			if(temp == resArr[i-1][j] || temp == resArr[i][j-1]) {
				if(temp == resArr[i-1][j]) {
					temp = resArr[i-1][j]; 
					i--;
				}else {
					temp = resArr[i][j-1]; 
					j--;
				}
			}
			else if(temp == (resArr[i-1][j-1]+1)){
				//add 'i'th value to the stack
				res[++k] = arr1[i-1]; 
				//change ith and jth index to i-1 and j-1;
				i--;j--;
				//temp value = resArr[i-1][]j-1]
				temp = resArr[i][j];	
			}else {
			}
		}
		System.out.println("The longest subsequence is : ");
		printRes();
	}

	private static void printRes() {
		for(int i=res.length-1;i>=0;i--) {
			if(res[i]!='\0')
				System.out.print(res[i]+" ");
		}
	}

	private static int LCS() {
		//generate resArr
		for(int i=1;i<resArr.length;i++) {
			for(int j=1;j<resArr[i].length;j++) {
				/*System.out.println(arr1[i-1]+" - "+arr2[j-1]);*/
				if(arr1[i-1] == arr2[j-1])
					resArr[i][j] = resArr[i-1][j-1]+1;
				else
					resArr[i][j] = max(resArr[i-1][j],resArr[i][j-1]);
			}
		}
		/*printCharArr();*/
		System.out.println("The Resultant Matrix is : ");
		printResMatrix();
		System.out.println("------------------------");
		return resArr[resArr.length-1][resArr[0].length-1];
	}

	private static void printCharArr() {
		System.out.println("arr1 : ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\narr2 : ");
		for(int j=0;j<arr2.length;j++) { 
			System.out.print(arr2[j]+" ");
		}
		System.out.println();
	}

	private static void printResMatrix() {
		// TODO Auto-generated method stub
		for(int i=0;i<arr1.length+1;i++) {
			for(int j=0;j<arr2.length+1;j++) { 
				System.out.print(resArr[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int max(int i, int j) {
		if(i<j)
			return j;
		else 
			return i;
	}
}
