package com.DS.assignments;

public class LinearSearchTask {
	static void linearSearch(int[] arr, int k) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == k) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,5,12,6,7,9,4};
		linearSearch(arr,6);
		linearSearch(arr,54);

	}
}
