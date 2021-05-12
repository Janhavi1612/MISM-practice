package com.practice.firstSetOfProblems.primeNumbers;

import java.util.Scanner;

import static java.lang.Math.pow;

public class HundredPrimeNumbers {

    public void print100PrimeNumbers(){
        int number = 2; //firstPrimeNumber
        int counter = 0;
        while(counter<100){
            if(number>2){
                if(isPrime(number)){
                    System.out.println(number);
                    counter++;
                }
            }
            else{
                System.out.println(number);
                counter++;
            }
            number++;
        }
    }

    public boolean isPrime(int number) {
        for(int i = 2;i<=pow(number,0.5);i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HundredPrimeNumbers hundredPrimeNumbers = new HundredPrimeNumbers();
        hundredPrimeNumbers.print100PrimeNumbers();
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.println("Enter number: ");
            number = scanner.nextInt();
            if(hundredPrimeNumbers.isPrime(number)){
                System.out.println("IT IS PRIME");
            }
            else {
                System.out.println("NOT PRIME");
            }
        }while (number != 0);
        scanner.close();
    }
}
