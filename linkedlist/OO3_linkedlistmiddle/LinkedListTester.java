package OO3_linkedlistmiddle;

public class LinkedListTester {

	public static void main(String[] args) {
		
		LinkedList list  = new LinkedList();
		list.insertHead(30);
		list.insertHead(20);
		list.insertHead(10);
		
		list.print();
		System.out.println("After tail insert");
		
		list.insertTail(100);
	    list.insertTail(200);
		
		list.print();
		
		System.out.println("Middle Node is  :"+ list.middleNode().data);
		

	}

}
