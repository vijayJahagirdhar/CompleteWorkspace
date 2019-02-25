package proj;

import java.util.Scanner;

class TestClass2 {
	public static void main(String args[] ) throws Exception {    
		Scanner s = new Scanner(System.in);
		int  len = Integer.parseInt(s.nextLine());
		Double[] d=new Double[len];

		
		for(int i=0;i<len;i++) {
			double red= Integer.parseInt(s.next());
			double green= Integer.parseInt(s.next());
			if(!(red==0 && green==0) && !(red==0))
			d[i]= (red/(red+green));
			else
				d[i]=(double) 1;
		}
		for(int i=0;i<len ;i++){
			
			System.out.printf("d["+i+"] : %.6f \n", d[i]);
	
		}
	}
}
