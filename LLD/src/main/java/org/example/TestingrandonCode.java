package org.example;

public class TestingrandonCode {

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7};
            rotate(arr, 2);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        private static void rotate(int[] arr, int k) {
            for (int j = 0; j < k; j++) {
                rotateByOne(arr);
            }
        }

        private static void rotateByOne(int[] arr){
            int curr = arr[0];
            int next = arr[1];
            for (int i = 1; i < arr.length; i++) {
                next = arr[i];

                if (i == arr.length - 1){
                    arr[0] = next;
                    arr[i] = curr;
                } else {
                    arr[i] = curr;
                }

                curr = next;
            }
        }

}
