package com.company;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args){
        System.out.println("This is a calculator");
        int num1;
        int num2;
        int result;
        char mark;
        boolean IsTrue = true;
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter please first number: ");
        num1 = scn.nextInt();
        System.out.print("Enter please second number: ");
        num2 = scn.nextInt();

        while (IsTrue) {
            System.out.print("Enter please an operator (+,-,*,/): ");
            mark = scn.next().charAt(0);

            switch (mark) {
                case '+':
                    result = num1 + num2;
                    System.out.print("Result is: " + result);
                    IsTrue = false;
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.print("Result is: " + result);
                    IsTrue = false;
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.print("Result is: " + result);
                    IsTrue = false;
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.print("Result is: " + result);
                    IsTrue = false;
                    break;

                default:
                    System.out.print("Incorrect operator! ");
                    IsTrue = true;

            }
        }

//            default:
//                while (IsTrue){
//                System.out.println("Error, please enter operator again: ");
//                mark = scn.next().charAt(0);
//                switch (mark) {
//                    case '+':
//                        result = num1 + num2;
//                        System.out.print("Result is: " + result);
//                        IsTrue = false;
//                        break;
//                    case '-':
//                        result = num1 - num2;
//                        System.out.print("Result is: " + result);
//                        IsTrue = false;
//                        break;
//                    case '*':
//                        result = num1 * num2;
//                        System.out.print("Result is: " + result);
//                        IsTrue = false;
//                        break;
//                    case '/':
//                        result = num1 / num2;
//                        System.out.print("Result is: " + result);
//                        IsTrue = false;
//                        break;
//                    default:
//                        IsTrue = true;
//                }




        }



    }


