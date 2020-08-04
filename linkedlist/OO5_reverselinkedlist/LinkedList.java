package OO5_reverselinkedlist;

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
	
	public void reverse() {
		
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			
			prev = current;
			current = next;
		}
		
		head = prev;
	}
	
	
}
