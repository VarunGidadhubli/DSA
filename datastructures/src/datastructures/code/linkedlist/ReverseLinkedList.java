package datastructures.code.linkedlist;

public class ReverseLinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
        }
    }

    public void insert(Integer value) {

        Node node = new Node(value);

        if (head == null) {
            head = node;
        } else {

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = node;
        }
    }

    public void reverseLinkedList() {

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        head = previous;
    }

    public void printList() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        ReverseLinkedList list = new ReverseLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.printList();

        list.reverseLinkedList();

        list.printList();
    }
}