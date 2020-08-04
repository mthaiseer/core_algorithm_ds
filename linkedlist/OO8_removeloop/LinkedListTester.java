package OO8_removeloop;

public class LinkedListTester {

	public static void main(String[] args) {
		
		LinkedList list  = new LinkedList();
		
		Node n10 = new Node(10);
		Node n20 = new Node(20);
		Node n30 = new Node(30);
		Node n40 = new Node(40);
		Node n50 = new Node(50);
		Node n60 = new Node(60);
		
		n10.next = n20;
		n20.next = n30;
		n30.next = n40;
		n40.next = n50;
		n50.next = n60;
		
		n60.next = n30;
		
		//list.print(n10); ERROR : loop cause infinite loop 
		
		list.removeloop(n10);
		
		list.print(n10);
		


	}

}
