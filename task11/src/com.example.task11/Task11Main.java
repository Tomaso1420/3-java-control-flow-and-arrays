package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = null;
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }
    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        } else {
            int min = arr[0];
            int numMin = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (min == arr[i]) {
                    numMin = i;
                }
            }
            int temp = arr[0];
            arr[0] = arr[numMin];
            arr[numMin] = temp;
        }
    }
}