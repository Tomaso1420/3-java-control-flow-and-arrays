package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        swap(swap(arr, 0), 1);

    }

    static int[] swap(int[] arr, int num) { // num - index of element which needs be swapped with min
        int min = arr[num];
        int numMin = 0;
        for (int i = num + 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                numMin = i;
            }
        }
        int temp = arr[num];
        arr[num] = arr[numMin];
        arr[numMin] = temp;
        return arr;
    }
}