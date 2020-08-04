package OO9_deletenodewithonepointer;

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

	public void deleteNode(Node node) {

		//could be last node or invalid node
		if( node == null || node.next == null) {
			return;
		}
		
		node.data = node.next.data;
		node.next = node.next.next;
		
	}


}
