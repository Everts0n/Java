package com.company;

public class Main26 {
    public static void main(String[] args){
        int arr[] = {5,6,7};
        int  [] array = new int[10];
        try{
            array[10] = 5;
            int x = 100/0;
            System.out.println(arr[5]);
            System.out.println(x);
        }catch (Exception e){
            System.out.println("Some Error" + e);
        }finally {
            System.out.println("Finish");
        }
    }
}
