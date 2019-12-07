package com.ds.singlelinkedlist;

import com.ds.singlelinkedlist.util.Node;



public class SingleLinkedList {
	
	  Node head;
	
	public void add( int element) {

		Node newNode = new Node(element);

		// if list is empty then point head to new node

		if (head == null) {
			
			head = newNode;
		}

		else {

			// traverse to the end and add element

			Node start = head;

			while (start.next != null) {
				// it's not start.next = start.next.next ( if it is one node this condition don't work), start from first node.
				start = start.next;
			}
			start.next = newNode;
		}

	}
	
	public void addFirst( int element) { // 1 2 3

		   Node newNode = new Node(element);
		   
		// don't assign head of list to new node, list will return null. Need to check with experts why this behavior.
		    /* Node head = list.head; */

			newNode.next = head;
			head = newNode;
				
	}
	
	public void insertAfterNode(Node prevNode, int element ) {
		
		if (prevNode == null) return;
		
		Node newNode = new Node(element);
		
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		
	}
	

	public void traverse() {
		
		Node currentNode = head;
		
		while(currentNode != null) {
			
			System.out.println("Element is :" + currentNode.value);
			
			currentNode = currentNode.next;
			
		}
	}
	
	public void printMiddle() {
		
		Node slow_ptr = head;
		Node fast_ptr = head;
		
		if (head != null) {

			while (fast_ptr != null && fast_ptr.next != null) {

				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}

			System.out.println("Middle Element is " + slow_ptr.value);
		}
	}
	
	public int detectLoop() {
		Node slow_p = head, fast_p = head;
		while (slow_p != null && fast_p != null && fast_p.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if (slow_p == fast_p) {
				System.out.println("Found loop");
				return 1;
			}
		}
		return 0;
	}

  
	
	public static void main(String[] args) {

		SingleLinkedList list = new SingleLinkedList();

		// add the values
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		list.addFirst(9);
		list.addFirst(10);
		
		list.insertAfterNode(list.head.next, 11);

		 list.traverse();
		 
		 list.printMiddle();

	}

}
