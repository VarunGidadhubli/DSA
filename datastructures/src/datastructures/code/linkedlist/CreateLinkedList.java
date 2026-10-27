package datastructures.code.linkedlist;

public class CreateLinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
		}
	}

	public void insert(int value) {

		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
		}else {

			Node current=head;

			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
		}
	}
	
	public void insertAtBeginning(int value) {

		Node newNode = new Node(value);

		if (head == null) {
			throw new NullPointerException("Linked list is empty");
		}else {

			newNode.next=head;
			head=newNode;
			
		}
	}
	
	public void deleteAtBeginning() {

		if (head == null) {
			throw new NullPointerException("Linked list is empty");
		}else {

			head=head.next;
		}
	}
	
	public void deleteLastNode() {
		
		Node current=head;
		
		while(current.next.next!=null) {
			current=current.next;
		}
		current.next=null;
	}
	
	public boolean doesValueExist(Integer value) {

		Node current=head;

		while(current!=null) {
			
			if(current.data==value)
				return true;
			
			current=current.next;
		}
		
		return false;
	}
	
	public void insertAtEnd(Integer value) {
		
		Node current=head;
		
		while(current.next!=null) {
			current=current.next;
		}
		
		Node newNode = new Node(value);
		current.next=newNode;
	}
	
	public void insertAfterPosition(Integer position, Integer value) {

		Node newNode = new Node(value);
		Node current=head;

		for(int i=0;i<position;i++) {
			current=current.next;
		}
		
		Node tempNode=current.next;
		current.next=newNode;
		newNode.next=tempNode;
	}
	
	public void deleteAfterPosition(int position) {
		
		Node current=head;

		for(int i=0;i<position;i++) {
			current=current.next;
		}
		
		current.next=current.next.next;
	}
	
	public void printList() {

		Node current=head;

		while (current != null) {
	        System.out.print(current.data + " ");
	        current = current.next;
	    }
	}

	public static void main(String[] args) {

		CreateLinkedList list = new CreateLinkedList();

		list.insert(10);
		list.insert(60);
		list.insert(40);
		list.insert(50);
		list.printList();
		System.out.println();
		
		list.insertAtBeginning(90);
		list.printList();
		System.out.println();
		
		list.deleteAtBeginning();
		list.printList();
		System.out.println();
		
		list.deleteLastNode();
		list.printList();
		System.out.println();
		
		System.out.print(list.doesValueExist(60));
		System.out.println();
		
		list.insertAtEnd(100);
		list.printList();
		System.out.println();
		
		list.insertAfterPosition(2, 45);
		list.printList();
		System.out.println();
		
		list.deleteAfterPosition(1);
		list.printList();
		System.out.println();
	}
}