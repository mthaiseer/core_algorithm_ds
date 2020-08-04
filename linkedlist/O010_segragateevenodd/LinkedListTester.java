package O010_segragateevenodd;

public class LinkedListTester {

	public static void main(String[] args) {
		
		LinkedList list  = new LinkedList();
		
		list.insertHead(10);
		list.insertHead(3);
		list.insertHead(5);
		list.insertHead(8);
		list.insertHead(4);
		list.insertHead(9);
		list.insertHead(12);
		
		
		list.print();
		System.out.println("Segragate even and odd");
		list.segragateEvenOdd();
		list.print();
		
		


	}

}
