package datastructures.code.trees;

public class InvertBinaryTree {

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

		if (root == null) {
			root = new Node(value);
		}

		root = insertNode(root, value);
	}

	public Node insertNode(Node current, int value) {

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

	public Node invertTree(Node root) {

		if (root == null) {
			return root;
		}

		Node temp = root.left;

		// Swap and recursively invert
		root.left = invertTree(root.right);
		root.right = invertTree(temp);

		return root;
	}

	public static void main(String[] args) {

		InvertBinaryTree tree = new InvertBinaryTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);

		tree.inOrderTraversal(tree.root);
		System.out.println();

		tree.invertTree(tree.root);
		tree.inOrderTraversal(tree.root);
	}
}