package datastructures.code.linkedlist;

public class RemoveNthNodeFromEndOfList {

	int listSize = 0;

	Node head;

	class Node {

		int data;
		Node next;

		Node(int value) {
			data = value;
		}
	}

	public void insert(int value) {

		listSize++;

		Node node = new Node(value);

		if (head == null) {
			head = node;
		} else {

			Node tempNode = head;

			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}

			tempNode.next = node;
		}
	}

	public void printList() {

		Node currentNode = head;

		while (currentNode.next != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.print(currentNode.data + " ");
	}

	public void elementPositionToBeRemoved(int position, RemoveNthNodeFromEndOfList list1) {

		if (position <= 0 || position > list1.listSize) {
			throw new IllegalArgumentException("Invalid position passed");
		}

		if (position == list1.listSize) {
			list1.head = list1.head.next;
			list1.listSize--;
			return;
		}

		Node current = list1.head;

		int currentCount = 1;

		while (currentCount < list1.listSize - position) {
			current = current.next;
			currentCount++;
		}

		current.next = current.next.next;
		list1.listSize--;
	}

	public static void main(String[] args) {

		int positionOfElementToBeRemoved = 2;

		RemoveNthNodeFromEndOfList list1 = new RemoveNthNodeFromEndOfList();
		list1.insert(10);
		list1.insert(40);
		list1.insert(50);
		list1.insert(60);
		list1.insert(80);
		list1.printList();
		System.out.println();
		list1.elementPositionToBeRemoved(positionOfElementToBeRemoved, list1);
	}
}