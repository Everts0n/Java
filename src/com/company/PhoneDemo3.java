package com.company;

public class PhoneDemo3 {
    String number;
    int price;
    String model;

    PhoneDemo3(){

    }

    PhoneDemo3(String number, int price, String model){
        this.number = number;
        this.price = price;
        this.model = model;
    }
    public String getNumber(){
        return number;
    }
}
