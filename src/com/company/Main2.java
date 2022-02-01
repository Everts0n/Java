package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        int peopleage;
        int constage;
        constage = 62;
        Scanner num = new Scanner(System.in);
        System.out.println("How old are you?");
        peopleage = num.nextInt();
        if(peopleage >= constage){
            System.out.print("Your pension is 300euro per month");
        }else{
            int dif = constage - peopleage;
            if(dif < 5){
                System.out.print("You need to work just " + dif + " years more for pension");
            }else{
                System.out.print("You are too young for pension!");
            }
    }
}
    }

