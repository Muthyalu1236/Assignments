package com.DS.assignments;

class LinkedListDemo{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	static LinkedListDemo insert(LinkedListDemo list, int data) {
		Node new_node = new Node(data);
		
		if(list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			
			while(last.next != null) {
				last = last.next;
			}
			
			last.next = new_node;
		}
		return list;
	}
	
	void remove(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        Node prev = null;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        prev.next = current.next;
    }
	
	public static void printList(LinkedListDemo list) {
		Node currNode = list.head;
		
		while(currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}
}

public class LinkedListTask {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListDemo list = new LinkedListDemo();
		
		list = list.insert(list, 10);
		list = list.insert(list, 20);
		list = list.insert(list, 30);
		list = list.insert(list, 40);
		list = list.insert(list, 50);
		
		
		list.printList(list);
		
		list.remove(30);
		
		list.printList(list);
	}
}
