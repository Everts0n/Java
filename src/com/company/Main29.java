package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main29 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(1);
        numbers.add(13);

//        Collections.sort(numbers);
        //Сортировка от меньшего к большему

       //Collections.sort(numbers, Collections.reverseOrder());
        //Сортировка от большего к меньшему
        for (int element : numbers){
            System.out.print(element + " ");
        }

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Lexus");
        cars.add("Porsche");
        cars.add("Ford");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Toyota");
        Collections.sort(cars);
        System.out.print(cars);


    }
}
