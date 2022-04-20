package com.company;

public class Exam4 {
    public static void main(String[] args){
        int r;
        r = (int)Math.round(Math.random()*100);
        System.out.print(random(r));
    }

    public static boolean random(int r){
        if(r < 50){
            return true;
        }else{
            return false;
        }

    }
}
