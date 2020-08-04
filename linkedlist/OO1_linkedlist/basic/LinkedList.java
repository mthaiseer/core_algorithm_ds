package OO1_linkedlist.basic;

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
	
	
	
	

}
