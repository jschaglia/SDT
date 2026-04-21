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
        int size = 10;
        int[] numbers2 = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers2[i] = random.nextInt(100); // random numbers between 0 and 99
        }

        // Sort the array
        Arrays.sort(numbers2);



        // Print sorted array in descending order
        System.out.println("\n=== Sorted array (descending) ===");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();
    }
}
