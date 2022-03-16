package com.company;

import java.util.Scanner;

public class Main24 {
    public static void main(String[] args){
        String someString;
        char someChar;
        int count = 0;
        int totalLetters = 0;
        int countWord = 1;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter word or sentences to count some char and total letters in your string: ");
        someString = scn.nextLine();
        System.out.println("Please write some letter: ");
        someChar = scn.next().charAt(0);

        for(int i = 0; i < someString.length(); i++){
            if(someString.charAt(i) == someChar){
                count++;
            }
            if(someString.charAt(i) != ' ' ){
                totalLetters++;
            }
            if(someString.charAt(i) == ' '){
                countWord++;

            }
        }

        System.out.println(count + " special letters");
        System.out.println(totalLetters + " total letters");
        System.out.print(countWord + " total words");
    }
}
