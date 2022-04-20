package com.company;

public class MyPrint implements Print,Read {
    String mark;
    String model;
    String vehicle;
    int price;

    MyPrint(String mark, String model){
        this.mark = mark;
        this.model = model;
    }
    MyPrint(String vehicle, String model, int price){
        this.vehicle = vehicle;
        this.model = model;
        this.price = price;
    }
    MyPrint(){

    }

    public void printBike(){
        System.out.println(vehicle + model + price);
    }
    public void readBike(){
        System.out.println("Yaamaho");
    }

    public void printCar(){
        System.out.println(mark + " " + model);
    }
    public void readCar(){
        System.out.println("Bmw 5");
    }
}
