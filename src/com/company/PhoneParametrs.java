package com.company;

public class PhoneParametrs extends PhoneDemo3{
    String system;
    int core;
    int memory;

    PhoneParametrs(String system, int core, int memory){
        this.system = system;
        this.core = core;
        this.memory = memory;
    }

    PhoneParametrs(String number, int price, String model, String system, int core, int memory){
        super(number, price, model);
        this.system = system;
        this.core = core;
        this.memory = memory;
    }
}
