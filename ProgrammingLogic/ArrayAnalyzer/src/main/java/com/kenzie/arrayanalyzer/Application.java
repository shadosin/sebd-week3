package com.kenzie.arrayanalyzer;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Application {

    // Write all of your code between the two curly braces labelled below

    public static void arrayAnalyzer(int[] numbers) { // This curly brace
        System.out.println("****Array Analyzer Program****");
        int large = numbers[0];
        int small = numbers[0];
        double sum = 0;
        int counterEven = 0;
        int counterOdd = 0;
        int counterOct = 0;
        double average = 0.0;
        int j = 0;
        int k = 0;
        int l = 0;
        for(int m: numbers) {
            if (m % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }
            if (m % 8 == 0) {
                counterOct++;
            }
        }

        int[] evenArray = new int [counterEven];
        int[] oddArray = new int[counterOdd];
        int[] octArray = new int[counterOct];

        for (int i = 0; i <= numbers.length - 1; i++) {

            if (numbers[i] > large) {
                large = numbers[i];
            } else if (numbers[i] < small) {
                small = numbers[i];
            }
            sum = sum + numbers[i];
            average = sum / (numbers.length);


            if (numbers[i] % 2 == 0) {
                counterEven++;
            } else{
                counterOdd++;}

            if(numbers[i] % 8 == 0){
                counterOct ++;
            }

            if (numbers[i] % 2 == 0){
                evenArray[j] = numbers[i];
                j++;
            }else{
                oddArray[k] = numbers[i];
                k++;
            }
            if(numbers[i] % 8 == 0){
                octArray[l] = numbers[i];
                l ++;
            }

        }
        /* I have no idea how to print the array created by the
        if statement outside of the loop/condtional. I'm having
        issues assigning the numbers to the array.
         */
            System.out.println("Largest Number:" + " " + large);
            System.out.println("Smallest Number:" + " " + small);
            System.out.println("Sum:" + " " + sum);
            System.out.println("Average:" + " " + average);
            System.out.println("Even Numbers:" + " " + Arrays.toString(evenArray));
            System.out.println("Odd Numbers:" + " " + Arrays.toString(oddArray));
            System.out.println("Numbers divisible by 8:" + " " + Arrays.toString(octArray));

} // This curly brace

    public static void main(String[] args) {
        int[] data = new int[]{ 469, 755, 244, 245, 758, 450, 302, 20, 712, 71, 456, 21, 398, 339, 882, 848, 179, 535, 940, 472 };

        arrayAnalyzer(data);

    }
}