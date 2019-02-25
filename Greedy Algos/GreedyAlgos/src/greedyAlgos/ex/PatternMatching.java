package greedyAlgos.ex;
import java.util.HashMap;
import java.util.Map;

//<<<<<MAP IMPLEMENTATION>>>>
/*public class PatternMatching {
	static char[] arr = new char[] {'a','b','b','c','c','c'}; 
	static int[] count  = new int[] {1,2,3};
	static char[] chs=new char[] {'a','b','c'};
	public static void main(String[] args) {
		int tempCount = 0;
		boolean flag=true;
		for(int i=0;i<count.length;i++)
			tempCount+=count[i];
		if(arr.length==tempCount) {
			Map<String,Integer> freq = new HashMap<String,Integer>();
			for(int i=0;i<arr.length;i++) {
				String ch = arr[i]+"";
				if(findCount(arr[i])!=-1) {
					if(freq.containsKey(ch)) {
						if(freq.get(ch)<findCount(arr[i])) 
							freq.put(ch,freq.get(ch+"")+1);
						else {
							System.out.println("freq of \'"+ch+"\' exceeds than given frequency.");
							flag=false;
							break;
						}
					}else 
						freq.put(ch, 1);
				}else {
					System.out.println("\'"+ch+"\' is not present in the provided Character Set");
					flag=false;
					break;
				}
			}
		}else {
			System.out.println("FrequencyCount doesnot match with the given input Count..");
			flag = false;
		}
		if(flag)
			System.out.println("!!!CharacterArray And frequency matches!!!!");
	}

	private static Integer findCount(char ch) {
		int pos = -1;
		for(int i=0;i<chs.length;i++)
			if(chs[i]==ch)
				pos=i;
		if(pos!=-1)
			return count[pos];
		else
			return pos;
	}
}*/



//<<<<<ARRAY IMPLEMENTATION OF SAME ALGO>>>>>
/*public class PatternMatching {

	static char[] arr = new char[] {'c','a','b','c','b','c'}; 
	static int[] count  = new int[] {1,2,3};
	static char[] characterSet=new char[] {'a','b','c'};
	static int[] currentCount = new int[] {0,0,0};

	public static void main(String[] args) {
		int tempCount = 0;
		boolean flag=true;

		for(int i=0;i<count.length;i++)
			tempCount+=count[i];

		String msg="";
		if(arr.length==tempCount) {
			for(int i=0;i<arr.length;i++) {
				int pos = findPos(arr[i]);
				if(pos!=-1) { 
					if(currentCount[pos]<count[pos]) 
						currentCount[pos]++;
					else{
						msg="freq of \'"+arr[i]+"\' exceeds the given frequency.";flag=false;break;
					}
				}else {
					msg="\'"+arr[i]+"\' is not present in the provided Character Set";flag=false;break;
				}
			}
		}else {
			msg="FrequencyCount doesnot match with the given input Count..";flag = false;
		}
		if(flag)
			System.out.println("!!!CharacterArray And frequency matches!!!!");
		else
			System.out.println(msg);
	}

	private static Integer findPos(char ch) {
		int pos = -1;
		for(int i=0;i<characterSet.length;i++)
			if(characterSet[i]==ch)
				pos=i;
		return pos;
	}
}*/

//Program updated...
/*public class PatternMatching {
	static char[] arr = new char[] {'a','b','c','c','c','c','b','b','c','c','c'}; 
	static int[] count  = new int[] {1,2,3};
	static char[] characterSet=new char[] {'a','b','c'};
	static int[] currentCount = new int[characterSet.length];
	static int[] decodeArr = new int[characterSet.length];
	static int k=0;
	public static void main(String[] args) {
		System.out.println("the Decoded value is : ");
		for(int i=0;i<arr.length;i++) {
			int index = findPos(arr[i]);
			if(index<k) 
				clearValues();
			if(currentCount[index]<count[index]) 
				currentCount[index]++;
			else 
				decodeArr[index]=-1;
			k = index;
		}
		printResult();
	}
	private static void printResult() {
		for(int i=0;i<currentCount.length;i++) {
			if(decodeArr[i]!=-1 && currentCount[i]==count[i])
				System.out.print(characterSet[i]+" ");
			else
				System.out.print(-1+" ");
		}
	}
	private static void clearValues() {
		printResult();
		for(int i=0;i<currentCount.length;i++) {
			currentCount[i]=0;
			decodeArr[i]=0;
		}
	}
	private static Integer findPos(char ch) {
		int pos = -1;
		for(int i=0;i<characterSet.length;i++)
			if(characterSet[i]==ch)
				pos=i;
		return pos;
	}
}*/

public class PatternMatching {
	static char[] arr = new char[] {'a','a','b','b','b','c','c','c','b'}; 
	static int[] frequencyCount  = new int[] {1,2,3,1};
	//static char[] characterSet=new char[] {'a','b','c'};
	static int[] currentCount = new int[frequencyCount.length];
	static int[] decodeArr = new int[frequencyCount.length];
	static int k=0;
    static char[] mockArr = new char[frequencyCount.length];
	
	public static void main(String[] args) {
	//	System.out.println("the Decoded value is : ");
		char prev='\0';
		int freqIndex=-1;
		
		for(int i=0;i<arr.length;i++) {
			char cur=arr[i];
			/*if(freqIndex)*/
		//	System.out.print("{ cur : "+cur+" prev : "+prev+" freqIndex "+freqIndex+" --> ");
			if(cur==prev) {
				//System.out.print(" 1 : ");
				if(currentCount[freqIndex]<frequencyCount[freqIndex]) {
				//	System.out.print("c["+freqIndex+"]{"+currentCount[freqIndex]+"} < fC["+freqIndex+"]{"+frequencyCount[freqIndex]+"}");
					currentCount[freqIndex]++;
				}else {
				//	System.out.print("c["+freqIndex+"]{"+currentCount[freqIndex]+"} > fC["+freqIndex+"]{"+frequencyCount[freqIndex]+"}");
					decodeArr[freqIndex]=-1;
				}
			}else {
				//getPos();
				//System.out.print(" 2 : ");
				freqIndex++;
				mockArr[freqIndex]=arr[i];
				currentCount[freqIndex]++;
				//System.out.print(" fIdx: "+freqIndex);
			}
		/*printCurrentCount();*/
		//	System.out.println();
			prev=cur;
		}
		
	/*	System.out.println("Frequncy Array :");
		for(int i=0;i<frequencyCount.length;i++)
			System.out.print(currentCount[i]+" ");
		System.out.println();
		System.out.println();*/
		printResult();
	}
	/*private static void printCurrentCount() {
		System.out.print("   [");
		for(int i=0;i<currentCount.length;i++)
			System.out.print(currentCount[i]+" ");
		System.out.print("] ");
		System.out.print(" [");
		for(int i=0;i<decodeArr.length;i++)
			System.out.print(decodeArr[i]+" ");
		System.out.print("]");
	}*/
	private static void printResult() {
		for(int i=0;i<currentCount.length;i++) {
			if(frequencyCount[i]==currentCount[i] && decodeArr[i]!=-1)
				System.out.print(mockArr[i]+" ");
			else
				System.out.print("-1 ");
		}
	}
	private static void clearValues() {
		printResult();
		for(int i=0;i<currentCount.length;i++) {
			currentCount[i]=0;
			decodeArr[i]=0;
		}
	}
	/*private static Integer findPos() {
		int pos = -1;
		for(int i=0;i<frequencyCount.length;i++)
			if(characterSet[i]==ch)
				pos=i;
		return pos;
	}*/
}