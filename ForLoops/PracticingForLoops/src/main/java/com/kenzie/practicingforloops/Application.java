package com.kenzie.practicingforloops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application {
    /***********************/
    /* For Loops           */
    /***********************/

    public static void exerciseOne(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise One"); // Do not modify the lines like this before each exercise, these are to make the console output more readable :)
        // - Change the following loop.
        //   The loop below will run twice, logging 0 and 1 to the console.
        //   Modify the loop so that it runs 10 times, logging 0 to 9 to the console.
        //
        // Write your code here

        for (int num = 0; num < 10; num++) {
            System.out.print(num + " ");  // Log like this using .print
        }

        System.out.println();  // Make sure to print a blank line using println
    }

    public static void exerciseTwo(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Two");
        // - Create another for loop
        // - Make your loop count from 1 to 20, logging each number to the console.
        //   1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        //   (This should include the number 20, but not include the number 0)
        //
        // Write your code here
    for(int x = 1; x <= 20; x++){
        System.out.print(x + " ");
    }
    System.out.println();
    }

    public static void exerciseThree(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Three");
        // - Create another for loop
        // - Make your loop count from 2 to 20, logging only EVEN numbers to the console.
        //   2 4 6 8 10 12 14 16 18 20
        //   (This should include the number 20, and the number 2, but not include the number 0)
        //
        // Write your code here
    for(int y = 2; y <= 20; y+=2){
        System.out.print(y + " ");
    }
    System.out.println();

    }
    public static void exerciseFour(){
        // ----------------------------------------------------------------------------------------------
        // The following exercises will use the numbers array below
        // - First fix this int array to have the proper syntax for declaring an array

        int[] numbers = new int[]{22, 15, 10, 19, 36, 2, 5, 20};

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Four");
        // - Create another for loop
        // - Have your loop iterate through every number in the numbers array, printing the number to the console.
        //
        // Write your code here
        for(int each: numbers){
            System.out.print(each + " ");
        }
        System.out.println();

    }
    public static void exerciseFive(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Five");
        // - Create another for loop
        // - Have your loop iterate through every number in the numbers array,
        //   printing out numbers LESS THAN (but not including) 20.
        //
        // Write your code here
        int [] numbers = {22, 15, 10, 19, 36, 2, 5, 20};
        for(int list: numbers){
            if(list < 20){
                System.out.print(list + " ");
            }

        }
        System.out.println();
    }
    public static void exerciseSix(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Six");
        // - Using a loop, multiply every number in the numbers array together.
        // - Print the result to the console.
        // - Hint: This should output 451440000
        // - Hint 2: Remember that 0 times anything is 0.  So your result variable should not start at zero :)
        //
        // Write your code here
        //I worked with the following outside help: Author: Lea Cook
        int [] numbers = {22, 15, 10, 19, 36, 2, 5, 20};
        int total = 1;
        for(int x:numbers){

            total = total*x;

        }

        System.out.println(total);
    }

    public static void exerciseSeven(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Seven");
        // - Using a loop, find the largest number in the numbers array.
        // - Print it to the console.
        // - Hint: The largest number is 36, so that's what your code should output.
        //   (But don't hardcode that, find it with a loop...)
        //
        // Write your code here
        /*
            I found the following on Google:
            Title: <Java program to find largest number in an array>
            updated: July 2nd, 2017
            Author <candid>
            http://java.candidjava.com/tutorial/Java-program-to-find-the-largest-number-in-an-array.htm
         */
        int [] numbers = {22, 15, 10, 19, 36, 2, 5, 20};
        int large = numbers[0];
        for(int i = 0; i <= numbers.length-1; i ++){

            if(numbers[i] > large){
                large = numbers[i];
            }

            }

        System.out.print(large);
        System.out.println();
        }

    public static void exerciseEight() {
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Eight");
        // - Using two loops, filter out every number smaller than 10 from the numbers array.
        // Note: check out the Arrays.toString() method!
        // Write your code here
        int[] numbers = {22, 15, 10, 19, 36, 2, 5, 20};
        int counter = 0;
        // - 1) You can loop through once to find the size of your new array.
        for(int x:numbers){
            if(x >= 10){
              counter++;
            }
        }
        // - 2) Initialize a new array with the length obtained from step 1.
       int j = 0;
        int[] arrayInt = new int[counter];
        // - 3) Loop through numbers array again to put numbers larger than or equal to 10 into the new array.
        for(int s:numbers){
            if(s >= 10){
                arrayInt[j] = s;
                j++;
            }
        }
        // - 4) Print your new array to the console.
    System.out.print(Arrays.toString(arrayInt));

    }
    public static void main(String[] args) {

        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();
        exerciseSix();
        exerciseSeven();
        exerciseEight();

        // When you are done with all of the exercises, check your console output to make sure it
        // matches the expected output of each exercise and remove any extraneous System.out.println()
        // statements from your code.

    }
}