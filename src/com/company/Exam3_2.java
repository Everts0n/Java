package com.company;

import java.util.Arrays;

public class Exam3_2 implements Exam3_1{
        String country;

        Exam3_2(String country){
            this.country = country;
        }

        @Override
        public void Country(){
            System.out.print("Country is: " + country);
        }
    }

