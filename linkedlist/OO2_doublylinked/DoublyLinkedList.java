package OO2_doublylinked;

public class DoublyLinkedList {

	private Node head;
	
	public void insertHead(int data) {
		
		if(head == null) {
			head = new Node(data);
			return;
		}
		
		Node temp = new Node(data);
		temp.next = head;
		head.prev = temp;
		head = temp;
		
	}
	
	public void insertTail(int data) {
		
		Node temp =  new  Node(data);
		Node node = head;
		while(node != null && node.next != null) {
			node = node.next;
		}
		
		node.next = temp;
		temp.prev = node;
		
		
	}
	
	public void print() {
		
		Node node = head;
		while(node != null) {
			System.out.print( "->"+ node.data);
			node = node.next;
		}
		System.out.println();
	}
}
