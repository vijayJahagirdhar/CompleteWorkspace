package dynamicAlgos.ex;

public class MergingSortedList {

	static class Node{
		int value;
		Node rightNode;
		public Node(int value, Node rightNode) {
			super();
			this.value = value;
			this.rightNode = rightNode;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public Node getRightNode() {
			return rightNode;
		}
		public void setRightNode(Node rightNode) {
			this.rightNode = rightNode;
		}
	}

	public static void main(String[] args) {
		//List1
		Node n5= new Node(9,null);
		Node n4= new Node(7,n5);
		Node n3= new Node(5,n4);
		Node n2= new Node(3,n3);
		Node n1= new Node(1,n2);
		
		
		//List2
		Node n9= new Node(8,null);
		Node n8= new Node(6,n9);
		Node n7= new Node(4,n8);
		Node n6= new Node(2,n7);
	
		Node temp = merge(n1,n6);
		System.out.println("ListCrawler ---> Sorted list : ");
		listCrawler(temp);
	}
	private static void listCrawler(Node temp) {
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.rightNode;
		}
	}
	
	//static int count=0;
	
	
	//using recursive method ......
	private static Node merge(Node head1, Node head2) {
		if(head1 == null || head2 == null) {	
		      if(head1==null && head2==null)
		    	  return null;
			  else if(head1==null) 
		  		  return head2;
		  	  else  
		  		  return head1;
		}else if(head1.value<head2.value) {
			//System.out.println("new Node1["+head1.value+","+print(head1,head2)+"]");
			return new Node(head1.value,merge(head1.rightNode,head2));
		}
		else {
			//System.out.println("new Node2["+head2.value+","+print(head1,head2)+"]");
			return new Node(head2.value,merge(head1,head2.rightNode));
		}
	}
	private static String print(Node head1, Node head2) {
		if(head1!=null && head2!=null)
			return "merge[Node["+head1.value+"],Node["+head2.value+"]]";
		else {
			if(head1==null && head2!=null)
				 return "merge[Node["+null+"],Node["+head2.value+"]]";
				if(head1!=null && head2==null)
					  return "merge[Node["+head1.value+"],Node["+null+"]]";
					if(head1==null && head2==null)
						return "merge[Node["+null+"],Node["+null+"]]";
				
		}
		return "";
	}
	
	/*private static Node min(Node head1, Node head2) {
		if(head1.value<head2.value)
			return head1;
		else
			return head2;
	}*/
	
	//Using Iterative method ... Ambiguous..
	/*private static void merge(Node head1, Node head2) {
	String temp = "N";
	Node[] newNode = new Node[8];
	while(head1!=null || head2!=null) {
		if(head1.value<head2.value) {
		    Node new1 = new Node(head1.value,head2);
		}else {
			Node new1 = new Node(head2.value,head1);
		}
		//Add it to array..
		newNode[count++]=new1;
		
	}
}*/

}
