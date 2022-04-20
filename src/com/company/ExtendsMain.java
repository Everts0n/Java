package com.company;

public class ExtendsMain {
    public static void main(String[] args){
        Shape[] arr = new Shape[]{new Triangle(), new Circle(), new Square()};


        for(int i = 0; i< arr.length; i++){
            arr[i].draw();
        }
    }
}
