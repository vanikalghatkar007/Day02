package com.oops;

public class Oops {
    // Creating and using objects
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Accord", 2021);

        // Using object methods
        car1.displayInfo();
        car2.displayInfo();
    }
}
    // Class definition
    class Car {
        // Fields
        String brand;
        String model;
        int year;

        // Constructor
        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        // Method
        public void displayInfo() {
            System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
        }
    }




