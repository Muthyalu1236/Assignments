package com.DS.assignments;

public class BinarySearchTask {
	public static int binarySearch(int[] arr,int k) {
		int low=0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = low+(high-low)/2;
			
			if(arr[mid] == k) {
				return mid;
			}
			
			if(arr[mid]>k) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,5,6,7,9,34,67};
		
		int result = binarySearch(arr,34);
		
		if(result != -1) {
			System.out.println(result);
		} else {
			System.out.println(-1);
		}
	}
}
