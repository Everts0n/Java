package com.company;

public class Exam5main {
    public static void main(String[] args){
        Exam5mebel furniture = new Exam5mebel();

        System.out.print("Bed: " + furniture.BedP.color);
        System.out.println("," + furniture.BedP.weight + "kg");
        System.out.println(furniture.TableP.shape);
        System.out.println(furniture.TableP.price);
        System.out.println(furniture.ClosetP.height);
        System.out.println(furniture.ClosetP.size);
    }
}
