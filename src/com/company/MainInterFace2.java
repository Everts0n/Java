package com.company;

public class MainInterFace2 {
    public static void main(String[] args){
        Array2 a = new MyArray2();
        System.out.println(a.Add(5));
        System.out.println(a.Add(10));
        System.out.println(a.Add(15));
        System.out.println(a.Add(20));
        System.out.println(a.Add(25));
        System.out.println(a.Get(0));
        System.out.println(a.Get(1));


        Array2 b1 = new MyArray2();
        System.out.println(b1.Add("Artur"));
        System.out.println(b1.Add("Edvard"));
        System.out.println(b1.Add("Mia"));
        System.out.println(b1.Add("Dasha"));

        Array2 a1 = new MyArray2();
        System.out.println(a1.Add("Katya"));
        System.out.println(a1.Add("Masha"));
        System.out.println(a1.Add("Ivan"));
        System.out.println(a1.Add("Misha"));

        b1.GetNames("1B");
        a1.GetNames("1A");
    }
}
