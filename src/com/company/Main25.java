package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main25 {
    public static void main(String[] args){
        String someString;
        int countWord = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter word or sentences to count some char and total letters in your string: ");
        someString = scn.nextLine();

        String[] totalWords = someString.split(" ");
        System.out.println(Arrays.toString(totalWords));

        int i = 0;
            for (String element : totalWords) {
                if (!totalWords[i].equals("")) {
                    countWord++;
                }
                i++;
            }

        System.out.print(countWord + " total words");





    }
}

