package greedyAlgos.ex;

/*public class CatalanNumbersToSearchNumberOfBinaryTress {
	public static void main(String[] args) {
		int n  = 3;
		int res = BST(n);
		System.out.println("RES:"+res);
	}
	private static int BST(int n) {
	    int res;
		if (n<=1) {
			return 1;
		}else {
			for(int i=0;i<n;i++) {
				res += BST(i)*BST(n-i-1);		
			}
		}
		return res;	 
	}
}*/


//



/*public class CatalanNumbersToSearchNumberOfBinaryTress {
	public static void main(String[] args) {
		int n  = 4;
		int res = BST(n);
		System.out.println("RES:"+res);
	}
	private static int BST(int n) {
		int a=n*2,b=n+1,c=n;
		int res = fact(a)/(fact(b)*fact(c));
		return res;
	}
	private static int fact(int n) {
		if(n<=1)
			return 1;
		else 
			return fact(n-1)*n;
	}
}*/

//Bottom Up approach ,.

public class CatalanNumbersToSearchNumberOfBinaryTress {
	public static int keySet = 6;
	public static int[] arr= new int[keySet+1]; 
	public static void main(String[] args) {
		int res = BST(keySet);
		print();
	}
	private static void print() {
		for(int i=0;i<arr.length;i++)
			System.out.println((i)+" - "+arr[i]);
		
	}
	private static int BST(int keySet2) {
		arr[0]=1;
		arr[1]=1;
		arr[2]=2;
		for(int i=3;i<=keySet;i++) {
			int res=0;
			for(int j=1;j<=i;j++) {
				System.out.println("arr["+(j-1)+"]*arr["+(i-j)+"]");
				res+=arr[j-1]*arr[i-j];
			}
			arr[i]=res;
		}
		return 0;
	}
	
}