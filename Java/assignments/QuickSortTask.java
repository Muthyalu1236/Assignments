package com.DS.assignments;

import java.util.Arrays;

public class QuickSortTask {
	static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static int partition(int[] arr, int low, int high){
		int pivot = arr[high];
		
		int i = (low - 1);
		for ( int j = low; j <= high; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return (i+1);
	}
	
	static void quickSort(int[] arr,int low,int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,4,5,6,2,4,6,2,1};
		int l = arr.length-1;
		quickSort(arr,0,l);
		System.out.println(Arrays.toString(arr));

	}

}
