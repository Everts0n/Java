package com.company;

public class Person {
    public static void main(String[] args){
        PersonDemo user1 = new PersonDemo();
        PersonDemo user2 = new PersonDemo();

        System.out.println(user1.username);
        System.out.println(user1.height);

        user2.username = "C0mrade";
        user2.height = 180;
        System.out.println(user2.username);
        System.out.println(user2.height);

        user1.say("Jimmy");

        PersonDemo mob1 = new PersonDemo();

        System.out.println(mob1.mob);
        System.out.println(mob1.hp + "hp");
        System.out.println(mob1.damage + "damage");
        System.out.println(mob1.speed + "speed");


    }
}
