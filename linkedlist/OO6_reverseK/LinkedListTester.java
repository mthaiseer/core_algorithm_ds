package OO6_reverseK;

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
		
		System.out.println("After reversal ");
		
		list.reverseK(3);
		list.print();
		
		
		

	}

}
