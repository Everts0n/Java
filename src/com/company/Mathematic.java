package com.company;

public class Mathematic {
    public static void main(String[] args){

        //Рандомное целое число с лимитом
        int num;
        num = (int)Math.round(Math.random()*101);
        System.out.println("Math random " + num);

        //Обычное округление
        float num2 = 5.6f;
        System.out.println("Math round " + Math.round(num2));

        //Округляет до полного меньшего числа
        float num3 = 6.999f;
        System.out.println("Math Floor " + Math.floor(num3));

        //Округляет до полного следующего числа
        float num4 = 6.2f;
        System.out.println("Math ceil " + Math.ceil(num4));

        //Показывает максимальное число из двух
        int num5 = 100;
        int num6 = 200;
        System.out.println("Maximum " + Math.max(num5,num6));

        //Показывает минимальное число из двух
        int num7 = 60;
        int num8 = 40;
        System.out.println("Minimum " + Math.min(num7,num8));

        // Корень
        int num9 = 9;
        System.out.print("Sqrt " + Math.sqrt(num9));

    }
}
