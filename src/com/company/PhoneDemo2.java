package com.company;

public class PhoneDemo2 {
    String number;
    int price;
    String model;

    PhoneDemo2(){

    }

    PhoneDemo2(String n, String m){
        number = n;
        model = m;
    }

    PhoneDemo2(String n, int p, String m){
        number = n;
        price = p;
        model = m;
    }
}
