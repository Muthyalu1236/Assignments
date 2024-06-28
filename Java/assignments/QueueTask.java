package com.DS.assignments;

class QueueDemo{
	private static int front,rear,capacity;
	private static int queue[];
	
	QueueDemo(int c){
		front=rear=0;
		capacity=c;
		queue= new int[capacity];
	}
	
	static void queueEnque(int data) {
		if(capacity==rear) {
			System.out.println("\nQueue is full");
		} else {
			queue[rear] = data;
			rear++;
		}
		return;
	}
	
	static void queueDeque(int data) {
		if(front==rear) {
			System.out.println("\nQueue is empty");
		} else {
			
			for(int i=0;i<rear-1;i++) {
				queue[i] = queue[i+1];
			}
			
			if(rear<capacity) {
				queue[rear]=0;
			}
			rear--;
			return;
		}
	}
	
	static void queueDislay() {
		if(front==rear) {
			System.out.println("Queue is empty");
		} else {
			for(int i=0;i<rear;i++) {
				System.out.print(queue[i]+" ");
			}
			System.out.println();
		}
	}
	
	static void queueFront() {
		if(front == rear) {
			System.out.println("Queue is empty.");
		} else {
			System.out.println("The front value is: "+queue[front]);
		}
	}
	
}

public class QueueTask {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueDemo obj = new QueueDemo(5);
		
		obj.queueEnque(10);
		obj.queueEnque(20);
		obj.queueEnque(30);
		obj.queueEnque(40);
		obj.queueEnque(50);
		
		obj.queueDislay();
		
		obj.queueDeque(10);
		
		obj.queueDislay();
		
		obj.queueFront();
	}
}
