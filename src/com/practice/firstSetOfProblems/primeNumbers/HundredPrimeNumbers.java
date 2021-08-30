package com.practice.firstSetOfProblems.primeNumbers;

import java.util.ArrayList;
import java.util.List;
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

    public void printPrimeNosEfficient(int end){
        List<Boolean> primeSetter = new ArrayList<>(end);
        for(int i=0;i<end;i++){
            if(i==0){
                primeSetter.add(i,false);
            }
            else{
                primeSetter.add(i,true);

            }
        }
        for(int i=2;i<=pow(end,0.5);i++){
            int temp = i;
            temp += i;
            while(temp<=end){
                primeSetter.set(temp-1,false);
                temp += i;
            }
        }
        for(int i=1;i<=end;i++){
            if(primeSetter.get(i-1)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        HundredPrimeNumbers hundredPrimeNumbers = new HundredPrimeNumbers();
        hundredPrimeNumbers.printPrimeNosEfficient(100);
        /*hundredPrimeNumbers.print100PrimeNumbers();
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
        scanner.close();*/
    }
}
