package O010_segragateevenodd;

import OO5_reverselinkedlist.Node;

public class LinkedList {

	private Node head;
	
	public void insertHead(int data) {
		Node temp  = new Node(data);
		temp.next = head;
		head = temp;
	}

	public void print() {
		Node node = head;

		while (node != null) {
			System.out.print("->" + node.data);
			node = node.next;

		}
		System.out.println();
	}
	
	public void segragateEvenOdd() {
		
		Node evenStart = null;
		Node evenEnd= null;
		Node oddStart= null;
		Node oddEnd= null ;
		
		Node current = head;
		
		while(current != null) {
			
			
			if(current.data %2 ==0) {
				
				if(evenStart == null) {
					
					evenEnd = new Node(current.data);
					evenStart = evenEnd;
					
				}else {
					Node temp = new Node(current.data);
					evenEnd.next = temp;
					evenEnd = temp;
				}
				
			}else {
				
				if(oddStart == null) {
					oddEnd = new Node(current.data);
					oddStart = oddEnd;
				}else {
					Node temp = new Node(current.data);
					
					oddEnd.next = temp;
					oddEnd = temp;
				}
				
			}
			current = current.next;
			
		}
		
		if( evenEnd != null && oddStart != null) {
			evenEnd.next = oddStart;
		}
		head = evenStart;
		
	}

	


}
