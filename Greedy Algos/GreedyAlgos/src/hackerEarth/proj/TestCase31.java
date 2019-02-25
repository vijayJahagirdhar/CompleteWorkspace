package proj;

import java.util.Scanner;
/**
 *  @author VIJAY
 *  Monk's Encounter with Polynomial
 *
 */
public class TestCase31{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int tc=s.nextInt();
		int finalresult[]=new int[tc];
		for(int i=0;i<tc;i++) {
		double A=s.nextDouble();
		double B=s.nextDouble();
		double C=s.nextDouble();
		double K=s.nextDouble();
		double a=Math.pow(B,2);
		double b=4*A*(C-K);
		double  numerator= a-b;
		double inter= (-B)+Math.sqrt(numerator);
		if(inter>=0){
		finalresult[i]=(int)Math.ceil(inter/(2*A));
		}else{
		    finalresult[i]=0;
		}
		  
		}
		for(int i=0;i<tc;i++)
			System.out.println(finalresult[i]);
	}

}
