package com.company;

public class PParametrs {
    class core{
        String core = "Switched off";

        public void working(){
            core = "working";
            System.out.println("Core is " + core);
        }

        public void NotWorking(){
            core = "not working";
            System.out.println("Core " + core);
        }
    }
    class memory{
        String memory = "Switched off";
        int speed = 3200;

        public void working(){
            memory = "working";
            speed = 3200;
            System.out.println("Memory is " + memory + " with speed " + speed + " MHz");

        }
        public void NotWorking(){
            memory = "sleep down";
            speed = 0;
            System.out.println("Memory " + memory + " and speed " + speed);
        }
    }
    core IntelCore = new core();
    memory Ram = new memory();
}
