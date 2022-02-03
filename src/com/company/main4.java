package com.company;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int first;
        System.out.println("Enter first number:" );
        first = scn.nextInt();

        if(first == 5){
            System.out.print("Number is 5");
        }else{
            System.out.print("Number is not 5");
        }
    }
}
