package proj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestCase3 {

		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int tc=Integer.parseInt(sc.nextLine());
			Map<Integer,Integer> m=new TreeMap<Integer,Integer>();
			for(int i=0;i<tc;i++) {
				int num=sc.nextInt();
				if(m.containsKey(num)) {
					Integer val=(Integer) m.get(num);
					m.put(num,++val);
				}
				else {
					m.put(num, 1);
				}
			}
			
			int k=sc.nextInt();
			
			 for (Map.Entry<Integer,Integer> map : m.entrySet())  {
			
				 if(map.getValue()==k) {
			        System.out.println(map.getKey());
			        break;
				 }
			}
		}
	
}
