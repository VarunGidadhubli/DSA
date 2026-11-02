package datastructures.code.linkedlist;

public class CopyLinkedListRandomPointer {

	Node head;
	String s1 = new String();
	String s2 = new String();

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

	public void addList(CopyLinkedListRandomPointer list1, CopyLinkedListRandomPointer list2) {

		Node current1 = list1.head;
		Node current2 = list2.head;

		while (current1.next != null) {
			s1 = s1 + current1.data;
			s2 = s2 + current2.data;
			current1 = current1.next;
			current2 = current2.next;
		}
		s1 = s1 + current1.data;
		s2 = s2 + current2.data;
	}

	public static void main(String[] args) {

		CopyLinkedListRandomPointer list1 = new CopyLinkedListRandomPointer();
		list1.insert(1);
		list1.insert(2);
		list1.insert(3);

		CopyLinkedListRandomPointer list2 = new CopyLinkedListRandomPointer();
		list2.insert(4);
		list2.insert(5);
		list2.insert(6);

		list1.addList(list1, list2);
		System.out.println(list1.s1 + " " + list1.s2);
		
		String reversed1 = new StringBuilder(list1.s1).reverse().toString();
		String reversed2 = new StringBuilder(list1.s2).reverse().toString();
		
		Integer num1 = Integer.parseInt(reversed1);
		Integer num2 = Integer.parseInt(reversed2);
		Integer sum = num1+num2;
		System.out.println(sum);
		
		String s = String.valueOf(sum);
		System.out.println(s);
		CopyLinkedListRandomPointer list3 = new CopyLinkedListRandomPointer();
		for(int i=s.length()-1;i>=0;i--) {
			list3.insert(Character.getNumericValue(s.charAt(i)));
		}
		list3.printList();
	}
}