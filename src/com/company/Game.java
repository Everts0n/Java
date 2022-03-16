package com.company;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        int num1, num2, result;
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        boolean True = true;
        boolean True2 = true;
        int range = 0;
        while (True) {

            num1 = (int) Math.round(Math.random() * 100);


            System.out.println("Это игра!");
            System.out.println("Правила: первое число это секрет, сумма 2ух чисел должна быть меньше 100");
            System.out.println("Так же ваше 2 число должно быть больше 10");
            System.out.println("Пожалуйста введите второе число: ");
            num2 = scn.nextInt();

            while (True2) {
                if (num2 < 10) {
                    System.out.println("Второе число должно быть больше 10");
                    System.out.println("Введите 2 число еще раз: ");
                    num2 = scn.nextInt();
                } else {
                    result = num1 + num2;

                    if (result < 100) {
                        System.out.println("Ты выйграл игру!!! Потому что сумма этих чисел была: " + result + "(меньше 100)");
                        System.out.println("Первое секретное число было: " + num1);
                        System.out.println(" ");
                    } else {
                        System.out.println("Ты проиграл!!! Потому что сумма этих чисел была: " + result);
                        System.out.println("Первое секретное число было: " + num1);
                        System.out.println(" ");
                    }
                    break;


                }
            }
            System.out.print("Хочешь ли ты сыграть еще раз? (yes/no): ");
            True = scn2.nextLine().equalsIgnoreCase("yes");
        }
    }
}
