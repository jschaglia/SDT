package com.example;

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
    }
}