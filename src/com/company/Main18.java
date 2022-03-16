package com.company;

public class Main18 {
    public static void main(String[] args){
        int num = 2;

        while(true){
            System.out.print(" " + num);
            num = num*2;

            if(num>1025){
                break;
            }
        }

    }
}
