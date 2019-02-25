package dynamicAlgos.ex;
public class Knapsack10Dyn {
	static int[] weight=new int[] {1,3,4,5};
	static int[] profit = new int[]{1,2,4,4};
	static int capacity=7;
	static int[][] compute=new int[weight.length][capacity];
	public static void main(String[] args) {
		//initialize i=0 an j=0 of compute array
		knapsack();
	}
	private static void knapsack() {
		for(int i=0;i<weight.length;i++)
			for(int j=0;j<capacity;j++) {
				if(weight[i] <= (j+1)) {
					System.out.print(i+" - "+(j+1)+" - "+weight[i]+" -  "+profit[i]);
					//System.out.print(" j1 : "+j+" ");
					/*if(i!=0 && j!=0 && j-weight[i]>=0)*/
					if(i==0)
						compute[i][j]=profit[i];
					else
						compute[i][j]=max((profit[i]+compute[i-1][(j+1)-weight[i]]),compute[i-1][j]);
				}else {
					compute[i][j]=compute[i-1][j];
				}
				System.out.println(" ?? ");
			}
		printCompute();
	}
	private static void printCompute() {
		for(int i=0;i<weight.length;i++) {
			for(int j=0;j<capacity;j++) {
				System.out.print(compute[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static int max(int i, int j) {
		if(i>j)		
			return i;
		else 
			return j;
	}
}
