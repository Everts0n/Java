package com.company;

public class Main31 {
    public static void main(String[] args){
        System.out.println(function1(20,40));
        System.out.print(function2(100,50));
    }
    public static int function1(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }
    public static int function2(int num1, int num2){
        int result;
        result = num1 - num2;
        return result;
    }
}
