package com.bootcoding.leetcode.PracticeProblems;

public class ArrayLeftRotation {
    // Function to rotate array to the left by d positions
    static void leftRotate(int arr[], int d) {
        int n = arr.length;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    // Function to reverse an array in the specified range
    static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to print an array
    static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int rotations = 1;

        System.out.println("Original Array:");
        printArray(array);

        leftRotate(array, rotations);

        System.out.println("Array after left rotation by " + rotations + " positions:");
        printArray(array);

        System.out.println(" ");

        int array1[] = {1, 2, 3, 4, 5, 6, 7};
        int rotations1 = 2;

        System.out.println("Original Array:");
        printArray(array);

        leftRotate(array, rotations);

        System.out.println("Array after left rotation by " + rotations + " positions:");
        printArray(array);
    }
}


