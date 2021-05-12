package com.practice.firstSetOfProblems.Sorting;

import java.util.Scanner;

public class NumberSorting {

    public void printSortedOrder(int[] numberArray, int size){
        for(int i=1;i<size;i++){
            for(int j=i;j<size;j++){
                if(numberArray[j-1] > numberArray[j]){
                    int temp = numberArray[j];
                    numberArray[j] = numberArray[j-1];
                    numberArray[j-1] = temp;
                }
            }
        }

        System.out.println("SORTED ARRAY: ");
        for(int i=0;i<size;i++){
            System.out.println(numberArray[i]);
        }

    }

    public static void main(String[] args) {
        NumberSorting numberSorting = new NumberSorting();
        int[] numberArray = takeInput();
        numberSorting.printSortedOrder(numberArray, numberArray.length);
    }

    private static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total no of inputs: ");
        int size = scanner.nextInt();
        int[] numberArray = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter "+(i+1)+" number:");
            numberArray[i] = scanner.nextInt();
        }
        scanner.close();
        return numberArray;
    }
}




