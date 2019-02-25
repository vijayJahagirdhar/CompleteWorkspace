package proj;
import java.util.Scanner;
/**
 * @author VI356794
 * Policemen and Thief........
 *
 */
public class TestCase14 {
	static int logic(int arrSize,int maxAway,Scanner s) {		
		String[] str=new String[arrSize];
		for(int i=0;i<arrSize;i++) {
			str[i]=s.nextLine();
		}
		int[] count=new int[arrSize];		
		int result=0;
		/*System.out.println("\n string : ");
		for(int i=0;i<arrSize;i++) {
			System.out.println("i : "+i);
			System.out.print("\n"+str[i]+" ");
		}*/
		System.out.println();
		for(int i=0;i<arrSize;i++) {	
			String[] row =str[i].split(" ");
			count[i]=0;
			for(int j=0;j<row.length;j++) {
				//System.out.println("-----> i value : "+i+" ------>j : "+j +" length of row :"+row[i].length());
				if(row[j].equalsIgnoreCase("T")) {
					for(int k=1;k<arrSize-j;k++) {
						if(row[j+k].equalsIgnoreCase("P")) {
							count[i]++;
							//System.out.println("\nrow{"+(j+1)+"} : "+ count[i]);
							row[j]="x";
							row[j+k]="x";
							break;
						}
					}
				}
				else if(row[j].equalsIgnoreCase("P")){
					for(int k=1;k<arrSize-j;k++) {
						if(row[j+k].equalsIgnoreCase("T")) {
							count[i]++;
							//System.out.println("row{"+(j+1)+"} : "+ count[i]);
							row[j]="x";
							row[j+k]="x";
							break;
						}
					}
				}
				System.out.print(row[j]+" ");
			}

			System.out.println();
		}
		for(int i=0;i<arrSize;i++)
			result+=count[i];
		return result;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int testCase=Integer.parseInt(s.nextLine());
		int[] result=new int[testCase];
		for(int i=0;i<testCase;i++) {
			String[] str= s.nextLine().split(" ");
			int arrSize=Integer.parseInt(str[0]);
			int maxAway=Integer.parseInt(str[1]);
			result[i]=logic1(arrSize,maxAway,s);
		}
		System.out.println("-------------------------");
		System.out.println("Result: ");
		for(int i=0;i<testCase;i++)
			System.out.println("tescase["+i+"] : "+ result[i]);

	}



	static int logic1(int arrSize,int maxAway,Scanner s) {		
		String[][] str = new String[arrSize][arrSize];


		for(int i=0;i<arrSize;i++)
			for(int j=0;j<arrSize;j++)
				str[i][j] = s.next();

		System.out.println("entered value : ");
		for(int i=0;i<arrSize;i++) {
			for(int j=0;j<arrSize;j++) {
				System.out.print(str[i][j]);
			}
			System.out.println();
		}


		int[] count=new int[arrSize];		
		int result=0;
		System.out.println("\n string : ");

		for(int i=0;i<arrSize;i++) {
			count[i]=0;
			for(int j=0;j<arrSize;j++) {
				System.out.print(" ("+i+","+j+")("+str[i][j]+":");
				if(str[i][j].equalsIgnoreCase("T")) {
					System.out.print("{1:");
					for(int k=1;k<=maxAway;k++) {
						if((j+k)<arrSize) {
							System.out.print("("+(j+k)+":"+arrSize+")}");
							if(str[i][j+k].equalsIgnoreCase("P")) {
								count[i]++;
								str[i][j]="x";
								str[i][j+k]="x";
							}
						}
					}
				}
				else if(str[i][j].equalsIgnoreCase("P")){
					System.out.print("{2:");
					for(int k=1;k<=maxAway;k++) {
						if((j+k)<arrSize) {
							System.out.print("("+(j+k)+":"+arrSize+")}");
							if(str[i][j+k].equalsIgnoreCase("T")) {
								count[i]++;
								//System.out.println("row{"+(j+1)+"} : "+ count[i]);
								str[i][j]="x";
								str[i][j+k]="x";
							}
						}
					}
				}
				System.out.print(str[i][j]+")");
			}
			System.out.println();
		}


		System.out.println("------------------------");
		for(int i=0;i<arrSize;i++) {
			for(int j=0;j<arrSize;j++) {
				System.out.print(str[i][j]);
			}
			System.out.println();
		}



		for(int i=0;i<arrSize;i++)
			result+=count[i];
		return result;
	}
}
