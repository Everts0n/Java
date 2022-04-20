package com.company;

public class Main33 {
    public static void main(String[] args){
        float[] massive = new float[] {434.3f,12.5f,393.1f,99.9f,216.7f};
        System.out.print(math(massive));
    }

    public static float math(float[] num){
        float result = 0;
        for(int i = 0; i < num.length; i++){
            result = result + num[i];

        }
        return result;
    }

}
