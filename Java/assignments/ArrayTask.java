package com.DS.assignments;

public class ArrayTask {
	int arr[]; 
	int size;
	int lastIndex=0;
	
	ArrayTask(int size) {
		this.arr = new int[size];
		this.size = size;
	}
	
	void add(int n) {
		if(lastIndex < size) {	
			arr[lastIndex] = n;
			lastIndex++;
		} else {
			System.out.println("Array is full.");
		}
	}
	
	void add(int i, int n) {
		if(i>size || i<0) {
			System.out.println("Index out of bounds.");
		}else {
			arr[i] = n;
		}
	}
	
	void delete(int n) {
		if(n>size || n<0) {
			System.out.println("Array index out of bounds.");
		} else if(n>lastIndex){
			return;
		} else {
			for(int i=n;i<size-1;i++) {
				arr[i] = arr[i+1];
			}
			lastIndex--;
		}
	}
	
	void display() {
		for(int i=0; i<lastIndex; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTask obj = new ArrayTask(5);
		
		obj.add(4);
		obj.add(56);
		obj.add(23);
		obj.add(78);
		obj.add(6);

		obj.display();
		
		obj.delete(2);
		
		obj.display();
		
		obj.add(2,100);
		
		obj.display();

	}

}
