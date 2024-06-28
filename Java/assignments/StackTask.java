package com.DS.assignments;

class StackDemo{
	final static int max=1000;
	int top;
	int a[] = new int[max];
	
	boolean isEmpty() {
		return (top<0);
	}
	
	StackDemo(){
		top=-1;
	}
	
	boolean push(int x) {
		if(top>=max-1) {
			System.out.println("Stack overflow.");
			return false;
		} else {
			a[++top]=x;
			System.out.println(x + " is pushed into stack.");
			return true;
		}
	}
	
	int pop() {
		if(top<0) {
			System.out.println("Stack underflow.");
			return 0;
		} else {
			return a[top--];
		}
	}
	
	int peek() {
		if(top<0) {
			System.out.println("Stack underflow.");
			return 0;
		} else {
			return a[top];
		}
	}
	
	void display() {
		for(int i=top;i>-1;i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}

public class StackTask {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackDemo o = new StackDemo();
		o.push(10);
		o.push(20);
		o.push(30);
		o.push(40);
		o.push(50);
		
		o.display();
		
		System.out.println(o.pop());

		o.display();
		
		System.out.println(o.peek());
	}

}
