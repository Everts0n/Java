package com.company;

public class Main32 {
    public static void main(String[] args){
        int[] numbers = new int[] {4,25,6,2,22,100,99,54,101};
        int[] numbers2 = new int[] {5,6545,23,1212,43,45,43453};
        System.out.println("Max value is: " + getMaxValue(numbers2));
        System.out.println("Min value is: " + getMinValue(numbers));
        System.out.println("Max value is: " + getMaxValue(numbers));
    }
    public static int getMaxValue(int[] num){
        int max;
        max = num[0];
        for (int i = 1; i < num.length; i++){
            if (max<num[i]){
                max = num[i];
            }
        }
        return max;
    }

    public static int getMinValue(int[] num){
        int min;
        min = num[0];
        for (int i = 1; i < num.length; i++){
            if (min>num[i]){
                min = num[i];
            }
        }
        return min;
    }

}
