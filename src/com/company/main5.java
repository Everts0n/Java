package com.company;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args){
        System.out.println("This is a calculator");
        int num1;
        int num2;
        int result;
        char mark;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter please first number: ");
        num1 = scn.nextInt();
        System.out.print("Enter please an operator (+,-,*,/): ");
        mark = scn.next().charAt(0);
        System.out.print("Enter please second number: ");
        num2 = scn.nextInt();

        switch (mark){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Error!!!");
                return;
        }
        System.out.print("Result is: " + result);


    }
}
