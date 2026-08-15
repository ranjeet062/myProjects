package org.example;

public class PushZero {
    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 4, 3, 0, 5, 1};
        int i = 0;
        int n = arr.length;

        while (i < n) {
            if (arr[i] == 0) {
                for (int k = i; k < n - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                arr[n - 1] = 0;
                n--;
            } else {
                i++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
