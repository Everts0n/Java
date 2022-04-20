package com.company;

public class Main35 {
    public static int summa (int a, int b){
        return a+b;
    }

    public static int summa (int a, int b, int c){
        int summa;
        summa = a+b+c;
        return summa;
        //Or - return a+b+c;
    }

    public static float summa (float a, float b, float c){
        return a+b+c;
    }

    public static float summa (float a, int b, int c){
        return a+b+c;
    }

    public static boolean summa (int a, int b, int c, int d){
        int summa = a+b+c+d;
        if (summa >= 20 && summa <= 30 ){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args){
        System.out.println(summa(5,5));
        System.out.println(summa(10,10,10));
        System.out.println(summa(5.5f,10.2f,4.8f));
        System.out.println(summa(1.1f,6,9));
        System.out.println(summa(5,5,5,4));

    }
}
