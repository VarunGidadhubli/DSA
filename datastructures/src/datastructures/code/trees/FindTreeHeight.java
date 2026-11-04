package datastructures.code.trees;

public class FindTreeHeight {

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
	
	public int findHeightOfTree(Node current) {
		
		if(current==null) {
			return 0;
		}
		
		int leftHeight=findHeightOfTree(current.left);
		int rightHeight=findHeightOfTree(current.right);
		
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
	public static void main(String[] args) {

		FindTreeHeight tree = new FindTreeHeight();

		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);

		tree.inOrderTraversal(tree.root);
		System.out.println();
		System.out.println(tree.findHeightOfTree(tree.root));
	}
}