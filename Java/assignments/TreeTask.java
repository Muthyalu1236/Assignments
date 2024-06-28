package com.DS.assignments;

class Node {
	int key;
	Node left, right;
	
	public Node(int item) {
		key = item;
		left = right = null;
	}
}
class BinaryTree{
	Node root;
	
	BinaryTree(){
		root = null;
	}
	void insert(int key) {
		root = insertRec(root,key);
	}
	
	Node insertRec(Node root, int key) {
		// TODO Auto-generated method stub
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key < root.key) {
			root.left = insertRec(root.left, key);
		}
			
		else if (key > root.key) {
			root.right = insertRec(root.right,key);
		}
			
		return root;
	}
	
	void deleteKey(int key) {
		root = deleteRec(root,key);
	}
	private Node deleteRec(Node root, int key) {
		// TODO Auto-generated method stub
		if(root == null)return root;
		
		if(key < root.key)
			root.left = deleteRec(root.left,key);
		
		else if (key > root.key)
			root.right = deleteRec(root.right,key);
		
		else {
			if(root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			root.key = minValue(root.right);
			root.right = deleteRec(root.right, root.key);
		}
		return root;
	}
	private int minValue(Node right) {
		// TODO Auto-generated method stub
		int minv= root.key;
		while(root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}
	
	void inOrder() {
		inOrderRec(root);
	}
	private void inOrderRec(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			inOrderRec(root.left);
			System.out.print(root.key + " ");
			inOrderRec(root.right);
		}
	}

	void preOrder() {
		preOrderRec(root);
	}
	private void preOrderRec(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			System.out.print(root.key + " ");
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}

	void postOrder() {
		postOrderRec(root);
	}
	private void postOrderRec(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.key + " ");
		}
	}
	
	
}
public class TreeTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		tree.deleteKey(20);
		
		
		System.out.println("Inorder Traversal:");
		tree.inOrder();
		System.out.println();
		
		System.out.println("Pre Order Treversal");
		tree.preOrder();
		System.out.println();
		
		System.out.println("Post Order Traversal:");
		tree.postOrder();
		System.out.println();
	}
}

