package com.company;

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args){
//        boolean play = true;
//        int i = 0;
//        while(play){
//            i++;
//            System.out.println(i);
//            play = false;
//        }
//
//        int num = 6;
//        while(num<100){
//            System.out.print(" " + num);
//            num+=6;
//
//        }
//        while(true) {
//            int number;
//            int result = 1;
//            int range = 1;
//
//            System.out.print("Введите число для возведения в степень: ");
//            Scanner scn = new Scanner(System.in);
//            number = scn.nextInt();
//            while (true) {
//                result = result * number;
//                System.out.println(number + " в степени " + range + " = " + result);
//                range++;
//
//                if (range > 10) {
//                    break;
//                }
//
//    }
//        }
        while(true) {
            int num;
            int range;
            int result = 1;

            Scanner scn2 = new Scanner(System.in);
            System.out.print("Введите число для возведения в степень: ");
            num = scn2.nextInt();
            System.out.print("Введите показатель степени: ");
            range = scn2.nextInt();

            for (int i = 0; i < range; i++) {
                result = result * num;
            }
            System.out.println(result);
        }


    }
}
