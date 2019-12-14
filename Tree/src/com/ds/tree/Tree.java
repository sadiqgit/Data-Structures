package com.ds.tree;

public class Tree {

	static Node root;

	static class Node {

		int data;
		Node left;
		Node right;

		Node(int data) {

			this.data = data;
			this.right = null;
			this.left = null;
		}

	}

	public static void addElements(int data) {

		Node node = new Node(data);

		if (root == null) {

			root = node;
		} else {
			if (root.left == null) {

				root.left = node;
			} else if (root.right == null) {

				root.right = node;
			}
		}

	}

	public static void main(String[] args) {

		Tree.addElements(1);
		Tree.addElements(2);
		Tree.addElements(3);
		Tree.addElements(4);
		Tree.addElements(5);
		Tree.addElements(6);
		Tree.addElements(7);

	}

}
