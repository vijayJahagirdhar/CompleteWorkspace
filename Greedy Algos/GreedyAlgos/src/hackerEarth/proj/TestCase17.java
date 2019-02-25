/*package proj;
import java.util.Scanner;
 *//**
 * @author VIJAY
 * Maximum submatrix
 *
 *//*
public class TestCase17 {
	static int[][] a;
	static int max=0;
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
		int c=sc.nextInt();
		max=sc.nextInt();
		a= new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
                a[i][j] = sc.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
                System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		//logic.
		//max length of matrix
		 int l=0;
		 int result=0;
	    	if(r==c) {
	    		l=r-1;
	    		System.out.println("r==c r: "+r+" c:"+c+" length : "+l);
	    		System.out.println("i ranges btw "+l+" to "+2);
	    		for(int i=l;i>0;i--) {
	    			System.out.println(">>>>>>>>>>>>>>>l("+i+") : <<<<<<<<<<<<<<<<<<");
	    			result=compute(i,r,c);
	    			if(result>0) 
	    				break;
	    		}
	    	}else if(r>c) {
	    		l=c;
	    		System.out.println("r>c r: "+r+" c:"+c+" length :[ "+l+" to 2 ]");
	    		for(int i=l;i>0;i--) {
	    			System.out.println(">>>>>>>>>>>>>>>l("+i+") : <<<<<<<<<<<<<<<<<<");
	    			result=compute(i,r,c);
	    			if(result>0) 
	    				break;
	    		}
	    	}else {
	    		l=r;
	    		System.out.println("c>r: "+r+" c:"+c+" length :[ "+l+" to 2 ]");
	    		for(int i=l;i>=0;i--) {
	    			System.out.println(">>>>>>>>>>>>>>>l("+i+") : <<<<<<<<<<<<<<<<<<");
	    			result=compute(i,r,c);
	    			if(result>0) 
	    				break;
	    		}
	    	}

	    //result..
	    System.out.println("result : "+result);


	}

	private static int compute(int l,int r,int c) {
    int result=-1;
    System.out.println("row ranges between 0 to "+(r-l+1));
    System.out.println("column ranges between 0 to "+(c-l+1));
		for(int i=0;i<=r-l;i++) {
			for(int j=0;j<=c-l;j++) {
				System.out.print("sum of matrix with length "+l+" and starting at index i:"+i+" j :"+j+" is :");
	             result=sum(i,j,l);
	            if(result>0)
	            	 return (l*l);
			}
		}

		return result;
	}

	private static int sum(int x, int y, int l) {
		int total=0;
		System.out.println();
		System.out.println("total of  a["+x+"]["+y+"] & a["+(x+(l-1))+"]["+(y+(l-1))+"] : ");
		System.out.println("---- i value is ranging between "+x+" to "+l);
		System.out.println("---- j value is ranging between "+y+" to "+l);
		System.out.println("---- max : "+max);

		for(int i=x;i<(l+x);i++) {
			for(int j=y;j<(l+y);j++) {
				if(total<=max) {
					total+=a[i][j];
				}
				else
					return -1;
			}
		}
		System.out.print("--> "+total);
		System.out.println();
		return total;
	}

}
  */







package proj;
import java.util.Scanner;
/**
 * @author VIJAY
 * Maximum submatrix
 *
 */
public class TestCase17 {
	static int[][] a;
	static int max=0;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		max=sc.nextInt();
		a= new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				a[i][j] = sc.nextInt();

		//logic : Sort array..
		
		}

}
