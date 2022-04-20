package com.company;

import java.util.ArrayList;

public class Main28 {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("Bmw");
        cars.add("Lexus");
        System.out.print(cars);
        System.out.println(cars.get(2));
        //Получить и вывести конкретный индекс
        cars.set(0, "Lamborghini");
        //Перезаписать конкретный индекс
        System.out.print(cars.size());
        //Вывести длинну листа
        cars.remove(1);
        //Удалить конкретный индекс
        cars.clear();
        //Полностью очистить лист

    }
}
