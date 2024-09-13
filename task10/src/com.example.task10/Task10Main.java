package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {0, 0, 0};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
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
        return numMin;
    }

}