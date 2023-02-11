package com.kenzie.supportingmaterials;

public class ForLoopsPractice {

    public static void practiceOne() {
        for (int index = 0; index < 5; index++) {
            System.out.println(index);
        }
    }

    public static void practiceTwo() {
        for (int index = 2; index < 8; index++) {
            System.out.println(index);
        }
    }

    public static void practiceThree() {
        String[] words = {"humpty","dumpty","sat","on","a","wall", "humpty", "dumpty", "had", "a", "great", "fall"};
        int countMatches = 0;
        // Loop over the array of words
        for(int index = 0; index < words.length; index ++){
            String currentWord = words[index];
            System.out.print(currentWord + " ");

            if(currentWord.equals("humpty")){
                countMatches++;
            }

        }
        // Declare a counter outside the loop
        // Add one to the counter if the current word is "humpty"
        System.out.println();
        System.out.println("Number of matches:" + countMatches);
    }

    public static void practiceFour() {
        String[] words = {"humpty","dumpty","sat","on","a","wall", "humpty", "dumpty", "had", "a", "great", "fall"};
        for(String page: words) {
            System.out.println(page);
        }
    }

    public static void main(String[] args) {
        practiceOne();
        practiceTwo();
        practiceThree();
    }

}
