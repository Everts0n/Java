package com.company;

import java.util.Arrays;

public class Main34 {
    public static void main(String[] args){
        int length = 100;
        int[] simplenum = new int[length];
        int n = 0;

        for (int i = 0; n<length; i++){
            if(simplenumber(i)){
                simplenum[n] = i;
                n++;
            }
        }
        System.out.println(Arrays.toString(simplenum));

        int simplepow = simplenum[99] * simplenum[99];
        int[] tennum = new int[10];
        int m = 0;
        for(int i = simplepow; m < 10; i++){
            if(simplenumber(i)){
                tennum[m] = i;
                m++;
            }
        }
        System.out.println(simplepow);
        System.out.println(Arrays.toString(tennum));
    }

    public static boolean simplenumber(int a){
        if (a <= 1){
            return false;
        }
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
}
