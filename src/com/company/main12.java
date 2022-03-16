package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class main12 {
    public static void main(String[] args) {
        int[] massive;
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter length of massive: ");
        n = scn.nextInt();
        massive = new int[n];

        for (int i = 0; i < massive.length; i++) {
            System.out.print("Enter massive[" + i + "] = ");
            massive[i] = scn.nextInt();
        }
        System.out.println("massive : " + Arrays.toString(massive));

        int result;
        result = 0;
        for(int i = 0; i < massive.length; i++) {
            result = result + massive[i];
            if(i < massive.length - 1) {
                System.out.print(massive[i] + "+");
            }else{
                System.out.print(massive[i] + "=" + result);
            }
        }
    }
}
