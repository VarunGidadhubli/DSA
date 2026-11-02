package datastructures.code.linkedlist;

public class MergeTwoSortedLinkedLists {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int value) {
			data = value;
		}
	}

	public void insert(int value) {

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

	public void sortLinkedList(MergeTwoSortedLinkedLists list1, MergeTwoSortedLinkedLists list2) {

		Node node1 = list1.head;
		Node node2 = list2.head;

		Node dummy = new Node(-1);
		Node current = dummy;

		while (node1 != null && node2 != null) {

			if (node1.data <= node2.data) {
				current.next = node1;
				node1 = node1.next;
			} else {
				current.next = node2;
				node2 = node2.next;
			}

			current = current.next;
		}

		if (node1 != null) {
			current.next = node1;
		} else {
			current.next = node2;
		}

		head = dummy.next;
	}

	public static void main(String[] args) {

		MergeTwoSortedLinkedLists list1 = new MergeTwoSortedLinkedLists();
		list1.insert(10);
		list1.insert(40);
		list1.insert(50);
		list1.insert(60);
		list1.printList();
		System.out.println();

		MergeTwoSortedLinkedLists list2 = new MergeTwoSortedLinkedLists();
		list2.insert(20);
		list2.insert(30);
		list2.insert(50);
		list2.insert(90);
		list2.printList();
		System.out.println();

		MergeTwoSortedLinkedLists mergedList = new MergeTwoSortedLinkedLists();
		mergedList.sortLinkedList(list1, list2);

		System.out.print("Merged List: ");
		mergedList.printList();

	}
}