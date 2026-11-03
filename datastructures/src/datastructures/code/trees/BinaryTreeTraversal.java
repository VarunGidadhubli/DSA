package datastructures.code.trees;

public class BinaryTreeTraversal {

	Node root;

	class Node {

		int data;
		Node left;
		Node right;

		Node(int value) {
			data = value;
		}
	}

	public void insert(int value) {

		root = insertNode(root, value);
	}

	private Node insertNode(Node current, int value) {

		if (current == null) {
			return new Node(value);
		}

		if (value < current.data) {
			current.left = insertNode(current.left, value);
		} else {
			current.right = insertNode(current.right, value);
		}

		return current;
	}

	// Left → Root → Right
	public void inOrderTraversal(Node current) {

		if (current == null) {
			return;
		}

		inOrderTraversal(current.left);
		System.out.print(current.data + " ");
		inOrderTraversal(current.right);
	}

	// Root → Left → Right
	public void preOrderTraversal(Node current) {

		if (current == null) {
			return;
		}

		System.out.print(current.data + " ");
		preOrderTraversal(current.left);
		preOrderTraversal(current.right);
	}

	// Left → Right → Root
	public void postOrderTraversal(Node current) {

		if (current == null) {
			return;
		}

		postOrderTraversal(current.left);
		postOrderTraversal(current.right);
		System.out.print(current.data + " ");
	}

	public boolean findANode(Node current, int value) {

		if (current == null) {
	        return false;
	    }
		
		if (current.data == value) {
	        return true;
	    }

		 return findANode(current.left, value) || findANode(current.right, value);
	}

	public static void main(String args[]) {

		BinaryTreeTraversal tree = new BinaryTreeTraversal();

		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);

		System.out.print("Inorder: ");
		tree.inOrderTraversal(tree.root);

		System.out.println();

		System.out.print("Preorder: ");
		tree.preOrderTraversal(tree.root);

		System.out.println();

		System.out.print("Postorder: ");
		tree.postOrderTraversal(tree.root);
		System.out.println();

		System.out.println("Finding the value");
		System.out.println("Is value present " + tree.findANode(tree.root, 60));
	}
}