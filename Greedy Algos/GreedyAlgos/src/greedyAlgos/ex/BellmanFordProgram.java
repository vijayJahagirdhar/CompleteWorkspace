package greedyAlgos.ex;

public class BellmanFordProgram {

	public static int graph[][];
	public static final int MAX = Integer.MAX_VALUE; 
	public static int[] key;
	public static int[] start;
	public static int[] end;
	public static int[] cost;
	
	public static void main(String[] args) {
		int src=0;
		graph = new int[][]{{0,-1,4,0,0},{0,0,3,2,2},{0,0,0,0,0},{0,1,5,0,0},{0,0,0,-3,0}};
	    int count = 0;
		for(int i=0;i<graph.length;i++) {
			for(int j=0;j<graph[0].length;j++)
				if(graph[i][j]!=0)
					count++;
		}
		
		start = new int[count];
		end = new int[count];
		cost = new int[count];
		int k=0;
		for(int i=0;i<graph.length;i++) {
			for(int j=0;j<graph[0].length;j++)
				if(graph[i][j]!=0) {
					start[k]=i;
					end[k]=j;
					cost[k]=graph[i][j];
					k++;
				}
					
		}
		
		for(int i=0;i<count;i++) {
			System.out.println("[ start:"+start[i]+",end:"+end[i]+",cost:"+cost[i]+" ]");
		}
		
		int[] key = new int[] {0,MAX,MAX,MAX,MAX};
		bellmanFord(graph,src,key);
	}
	private static void bellmanFord(int[][] graph, int src,int[] key) {
	    int V = graph.length;
	    printkeyArray(key);
		for(int i=0;i<V-1;i++) {
	    	 for(int j=0;j<start.length;j++) {
	    	//	 System.out.println("[ "+key[start[j]]+" + "+graph[start[j]][end[j]]+" < "+key[end[j]]+" ]");
	    		 if(key[start[j]]+graph[start[j]][end[j]]<key[end[j]]) {
	    			 key[end[j]]=key[start[j]]+graph[start[j]][end[j]];
	    			/* System.out.println("$-------------");
	    			 printkeyArray(key);
	    			 System.out.println("--------------$");*/
	    		 }
	    	 }
	    	 printkeyArray(key);
	    }
	}
	private static void printkeyArray(int[] key) {
		for(int i=0;i<key.length;i++)
			System.out.print(key[i]+" ");
		System.out.println();
	}
}
