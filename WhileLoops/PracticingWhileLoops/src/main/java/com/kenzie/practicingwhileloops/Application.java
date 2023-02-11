package com.kenzie.practicingwhileloops;

/***********************/
/* While Loops         */
/***********************/

// IMPORTANT - Print each of your arrays on one line, with a space between each number
// ex 0 1 2 3 4 5 6 7 8 9
// print a blank line after each kata

public class Application {
    public static void exerciseOne(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise One"); // Do not modify the lines like this before each exercise!
        // - Change the following loop.
        //   Modify the loop so that it runs 10 times, logging 0 to 9 to the console.
        //
        // Write your code here

        int index = 0;
        while (index < 10) {
            System.out.print(index + " ");  // Log like this using .print
            index++;
        }

        System.out.println();   // Make sure to print a blank line using .println
    }
    public static void exerciseTwo(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Two");
        // - Fix the following infinite loop.
        //   Uncomment the code below.
        //   Hint: Select all four lines, and then press CMD+/ (or Ctrl+/ for windows/linux)
        //         This will uncomment all four lines at once!
        //   There is an infinite loop!  What is it missing?
        // - Fix the loop so that it prints 0 to 15 and then stops.
        //
        // Write your code here

         int index = 0;
         while (index <= 15) {
           System.out.print(index + " ");
           index ++;
         }

        System.out.println();
    }
    public static void exerciseThree(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Three");
        // - Create a new while loop below.
        // - Make your loop count from 1 to 20, logging each number to the console.
        //   (This should include the number 20, but not include the number 0)
        // - Hint: Look at the reading, there is an example of this.
        // - Hint 2: Remember to set your initial index value
        // Write your code here
        int loop = 1;
        while (loop <= 20){
            System.out.print(loop + " ");
            loop ++;
        }
        System.out.println();
    }
    public static void exerciseFour(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Four");
        // - Create another while loop
        // - Make your loop count from 2 to 20, logging only EVEN numbers to the console.
        //   2 4 6 8 10 12 14 16 18 20
        //   (This should include the number 20, and the number 2, but not include the number 0)
        //
        // Write your code here
        int x = 2;
        while(x <= 20) {
        System.out.print(x + " ");
        x+=2;
        }
        System.out.println();
        }


    public static void exerciseFive(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Five");
        // - Create another while loop
        // - Make your loop count from 1 to 19, logging only ODD numbers to the console.
        //   1 3 5 7 9 11 13 15 17 19
        //   (This should include the number 9, and the number 1, but not include the number 0)
        //
        // Write your code here
        int banana = 1;
        while (banana < 20){
            System.out.print(banana + " ");
            banana+=2;
        }
        System.out.println();
    }
    public static void exerciseSix(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Six");
        // - Create another while loop
        // - Make your loop count from 5 up to 100, logging only multiple of 5 to the console.
        //   5 10 15 20 ... 90 95 100
        //   (This should include the number 100, and the number 5)
        //
        // Write your code here
        int j = 5;
        while(j <= 100){
            System.out.print(j + " ");
            j += 5;
        }
    System.out.println();
    }
    public static void exerciseSeven(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Seven");
        // - Create another while loop
        // - Make your loop count BACKWARDS, from 20 to 1, logging each number to the console.
        //   20 19 18 17 ... 2 1
        //   (This should include the number 20, but not include the number 0)
        //
        // Write your code here
        int neg = 20;
        while(neg > 0){
            System.out.print(neg + " ");
            neg --;
        }
    System.out.println();
    }
    public static void exerciseEight(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Eight");
        // - Create another while loop
        // - Make your loop count BACKWARDS, from 20 to 2, logging every EVEN number to the console.
        //   20 18 16 14 ... 4 2
        //   (This should include the number 20, but not include the number 0)
        //
        // Write your code here
        int backwards = 20;
        while (backwards > 0){
            System.out.print(backwards + " ");
            backwards-=2;
        }
    System.out.println();
    }
    public static void exerciseNine(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Nine");
        // - Create another while loop
        // - Make your loop count BACKWARDS, from 19 to 1, logging every ODD number to the console.
        //   19 17 15 13 ... 3 1
        //   (This should include the number 19, but not include the number 0)
        //
        // Write your code here
    int odd = 19;
    while (odd > 0){
        System.out.print(odd + " ");
        odd -= 2;

    }
    System.out.println();
    }
    public static void exerciseTen(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Ten");
        // - Create another while loop
        // - Make your loop count BACKWARDS, from 100 down to 5, logging each multiple of 5 to the console.
        //   100 95 90 ... 15 10 5
        //   (This should include the number 100, but not include the number 0)
        //
        // Write your code here
    int last = 100;
    while(last > 0){
        System.out.print(last + " ");
        last -= 5;
    }
    System.out.println();
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
        exerciseNine();
        exerciseTen();

        // When you are done with these exercises, check the console output to make sure it
        // matches the expected output of each exercise and remove any extraneous System.out.println()
        // statements from your code.  You can also run the unit tests in MainTest


    }
}