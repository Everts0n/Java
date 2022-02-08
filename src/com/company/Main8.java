package com.company;

public class Main8 {
    public static void main(String[] args){
        System.out.println("Even Numbers: ");
        for(int i = 100; i>=2; i-=2){
            if(i>2){
                    System.out.print(i + " ");
            }else{
                System.out.println(i);
            }
        }
        System.out.println("Odd numbers: ");
        for(int i = 1; i<100; i+=2){
                System.out.print(i + " ");
        }
    }
}
