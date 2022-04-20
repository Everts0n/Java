package com.company;

public class MainInterface {
    public static void main(String[] args){
        Read car1 = new MyPrint("Audi", "A6");
        Print bike1 = new MyPrint("Bike","Shootaro", 100000);
        Read bike2 = new MyPrint();
        Print car2 = new MyPrint("Audi", "A8");

        bike1.printBike();
        bike2.readBike();
        car2.printCar();
        car1.readCar();
    }
}
