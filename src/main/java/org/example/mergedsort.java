package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class mergedsort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int number = scan.nextInt();
        int[] arr = new int[number];

        System.out.println("Enter the elements:");
        for (int i = 0; i < number; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sorting the array using merge sort
        mergeSort(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        scan.close(); // Close scanner
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively divide the array
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;

        // Merge the two sorted arrays
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements of leftArr
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        // Copy remaining elements of r
    }}