package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class main11 {
    public static void main(String[] args) {
        int[] massive;
        int n;
        int count = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter length of massive: ");
        n = scn.nextInt();
        massive = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter massive[" + i + "] = ");
            massive[i] = scn.nextInt();
            if(massive[i] > 50){
                count++;
            }
        }
        System.out.println("Array : " + Arrays.toString(massive));
        int [] massive2 = new int[count];
        int index = 0;
        for(int i = 0; i<n; i++){
            if (massive[i] > 50){
                massive2[index] = massive[i];
                index++;
            }
        }
        System.out.print("All values > 50: " + Arrays.toString(massive2));
    }
}
