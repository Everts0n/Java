package com.company;

import java.lang.reflect.Parameter;

public class Phone {
    public static void main(String[] args) {


        PParametrs phone1 = new PParametrs();

        System.out.println(phone1.IntelCore.core);
        System.out.println(phone1.Ram.memory);
        phone1.IntelCore.working();
        phone1.Ram.working();

        phone1.IntelCore.NotWorking();
        phone1.Ram.NotWorking();

    }
}
