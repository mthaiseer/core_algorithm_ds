package OO4_nthnodefromend;

public class LinkedListTester {

	public static void main(String[] args) {
		
		LinkedList list  = new LinkedList();
		list.insertHead(70);
		list.insertHead(60);
		list.insertHead(50);
		list.insertHead(40);
		list.insertHead(30);
		list.insertHead(20);
		list.insertHead(10);

		
		list.print();
		
		int pos = 2;
 		System.out.println("Nth from end "+ pos + " :"+ list.findNthNodeFromEnd(pos).data);
 		
 		pos = 3;
 		System.out.println("Nth from end "+ pos + " :"+ list.findNthNodeFromEnd(pos).data);

	}

}
