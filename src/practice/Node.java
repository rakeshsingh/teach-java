package practice;

public class Node {
	int value; 
	Node next;
	
	public Node(int val) {
		this.value=val;
	}

	public static void main(String args[]) {
		
		Node root = new Node(0); //engine - original position
		Node a=root;
		
		
		//linked list creation here.
		for(int i=1; i<10;i++){
			Node b = new Node(i);
			a.next = b;
			a = a.next;
		}
		
		a = root;
		while (a !=null) {
			System.out.println(a.value);
			a = a.next;
		}
	}
}

