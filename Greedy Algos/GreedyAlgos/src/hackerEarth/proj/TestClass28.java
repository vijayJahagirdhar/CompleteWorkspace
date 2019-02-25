package proj;

import java.util.Scanner;

/**
 * @author VIJAY
 *MONK TAKES A WALK
 */
class TestClass28 {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int tc=Integer.parseInt(s.nextLine());
         int[] result=new int[tc];
         String[] str=new String[tc];
         for(int i=0;i<tc;i++) 
        	 str[i]=s.nextLine();
         System.out.println();
         for(int i=0;i<tc;i++) 
    	 System.out.println(str[i]);
         System.out.println();
         
         int count=0;
System.out.println();
         for (int i=0;i<tc;i++){
        	 String temp=str[i];
        	 System.out.println("TEMP : "+temp);
             for(int k=0;k<temp.length();k++){
            	 System.out.print("-----> "+temp.charAt(k)+" ---> count: ");
                 if(       temp.charAt(k)=='a' 
                		 ||temp.charAt(k)=='e' 
                		 ||temp.charAt(k)=='i' 
                		 ||temp.charAt(k)=='o' 
                		 ||temp.charAt(k)=='u'
                		 ||temp.charAt(k)=='A' 
                		 ||temp.charAt(k)=='E' 
                		 ||temp.charAt(k)=='I' 
                		 ||temp.charAt(k)=='O' 
                		 ||temp.charAt(k)=='U') {
                   count++;
                 }
                 System.out.print(count+" ");
                 System.out.println();
             }
             result[i]=count;
             count=0;
             System.out.println();
         }
         
         System.out.println();
         for(int i=0;i<tc;i++)
        	 System.out.println(result[i]);

    }
}

