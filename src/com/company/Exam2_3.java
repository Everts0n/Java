package com.company;

public class Exam2_3 extends Exam2_2 {

    Exam2_3(String name, String surname, int age){
        super(name,surname,age);
        super.name = name;
        super.surname = surname;
        super.age = age;
    }
}
