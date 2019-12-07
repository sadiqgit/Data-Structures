package com.ds.singlelinkedlist;

import java.util.Stack;

import com.ds.singlelinkedlist.util.Node;

public class PalindromeList {

	Node head;

	public boolean isPlaindrome(PalindromeList list) {

		Node currentNode = list.head;
		 

		Stack<Integer> stack = new Stack<Integer>();

		while (currentNode != null) {

			stack.push(currentNode.value);
			currentNode = currentNode.next;
		}
		
		currentNode = list.head;
		
		boolean returnValue = false;
		
		while (currentNode != null) {

			if ( !stack.isEmpty() && currentNode.value == stack.pop().intValue()) {
				currentNode = currentNode.next;
				returnValue = true;
				
			} else {
				returnValue = false;
				break;
			}
		}

		return returnValue;

	}

	public void add(int element) {

		Node newNode = new Node(element);

		// if list is empty then point head to new node

		if (head == null) {

			head = newNode;
		}

		else {

			// traverse to the end and add element

			Node start = head;

			while (start.next != null) {
				// it's not start.next = start.next.next ( if it is one node this condition
				// don't work), start from first node.
				start = start.next;
			}
			start.next = newNode;
		}

	}

	public static void main(String[] args) {

		PalindromeList list = new PalindromeList();

		// add the values

		list.add(3);
		list.add(2);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		
		boolean isPalindrome = list.isPlaindrome(list);
		
		System.out.println("Is palindrome:" + isPalindrome);

	}
}