package proj;



import java.util.*;


public class TestCase5 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		int noA=sc.nextInt();
		List<Integer> setOfA=new ArrayList<Integer>();
		for(int i=0;i<noA;i++) {
			int N= sc.nextInt();
			setOfA.add(N);
		}

		int noC=sc.nextInt();
		List<Integer> setOfC=new ArrayList<Integer>();
		for(int i=0;i<noC;i++) {
			int N= sc.nextInt();
			setOfC.add(N);
		}	

		List<Integer> possibleList=new ArrayList<>();

		for(int i=0;i<setOfC.size();i++) {
			for(int j=0;j<setOfA.size();j++) {
				int item=setOfC.get(i)-setOfA.get(j);
				if(item>0)
					if(!possibleList.contains(item)) 
						possibleList.add(item);
			}
		}



		Collections.sort(possibleList);

		List<Integer> listOfIndex=new ArrayList<>();
		List<Integer> result=new ArrayList<>();
		
		for(int i=0;i<setOfA.size();i++) {
			for(int j=0;j<possibleList.size();j++) {
			   int item=setOfA.get(i)+possibleList.get(j);
			   if(!setOfC.contains(item)) {
				   if(!listOfIndex.contains(j))
				   listOfIndex.add(j); 
			   }
			}
		}
		
		
		for(int i=0;i<possibleList.size();i++) {
		    if(!listOfIndex.contains(i)) {
		    	result.add(possibleList.get(i));
		    }
		}
		
		System.out.println("\npossible list :\n");
		for(int i:result) {
			System.out.print(i+" ");
		}
		
	
	}
}
