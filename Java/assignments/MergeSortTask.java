package com.DS.assignments;

import java.util.Arrays;

public class MergeSortTask {
	private static void mergeSort(int[] array) {
		
		int length = array.length;
		if (length <= 1) return; //base case
		
		int middle = length / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];
		
		int i = 0; //left array
		int j = 0; //right array
		
		for(; i < length; i++) {
			if(i < middle) {
				leftArray[i] = array[i];
			}
			else {
				rightArray[j] = array[i];
				j++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);
	}
	
	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0; //indices
		
		//check the conditions for merging
		while(l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}
			else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		while(l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while(r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,6,2,4,6,2,1};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
