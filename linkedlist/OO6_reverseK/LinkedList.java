package OO6_reverseK;

public class LinkedList {
	
	private Node head;
	
	public void insertHead(int data) {
		Node temp  = new Node(data);
		temp.next = head;
		head = temp;
	}
	
	public void insertTail(int data) {
		Node temp = new Node(data);
		Node currentNode = head;
		
		while(currentNode != null && currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = temp;
		
	}
	
	public void print() {
		Node node = head;
		
		while(node != null) {
			System.out.print("->"+node.data);
			node = node.next;
			
		}
		System.out.println();
	}
	
	
	public void reverseK(int k) {
		head = reverseK(head, k);
	}
	
	
	private  Node reverseK(Node node, int k) {
		
		Node prev = null;
		Node current = node;
		Node next = null;
		int count =0;
		
		while(current != null &&  count < k) {
			next = current.next;
			current.next = prev;
			
			prev = current;
			current = next;
			count++;
		}
		
	    if( next != null) {
	    	Node restHead  =  reverseK(next, k);
	    	node.next = restHead;
	    }
		
		return prev;
	}
	
	
}
