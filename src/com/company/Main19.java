package com.company;

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args){
        int num;
        int result = 0;
        int count = 0;
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи лимит размера чисел: ");
        n = scn.nextInt();

        while(count<10) {
            count++;
            num = (int) Math.round(Math.random() * n);
            if(count<10){
                System.out.print(num + "+");
            }else {
                System.out.print(num);
            }
            result = result+num;
        }

        System.out.print("=" + result);
    }
}
