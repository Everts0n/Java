package com.company;

import java.util.Arrays;

public class main13 {
    public static void main(String[] args){
        int result;
        result = 0;
        int [] array = new int[] {1,2,3,4,55,3,3,3,3,3,3,3,34,4,4,4,1,31,3,54,554,31,3};
        for(int i = 0; i < array.length; i++){
            result = result+array[i];
            if(i < array.length - 1) {
                System.out.print(array[i] + "+");
            }else{
                System.out.println(array[i] + "=" + result);
            }
        }
        for(int i = 0; i < array.length; i++) {
            if(i % 2 == 1 ){
                array[i] = 0;
            }

        }
        System.out.print(Arrays.toString(array));

//        result = array[0]+array[1]+array[2]+array[3]+array[4];
//        System.out.print(result);
    }
}
