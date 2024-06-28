package com.DS.assignments;

import java.util.Arrays;

public class HeapSortTask {
	public static void sort(int arr[])
    {
        int N = arr.length;

        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int N, int i)
    {
        int largest = i; 
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest])
            largest = l;

        if (r < N && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, N, largest);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,4,5,6,2,4,6,2,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
