package OO8_removeloop;

public class LinkedList {

	private Node head;

	public void print(Node head) {
		Node node = head;

		while (node != null) {
			System.out.print("->" + node.data);
			node = node.next;

		}
		System.out.println();
	}

	public void removeloop(Node head) {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				break;
			}

		}
		
		if(slow != fast) {
			System.out.println("No loop detected..");
			return;
		}

		slow = head;
		
		while(slow != null && slow.next!= null && fast != null && fast.next != null) {
			
			if(slow.next == fast.next) {
				System.out.println(" Loop removed");
				fast.next = null;
			}
			slow = slow.next;
			fast = fast.next;
		}
		
	}


}
