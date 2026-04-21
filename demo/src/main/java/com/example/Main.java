package com.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Print using classic for loop
        System.out.println("=== Classic for loop ===");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Print using for-each loop
        System.out.println("\n=== For-each loop ===");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Print using Arrays.toString()
        System.out.println("\n=== Arrays.toString() ===");
        System.out.println(java.util.Arrays.toString(numbers));

           // Create array with random numbers
        int size = 5;
        int[] numbers2 = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers2[i] = random.nextInt(100); // random numbers between 0 and 99
        }

        // Sort the array
        Arrays.sort(numbers2);
        // Print original array
        System.out.println("===  Original array ===");
        System.out.println(Arrays.toString(numbers2));

        bubbleSort(numbers2);
        System.out.println("\nSorted array");
        printArray(numbers2);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Print each pass to visualize the process
            System.out.println("Pass " + (i + 1) + ": " + java.util.Arrays.toString(arr));

            // If no swaps occurred, array is already sorted
            if (!swapped) break;
        }
    }

    static void printArray(int[] arr) {
        System.out.println(java.util.Arrays.toString(arr));
    }
}
