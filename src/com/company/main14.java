package com.company;

import java.util.Scanner;

public class main14 {
    public static void main(String[] args){
        System.out.print("Choose the car Bmw, Audi or mercedes");
        String car;
        Scanner scn = new Scanner(System.in);
        car = scn.nextLine();

        switch(car){
            case "bmw":
            case "Bmw":
                System.out.print("Bmw is fast");
                break;
            case "Audi":
            case "audi":
                System.out.print("Audi is slow");
                break;
            case "Mercedes":
            case "mercedes":
                System.out.print("Mercedes is black");
                break;
            default:
                System.out.print("I dont know this car");

        }

    }
}
