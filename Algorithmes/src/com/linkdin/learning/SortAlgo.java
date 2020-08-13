package com.linkdin.learning;

import javax.xml.transform.sax.SAXTransformerFactory;

public class SortAlgo {

	public static void main(String[] args) {
		int[] arrSelecton = { 60, 10, 70, 20, 80, 30, 90, 40, 100, 50 };
		System.out.println("Selection Sort......!!!!! --- with n2 complexity");
		printArray(selectionSort(arrSelecton));
		System.out.println("");
		int[] arrBubble = { 60, 10, 70, 20, 80, 30, 90, 40, 100, 50 };
		System.out.println("Bubble Sort......!!!!! --- with 0(n2) complexity");
		printArray(selectionSort(arrBubble));

		System.out.println("");
		int[] arrInsertion = { 60, 10, 70, 20, 80, 30, 90, 40, 100, 50 };
		System.out.println("Insertion Sort......!!!!! --- with O(n2) complexity");
		printArray(selectionSort(arrInsertion));

		System.out.println("");
		int[] arrMergeSort = { 60, 10, 70, 20, 80, 30, 90, 40, 100, 50 };
		System.out.println("Merge Sort......!!!!! --- with O(nlog2n) complexity");
		printArray(selectionSort(arrMergeSort));

	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + ",");
		}
	}

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				// swap the data if current is bigger that next
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			// find the minIndex in arr
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// swap current with minindexed data.
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;

		}

		return arr;
	}

	public static int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}

		return arr;
	}
	// Bubble Sort - very inefficient
	// Selection Sort - better than bubble. runtime is independent of ordering
	// of elements.
	// Insertion Sort - relatively good for small list. relatively good for
	// partially sorted list

	public static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = start + end / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}

	}

	public static void merge(int[] arr, int start, int mid, int end) {

		int n1 = mid - start + 1;
		int n2 = end - mid;

		int[] left = new int[n1];
		int[] right = new int[n2];

		for (int i = 0; i < n1; i++) {
			left[i] = arr[start + i];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = arr[mid + 1 + j];
		}
		int i = 0, j = 0;
		for (int k = start; k <= end; k++) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
		}

	}

	public static void quickSort(int[] arr, int start, int end) {

		if (start < end) {
			int pivot = partitioned(arr, start, end);
			quickSort(arr, start, pivot-1);
			quickSort(arr, pivot + 1, end);
		}
	}

	private static int partitioned(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i= start;
		for(int j = start; j < end-1; j++){
			if(arr[j] <= pivot){
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}
		arr[end]=arr[i];
		arr[i]=pivot;
		return i;
	}
	public static void shellSort(int[] arr, int start, int end) {

		
	}
}
