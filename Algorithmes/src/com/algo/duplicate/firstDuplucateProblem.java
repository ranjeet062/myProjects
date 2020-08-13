package com.algo.duplicate;

import java.util.HashSet;
import java.util.Set;

public class firstDuplucateProblem {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 5, 3 };

		// if return -1, means no duplicate has found
		System.out.println(findDuplicate(arr, 10, 3));

		System.out.println(firstDuplicate2(arr));
	}

	public static int findDuplicate(int[] arr, int hightestval, int noOfRepeadedValu) {

		boolean[] duplicateFlag = new boolean[hightestval + noOfRepeadedValu];
		for (int i = 0; i < arr.length; i++) {
			if (duplicateFlag[arr[i]]) {
				return arr[i];
			} else {
				duplicateFlag[arr[i]] = true;
			}
		}
		return -1;
	}

	public static int firstDuplicate2(int[] arr) {
		int min = -1;
		Set<Integer> set = new HashSet<>();
		for (int i : arr) {
			if (set.contains(i)) {
				return i;
			} else {
				set.add(i);
			}
		}
		return min;
	}

}
