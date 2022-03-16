package com.company;

public class Main22 {
    public static void main(String[] args){
        //0 1 1 2 3 5 8 13 21 34
        int num1,num2,num3;
        num1 = 0;
        num2 = 1;
        System.out.print("0 1");
        for(int i = 0; i < 11; i++){

            num3 = num1 + num2;

            num1 = num2;
            num2 = num3;

        System.out.print(" " + num3);
        }
    }
}
