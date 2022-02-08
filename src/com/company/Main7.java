package com.company;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){
        int a;
        int b;
        Scanner num = new Scanner (System.in);
        System.out.print("Please enter mesh size (max 10x10): ");
        a = num.nextInt();
        b = num.nextInt();
        for(int i = 1; i<=a; i++){
            System.out.print("\n");
            for(int j = 1; j<=b; j++){
                System.out.print(j * i + "\t");
            }
        }
    }
}
