package com.practice.firstSetOfProblems.palindrome;

import java.util.Scanner;

public class Palindrome {

    public boolean isPalindrome(String word){
        char[] wordChars = word.toCharArray();
        int length = wordChars.length;
        boolean isPalindrome = true;
        for(int i=0;i<length/2;i++){
            if(wordChars[i] != wordChars[length-i-1]){
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        Scanner scanner = new Scanner(System.in);
        String word;
        do{
            System.out.println("Enter word: ");
            word = scanner.next();
            word = word.toLowerCase();
            if(palindrome.isPalindrome(word)){
                System.out.println("IT IS PALINDROME");
            }
            else {
                System.out.println("NOT PALINDROME");
            }
        }while (!word.equals("exit"));
        scanner.close();
    }
}
