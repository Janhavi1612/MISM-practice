package com.practice.firstSetOfProblems.fileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    private static String FILE_PATH = "src/com/practice/firstSetOfProblems/fileReader/sample.txt";

    public int findOccurrences(String word){
        int counter=0;
        try {
            List<String> input = Files.readAllLines(Paths.get(FILE_PATH));

            for(int i=0;i<input.size();i++){
                if(input.get(i).contains(word)){
                    counter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to be searched: ");
        String wordToSearch = scanner.next();
        FileReader fileReader = new FileReader();
        int occurrences = fileReader.findOccurrences(wordToSearch);
        if(occurrences>0){
            System.out.println("The word : *"+wordToSearch + "* is found in file "+ occurrences +" times.");
        }
        else{
            System.out.println("The word : *"+wordToSearch + "* isn't present in the file.");
        }
        scanner.close();
    }
}
