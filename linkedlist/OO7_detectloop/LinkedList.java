package OO7_detectloop;

public class LinkedList {
	
	private Node head;
	
	
	public void print(Node head) {
		Node node = head;
		
		while(node != null) {
			System.out.print("->"+node.data);
			node = node.next;
			
		}
		System.out.println();
	}
	
	public boolean isLoopExists(Node head) {
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
			
			if(slow == fast) {
				return true;
			}

			
		}
		
		return false;
		
	}
	
	
}
