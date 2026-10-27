package datastructures.code.linkedlist;

public class DetectCycle {

    Node head;

    class Node {
        int data;
        Node next;
        boolean isVisited=false;

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

    public void createCycle() {

        Node current = head;

        // Cycle should start at node 30
        Node cycleStart = head.next.next;

        // Go to the last node
        while (current.next != null) {
            current = current.next;
        }

        // Make the last node point back to 30
        current.next = cycleStart;
    }
    
    public boolean checkIfCycleExists() {
    	
    	Node current=head;
    	
    	while(current!=null) {
    		
    		if(current.isVisited==false) {
    			current.isVisited=true;
    			current=current.next;
    		}else {
    			System.out.println("Cycle detected");
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    public boolean checkIfCycleExistsUsingSlowAndFastPointers() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        DetectCycle list = new DetectCycle();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.createCycle();
        
        System.out.println(list.checkIfCycleExists());
        System.out.println(list.checkIfCycleExistsUsingSlowAndFastPointers());

    }
}