package com.company;

public class AbstractMain {
    public static void main(String[] args){
        ShapeAbstract circle = new ACircle();
        ShapeAbstract square = new ASquare();
        ShapeAbstract triangle = new ATriangle();

        circle.draw();
        square.draw();
        triangle.draw();
    }
}
