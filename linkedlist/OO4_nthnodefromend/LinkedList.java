package OO4_nthnodefromend;

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
	
	public Node findNthNodeFromEnd(int pos) {
		
		if(head == null) return null;
		
		Node slow = head;
		Node fast = head;
		
		int count =1;
		
		while(count != pos) {
			fast = fast.next;
			count++;
		}
		
		while(fast != null && fast.next!= null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;
		
	}
	

	
	

}
