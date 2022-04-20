package com.company;

public class PhoneMain {
    public static void main(String[] args){
        PhoneDemo phone1 = new PhoneDemo();
        PhoneDemo2 phone2 = new PhoneDemo2("+372 5940205", 700, "Apple");
        PhoneDemo2 phone3 = new PhoneDemo2();
        PhoneDemo2 phone4 = new PhoneDemo2("+372 51910442", "Xiaomi");
        PhoneDemo3 phone5 = new PhoneDemo3();
        PhoneDemo3 phone6 = new PhoneDemo3("+372 5939201", 500, "LG");
        PhoneParametrs phone7 = new PhoneParametrs("+372 4949229", 2000, "Iphone", "IOS", 8, 256);
        phone1.number = "+372 58493029";
        phone1.model = "Samsung";
        phone1.price = 600;

        phone1.calling("Dad");
        System.out.println(phone2.model);
        System.out.println(phone2.number);

//        System.out.println(phone6.number);
        System.out.println(phone6.price);
        System.out.println(phone6.model);
        System.out.println(phone6.getNumber());

        System.out.println(phone7.price);
    }
}
