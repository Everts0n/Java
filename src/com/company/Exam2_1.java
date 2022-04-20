package com.company;

public class Exam2_1 {
    public static void main(String[] args){
        Exam2_4 Phone = new Exam2_4("Iphone", "IOS", 1200);
        Exam2_3 Person = new Exam2_3("Dima", "Zaygolnikov", 34);
        Exam2_2 Animal = new Exam2_2("Elephant", "Loli",21);

        System.out.println(Phone.phone);
        System.out.println(Phone.system);
        System.out.println(Phone.price);
    }
}
