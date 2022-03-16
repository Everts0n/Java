package com.company;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args){
        String[] monthsname = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter please month number (1-12): ");
        int chosenMonth = userInput.nextInt();
        if (chosenMonth > 12){
            System.out.print("Such month is not exist (Enter from 1 to 12)");
        }else if (chosenMonth < 1){
            System.out.print("Such month is not exist (Enter from 1 to 12)");
        }else{
            System.out.print("The month is " + monthsname[chosenMonth - 1]);
        }
    }
}
