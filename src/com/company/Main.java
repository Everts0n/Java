package com.company;

public class Main {

    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 5;
        num2 = 4;
        num3 = num1 + num2;

        if(num3 == 15){
            System.out.println("num3 is 15");
        }else if(num3 > 10) {
            System.out.print("num3 is bigger than 10");
        }else if (num3 == 9){
            System.out.print("Num3 is 9");
        }else{
            System.out.print("num3 is some number");
        }
    }
}