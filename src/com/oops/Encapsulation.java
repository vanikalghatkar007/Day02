package com.oops;

public class Encapsulation {
    public static void main(String[] args) {
        // Creating an object
        Person person = new Person();

        // Using setter methods
        person.setName("John");
        person.setAge(25);

        // Using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
    // Class with encapsulation
    class Person {
        private String name;
        private int age;

        // Getter and setter methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Invalid age");
            }
        }
    }