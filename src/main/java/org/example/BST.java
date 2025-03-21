package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BST {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Provide 10 numbers for the array:");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
        }

        // Convert array to ArrayList
        ArrayList<Integer> sorting = new ArrayList<>();
        for (int num : arr) {
            sorting.add(num);
        }

        // Sort the ArrayList in ascending order
        sorting.sort(null);
        System.out.println("Sorted ArrayList: " + sorting);

        // Convert ArrayList back to array
        int[] sortedarray = new int[sorting.size()];
        for (int i = 0; i < sorting.size(); i++) {
            sortedarray[i] = sorting.get(i);
        }

        // Perform Binary Search
        System.out.println("Enter the number to search:");
        int number = scan.nextInt();
        scan.close(); // Close scanner to prevent resource leak

        int result = binarySearch(sortedarray, number);

        if (result != -1) {
            System.out.println("Number found at index: " + result);
        } else {
            System.out.println("Number not found.");
        }
    }

    // Binary Search Function
    public static int binarySearch(int[] sortedarray, int number) {
        int low = 0;
        int high = sortedarray.length - 1; // Corrected high index

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents integer overflow

            if (sortedarray[mid] == number) {
                return mid; // Return index if found
            } else if (sortedarray[mid] < number) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return -1; // Number not found
    }
}
