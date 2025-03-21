package org.example;

import java.util.Scanner;

public class majority_elements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = {3, 3, 4, 3, 6, 7, 3, 2, 2};

        System.out.println("Majority element is: " + majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {
        int number = arr[0];
        int count = 1;

        // Phase 1: Find a candidate for majority element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    number = arr[i];
                    count = 1;
                }
            }
        }

        // **Phase 2: Verify the candidate** (only needed if the problem doesn’t guarantee a majority element)
        count = 0;
        for (int num : arr) {
            if (num == number) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return number;
        } else {
            throw new IllegalArgumentException("No majority element found"); // This won't happen for this problem.
        }
    }
}
