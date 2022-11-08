package LinkedList;

public class Driver {

	public static void main(String[] args) {
	
		LinkedList linkedList = new LinkedList();
		Node head= null;
		//Adding elements to a linkedList
		head = linkedList.addNode(head,25);
		head = linkedList.addNode(head,45);
		head = linkedList.addNode(head,93);
		head = linkedList.addNode(head,76);
		head = linkedList.addNode(head,24);
		head = linkedList.addNode(head,21);
		head = linkedList.addNode(head,18);
		head = linkedList.addNode(head,14);
		
		//Displaying the linkedList after adding the elements
		System.out.print("The Linked List after addition of elements: ");
		linkedList.displayList(head);
		System.out.println();
		
		//Searching for an element in the above linkedList
		linkedList.searchLinkedList(head, 76); //Positive Case
		linkedList.searchLinkedList(head, 24); //Positive Case
		linkedList.searchLinkedList(head, 100); //Negative Case
		linkedList.searchLinkedList(head, 150); //Negative Case
		
		//Inserting at any position in LinkedList
		linkedList.InsertPos(head, 5, 70);
		System.out.print("The Linked List after addition of element: ");
		linkedList.displayList(head);
		System.out.println();
		
		//Inserting at any end of the linked list
		linkedList.InsertPos(head, 2, 12);
		System.out.print("The Linked List after addition of element: ");
		linkedList.displayList(head);
		System.out.println();
		
		//Inserting at starting
		head=linkedList.addNode(head,43);
		System.out.print("The Linked List after addition of element: ");
		linkedList.displayList(head);
		System.out.println();
		
		//Inserting at end of the linkedList
		linkedList.InsertPos(head, 12, 22);
		System.out.print("The Linked List after addition of element: ");
		linkedList.displayList(head);
		System.out.println();
		
		//Delete the list by position given
		linkedList.deleteListByPosition(head, 2);
		System.out.print("The Linked List after deletion by position: ");
		linkedList.displayList(head);
		System.out.println();
		
		//Deletion by key 
		head=linkedList.deleteListByKey(head, 76);
		System.out.print("The Linked List after deletion by key: ");
		linkedList.displayList(head);
		System.out.println();
		
		//Reversing a list 
		head=linkedList.reverse(head);
		System.out.print("The Linked List after the reversal: ");
		linkedList.displayList(head);
		System.out.println();

	}

}
