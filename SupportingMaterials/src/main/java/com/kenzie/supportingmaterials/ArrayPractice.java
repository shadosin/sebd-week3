package com.kenzie.supportingmaterials;

public class ArrayPractice {

    public static void practiceOne() {
        String[] colors = {"red", "burgundy", "teal", "mauve", "chalk", "brick"};

        // Access the color "teal" of the array

        // Use System.out.println to print the value to the console.
    }

    public static void practiceTwo() {
        // Create an array named friends
        // Initialize it with three strings
        // Each string should be the name of a person

    }

    public static void practiceThree() {
        int[] favoriteNumbers = new int[5];
        String[] favoriteStrings = new String[3];

        // Using the length property, set the last item of favoriteNumbers to 100

        // Using the length property, set the second to last item in favoriteStrings to "Hello"

        // Put your code before this line.
        System.out.println("favoriteNumbers:");
        System.out.println(favoriteNumbers[0]);
        System.out.println(favoriteNumbers[1]);
        System.out.println(favoriteNumbers[2]);
        System.out.println(favoriteNumbers[3]);
        System.out.println(favoriteNumbers[4]);

        System.out.println("favoriteStrings:");
        System.out.println(favoriteStrings[0]);
        System.out.println(favoriteStrings[1]);
        System.out.println(favoriteStrings[2]);
    }

    public static void main(String[] args) {
        practiceOne();
        practiceTwo();
        practiceThree();
    }
}
