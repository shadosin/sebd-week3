package com.kenzie.supportingmaterials;

public class LoopsPractice {
    public static void practiceOne() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    public static void practiceTwo() {

        int number = 0;

        while (number < 10) {
            ;
            number += 2;

        }
        System.out.println(number);
    }

    public static void practiceThree() {
        String[] words = {"humpty","dumpty","sat","on","a","wall"};
        int i = 0;

        while (i < words.length){
            System.out.println(words[i]);
            i++;
        }

    }

    public static void main(String[] args) {
        practiceOne();
        practiceTwo();
        practiceThree();
    }

}
