package com.company;

public class Main27 {
    public static void main(String[] args){
        int num = 0;
        boolean IsTrue = true;

        do{
            num++;
            System.out.println(num);
            if (num >= 10){
                IsTrue = false;
            }
        }while (IsTrue);

        int num2 = 5;
        do{
            num2++;
            System.out.println(num2);
        }while (num2 > 10);
    }
}
