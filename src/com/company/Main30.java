package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        String[] monthsname = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        System.out.print("Please enter name of months January-Decembers: ");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();

        if(Arrays.asList(monthsname).contains(name)){
            System.out.print(Arrays.asList(monthsname).indexOf(name) + 1);
        }else{
            System.out.print("Error!");
        }

    }
}
