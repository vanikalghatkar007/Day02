package com.oops;

public class Inheritance {
    public static void main(String[] args) {
        // Creating object of the child class
        Dog myDog = new Dog();

        // Accessing methods from both parent and child classes
        myDog.eat();
        myDog.bark();
    }
}

// Parent class
 class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}