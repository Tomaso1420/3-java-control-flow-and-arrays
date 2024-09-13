package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int countOfMoreThan1000 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1000) {
                countOfMoreThan1000++;
            }
        }
        int[] outputArray = new int[arr.length - countOfMoreThan1000];
        int i = 0;
        for (int y = 0; y < arr.length; y++) {
            if (arr[y] < 1000) {
                outputArray[i] = arr[y];
                i++;
            } else {
                continue;
            }

        }
        return outputArray;
    }
}

