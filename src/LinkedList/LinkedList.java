package LinkedList;

public class LinkedList {
	private Node head;

	public Node addNode(Node head, int data) {
		Node newNode = new Node(data);

		newNode.link = head;
		head = newNode;
		return head;

	}

	public void displayList(Node head) {
		Node temp = head;

		if (temp == null) {
			System.out.println("List is empty");

		} else

			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.link; // traverse to next node
			}
		System.out.println();
	}

	public void searchLinkedList(Node head, int key) {

		Node temp = head;
		int index = 1;
		while (temp != null) {
			if (temp.data == key) {
				System.out.println("Key found at node :" + index);
				break;
			}
			index++;
			temp = temp.link;

		}
		if (temp == null)
			System.out.println("Could not find Key:" + key);

	}

	public Node deleteListByKey(Node head, int key) {
		// [previous]->[current]->[next]
		Node current = head;
		Node previous = current;
		while (current != null) {
			if (current.data == key) {
				if (current == head)
					head = head.link;// if data found at head position
				else
					previous.link = current.link;
				break;
			}
			previous = current;
			current = current.link;

		}

		return head;

	}
//	Delete the key at any position
//	previous->current->next
	public Node deleteListByPosition(Node head,int position)
	{
		if(head==null)
			return head;
		
		Node temp=head;
		
		if(position==0)
		{
			head=temp.link;
			return head;
		}
		
		for(int i=0;temp!=null && i<position-1;i++)
		{
			temp=temp.link;
		}
		
		if(temp==null || temp.link==null)
		return head;
		
		Node link=temp.link.link;
		temp.link=link;
		return head;
	}
	
	//Static method to get Node by passing data
	public static Node getNode(int data) {
        return new Node(data);
    }
    
//	public void insertAtStart(Node headIncoming, int position,int data)
//	{
//		
//		   
//		    Node new_node = new Node(data);
//		 
//		  
//		    new_node.link = head;
//		 
//		  
//		    head = new_node;
//		
//	}
	
	/* Insert node any position, checking if possible , no invalid positions allowed
     * Traverse completely, change the reference [previous]->[current]->[new]->[next]
     */
	public Node InsertPosition(Node headIncoming, int position, int data) {
        Node head = headIncoming;
        if (position<1)
        {
        	System.out.print("Not a valid position");
        	return head;
        }
            
 
        
        if (position==1) {
            Node newNode = new Node(data);
            newNode.link = headIncoming;
            head = newNode;
            return head;
        } 
        else 
        {
            while (position-- != 0) {
                if (position == 1) {
                    // At required position, add the node, getNode to see where to add based on prev,next
                    Node newNode = getNode(data);
 
                    // Making the new Node to point to
                    // the old Node at the same position
                    newNode.link = headIncoming.link;
 
                    // Replacing current with new Node
                    // to the old Node to point to the new Node
                    headIncoming.link = newNode;
                    break;
                }
                headIncoming = headIncoming.link;
            }
            if (position != 1)
                System.out.print("Need to check linked list size and if position can be fit in");
            return head;
        }
        
    }
	
	//Reversing a linked list
	/*
	 * previous->current->nextOne ::----> nextOne->current->previous
	 */
	Node reverse(Node nodeIncoming)
    {
        Node previous = null;
        Node current = nodeIncoming;
        Node nextOne = null;
        while (current != null) {
            nextOne = current.link;
            current.link = previous;
            previous = current;
            current = nextOne;
        }
        nodeIncoming = previous;
        return nodeIncoming;
    }
	
	
	
}
	


