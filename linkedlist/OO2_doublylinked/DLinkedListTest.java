package OO2_doublylinked;

public class DLinkedListTest {

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new  DoublyLinkedList();
		dll.insertHead(10);
		dll.insertHead(20);
		dll.insertHead(30);
		
		dll.print();
		
		dll.insertTail(100);
		
		dll.print();
	}

}
