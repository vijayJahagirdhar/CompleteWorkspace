package proj;

import java.util.Scanner;

class TestClass1 {
    public static void main(String args[] ) throws Exception {    
        Scanner s = new Scanner(System.in);
        System.out.println("enter array size :");
        int  len = Integer.parseInt(s.nextLine());                 // Reading input from STDIN
        System.out.println("Enter input 1 :" );
        Integer a[]=new Integer[len];
        for(int i=0;i<len ;i++){
            a[i]= Integer.parseInt(s.next());
        }
        Integer a1[]=new Integer[len];
        for(int i=0;i<len ;i++){
            a1[i]=Integer.parseInt(s.next());
        }
        
        Integer res[]=new Integer[len];
        for(int i=0;i<len;i++)
          res[i]=a[i]+a1[i];
  

for(int i=0;i<len;i++)
        System.out.println(res[i]);

        // Write your code here

    }
}
