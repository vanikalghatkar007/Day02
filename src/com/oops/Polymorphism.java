package com.oops;

public class Polymorphism {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        // Calling the draw method (polymorphism)
        shape1.draw();
        shape2.draw();
    }
}

    // Parent class
    class Shape {
        void draw() {
            System.out.println("Drawing a shape");
        }
    }

    // Child classes with overridden method
    class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a circle");
        }
    }

    class Square extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a square");
        }
    }


